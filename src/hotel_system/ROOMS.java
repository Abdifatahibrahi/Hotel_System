
package hotel_system;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ROOMS {
    Connector connector = new Connector();
    public void Fill_All_Room_Table(JTable table){
        try {
            ResultSet rs;
             
            PreparedStatement pst = connector.createConnection().prepareStatement("SELECT * FROM `roomtype`");
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while(rs.next()){
                row = new Object[3];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                                
                model.addRow(row);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ROOMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Fill_Room_ComboBox(JComboBox combobox){
        try {
            ResultSet rs;
             
            PreparedStatement pst = connector.createConnection().prepareStatement("SELECT * FROM `roomtype`");
            rs = pst.executeQuery();
           
            
            while(rs.next()){
            combobox.addItem(rs.getInt(1));
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ROOMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void fillRoomTable(JTable table){
        try {
            ResultSet rs;
            
            PreparedStatement pst = connector.createConnection().prepareStatement("SELECT * FROM `rooms`");
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            rs = pst.executeQuery();
            Object[] row;
            while(rs.next()){  
               row = new Object[5];
               row[0] = rs.getInt(1); 
               row[1] = rs.getInt(2);
               row[2] = rs.getString(3);
               row[3] = rs.getString(4);
              
               
               model.addRow(row);
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(ROOMS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public boolean addRoom(int rNumber, int type, String phone){
         try {
         
             
            PreparedStatement pst = connector.createConnection().prepareStatement("INSERT INTO `rooms`(`R_No`, `type`, `phone`, `reserved`) VALUES (?,?,?,?)");
            pst.setInt(1,rNumber );
            pst.setInt(2,type);
            pst.setString(3,phone);
            pst.setString(4, "No");
            
            return (pst.executeUpdate() > 0);
           
        } catch (SQLException ex) {
            Logger.getLogger(ROOMS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        
      public boolean editRoom( int roomNumber, int roomType ,String phone,String isReserved){
          
           PreparedStatement pst;
            String sql = "UPDATE `rooms` SET `type`=?,`phone`=?,`reserved`=? WHERE `R_No` = ?";
        try {
           
            pst = connector.createConnection().prepareStatement(sql);
            
            pst.setInt(1,roomType);
            pst.setString(2,isReserved);
            pst.setString(3,phone);
            pst.setInt(4,roomNumber);
           
            return pst.executeUpdate() > 0;
           
             } catch (SQLException ex) {
            Logger.getLogger(CLIENTS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
       
      public boolean deleteRoom(int id){
            try {
            PreparedStatement pst;
            Connection conn = connector.createConnection();
            pst = conn.prepareStatement("DELETE FROM `rooms` WHERE `R_No` = ?");
            pst.setInt(1, id);
            
            return pst.executeUpdate() > 0;
            
             } catch (SQLException ex) {
            Logger.getLogger(CLIENTS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      }
        
      public boolean setRoomToReserved( int number,String isReserved ){
          
           PreparedStatement pst;
            String sql = "UPDATE `rooms` SET 'reserved`=? WHERE `R_No` = ?";
        try {
           
           pst = connector.createConnection().prepareStatement(sql);
           
           
           pst.setString(1,isReserved);
           pst.setInt(2, number);
           
           return (pst.executeUpdate() > 0);
           
             } catch (SQLException ex) {
            Logger.getLogger(CLIENTS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
}
