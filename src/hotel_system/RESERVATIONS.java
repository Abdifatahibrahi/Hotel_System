
package hotel_system;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class RESERVATIONS {
      ROOMS rooms = new ROOMS();
      Connector myconnection = new Connector();
    public boolean addReservedRoom(int clientID,int roomNumber,String dateIn, String dateOut){
          try {
              Connection conn = myconnection.createConnection();
              PreparedStatement pst = conn.prepareStatement("INSERT INTO `reservations`( `client_id`, `room_No`, `date_in`, `date_out`) VALUES (?,?,?,?)");
              pst.setInt(1,clientID);
              pst.setInt(2,roomNumber);
              pst.setString(3,dateIn);
              pst.setString(4,dateOut);
              
              if(pst.executeUpdate() > 0){
                  rooms.setRoomToReserved(roomNumber, "Yes");
                  return true; 
                  
              }
              else{
                  return false;
              }
              
          } catch (SQLException ex) { 
              Logger.getLogger(RESERVATIONS.class.getName()).log(Level.SEVERE, null, ex);
              return false;
          }
        
    }
    
     public boolean editReservedRoom(int reservationNo,int clientID,int roomNumber,String dateIn, String dateOut){
          try {
              Connection conn = myconnection.createConnection();
              PreparedStatement pst = conn.prepareStatement("UPDATE `reservations` SET `client_id`=?,`room_No`=?,`date_in`=?,`date_out`=? WHERE `id` = ?");
             
              pst.setInt(1,clientID);
              pst.setInt(2,roomNumber);
              pst.setString(3,dateIn);
              pst.setString(4,dateOut);
              pst.setInt(5,reservationNo);
              
              return pst.executeUpdate() > 0; 
          } catch (SQLException ex) {
              Logger.getLogger(RESERVATIONS.class.getName()).log(Level.SEVERE, null, ex);
              return false;
          }
        
    }
      public boolean deleteReservation(int reservationNo){
            try {
            PreparedStatement pst;
            Connection conn = myconnection.createConnection();
            pst = conn.prepareStatement("DELETE FROM `reservations` WHERE `id` = ?");
            pst.setInt(1, reservationNo);
            
            if(pst.executeUpdate() > 0){
                  
                  return true; 
                  
              }
              else{
                  return false;
              }
             } catch (SQLException ex) {
            Logger.getLogger(CLIENTS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      }
      
      public void fillReservationTable(JTable table){
          try {
              PreparedStatement pst;
              ResultSet rs;
              Connection conn = myconnection.createConnection();
              pst = conn.prepareStatement("SELECT * FROM `reservations` ");
              rs = pst.executeQuery();
              DefaultTableModel model = (DefaultTableModel) table.getModel();
              Object[] row;
              
              while(rs.next()){
                 row = new Object[5];
                 
                 row[0] = rs.getInt(1);
                 row[1] = rs.getInt(2);
                 row[2] = rs.getInt(3);
                 row[3] = rs.getString(4);
                 row[4] = rs.getString(5);
                 model.addRow(row);
              }
              
          } catch (SQLException ex) {
              Logger.getLogger(RESERVATIONS.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
        
  
}
