
package hotel_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CLIENTS {
    Connector connecting = new Connector();
    
    public boolean addClients(String fName,String lName,String phone, String email) throws SQLException
   {
      
      
      PreparedStatement pst;
      Connection conn = connecting.createConnection();
      String sql = "Insert into clients(fName,lName,phone,email) values(?,?,?,?)";
      pst = conn.prepareStatement(sql);
      pst.setString(1,fName);
      pst.setString(2,lName);
      pst.setString(3,phone);
      pst.setString(4,email);
      
      return pst.executeUpdate() > 0;
       
      
   }
    
    
    public boolean editClient( int id, String fName,String lName,String phone,String email){
        try {
            PreparedStatement pst;
            Connection conn = connecting.createConnection();
            String sql = "UPDATE `clients` SET `fName`=?,`lName`=?,`phone`=?,`email`=? WHERE `id` = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,fName);
            pst.setString(2,lName);
            pst.setString(3,phone);
            pst.setString(4,email);
            pst.setInt(5,id);
          
            
            
                return pst.executeUpdate() > 0;
           
             } catch (SQLException ex) {
            Logger.getLogger(CLIENTS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean removeClient(int id){
         try {
            PreparedStatement pst;
            Connection conn = connecting.createConnection();
            String sql = "DELETE FROM `clients` WHERE `id` = ?";
            pst = conn.prepareStatement(sql);
           
            pst.setInt(1,id);
            
            
            return pst.executeUpdate() > 0;
           
             } catch (SQLException ex) {
            Logger.getLogger(CLIENTS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public void fillClientTable(JTable table){
        
        try {
            PreparedStatement pst;
            ResultSet rs;
            
            Connection conn = connecting.createConnection();
            String sql = "select * from clients";
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            DefaultTableModel model =  (DefaultTableModel) table.getModel();
            while(rs.next()){
                Object[] row = new Object[5];
                
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CLIENTS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    
    
}
