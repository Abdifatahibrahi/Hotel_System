/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_system;

import javax.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.*;
import java.sql.Time;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;







/**
 *
 * @author Abdelfatah Ibrahim
 */
public class ManageReservations extends javax.swing.JFrame {

    /**
     * Creates new form ManageReservations
     */
    RESERVATIONS reservations = new RESERVATIONS();
    public ManageReservations() {
        initComponents();
        reservations.fillReservationTable(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtClientId = new javax.swing.JTextField();
        lblClientId = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnClearFields = new javax.swing.JButton();
        btnEditReservation = new javax.swing.JButton();
        btnRemoverReservation = new javax.swing.JButton();
        btnaddReservation = new javax.swing.JButton();
        btnReferesh = new javax.swing.JButton();
        jDateChooserOUT = new com.toedter.calendar.JDateChooser();
        jDateChooserIN = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Reservation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        txtid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtClientId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblClientId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClientId.setForeground(new java.awt.Color(255, 255, 255));
        lblClientId.setText("Client Id:");

        txtRoomNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room No:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date in:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date out:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ReservationId", "ClientId", "RoomNo", "DateIn", "DateOut"
            }
        )
        {public boolean isCellEditable(int row,int col){ return false;}}
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    btnClearFields.setBackground(new java.awt.Color(255, 0, 204));
    btnClearFields.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnClearFields.setForeground(new java.awt.Color(255, 255, 255));
    btnClearFields.setText("Clear fields");
    btnClearFields.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearFieldsActionPerformed(evt);
        }
    });

    btnEditReservation.setBackground(new java.awt.Color(255, 255, 0));
    btnEditReservation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnEditReservation.setText("Edit");
    btnEditReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnEditReservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEditReservationActionPerformed(evt);
        }
    });

    btnRemoverReservation.setBackground(new java.awt.Color(255, 255, 0));
    btnRemoverReservation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnRemoverReservation.setText("Remove");
    btnRemoverReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnRemoverReservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRemoverReservationActionPerformed(evt);
        }
    });

    btnaddReservation.setBackground(new java.awt.Color(255, 255, 0));
    btnaddReservation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnaddReservation.setText("Add new Reservation");
    btnaddReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnaddReservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnaddReservationActionPerformed(evt);
        }
    });

    btnReferesh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btnReferesh.setText("Refresh");
    btnReferesh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRefereshActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblClientId)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(5, 5, 5))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnaddReservation)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnRemoverReservation))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnClearFields, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooserOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDateChooserIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRoomNo)))
                            .addGap(6, 6, 6)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addComponent(btnReferesh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(19, 19, 19))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblClientId))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jDateChooserIN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jDateChooserOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(97, 97, 97)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditReservation)
                        .addComponent(btnRemoverReservation)
                        .addComponent(btnaddReservation))
                    .addGap(53, 53, 53)
                    .addComponent(btnClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnReferesh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            int selectedFile = jTable1.getSelectedRow();
            txtid.setText(df.getValueAt(selectedFile, 0).toString());
            txtClientId.setText(df.getValueAt(selectedFile, 1).toString());
            txtRoomNo.setText(df.getValueAt(selectedFile, 2).toString());
            Date datein = new SimpleDateFormat("yyyy-MM-dd").parse(df.getValueAt(selectedFile,3).toString());
            jDateChooserIN.setDate(datein);
            
            Date dateOut = new SimpleDateFormat("yyyy-MM-dd").parse(df.getValueAt(selectedFile,4).toString());
            jDateChooserOUT.setDate(datein);
 //       jDateChooserIN.setDate(df.getValueAt(selectedFile, 3).toString());
//        txtemail.setText(df.getValueAt(selectedFile, 4).toString());
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFieldsActionPerformed
        txtid.setText("");
        txtClientId.setText("");
        txtRoomNo.setText("");
        jDateChooserIN.setDate(null);
        jDateChooserOUT.setDate(null);
        
    }//GEN-LAST:event_btnClearFieldsActionPerformed

    private void btnEditReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditReservationActionPerformed
        
        
            try{
               int id = Integer.valueOf(txtid.getText());
               int RoomNo = Integer.valueOf(txtRoomNo.getText());
               int clientNo = Integer.valueOf(txtClientId.getText());
               SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
               String dateIn = dateformat.format(jDateChooserIN.getDate());
               String dateOut = dateformat.format(jDateChooserOUT.getDate());
                if(reservations.editReservedRoom(id,RoomNo,clientNo,dateIn,dateOut)){
                    JOptionPane.showMessageDialog(rootPane,"Reserved room updated","update Room",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane,"Reservation not updated","update reservation error",JOptionPane.ERROR_MESSAGE);

                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter the Reservation id","reservation error",JOptionPane.ERROR_MESSAGE);
            }
            
            catch(NullPointerException ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Select the dateIN and OUT","date error",JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_btnEditReservationActionPerformed

    private void btnRemoverReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverReservationActionPerformed
        try{
            int id = Integer.valueOf(txtid.getText());
            if(reservations.deleteReservation(id)){
                JOptionPane.showMessageDialog(rootPane,"room reservation deleted","delete reservation",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"reservation not deleted","delete reservation error",JOptionPane.ERROR_MESSAGE);

            }
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter the reservation id","reservation error",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnRemoverReservationActionPerformed

    private void btnaddReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddReservationActionPerformed
       try{
           
        int clientId = Integer.valueOf(txtClientId.getText());
        int roomNo = Integer.valueOf(txtRoomNo.getText());
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String dateIn = dateformat.format(jDateChooserIN.getDate());
        String dateOut = dateformat.format(jDateChooserOUT.getDate());
      
            if(reservations.addReservedRoom(clientId, roomNo, dateIn, dateOut)){
                JOptionPane.showMessageDialog(rootPane,"new Reservation added succesfully","Add reserve",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"client not added","Add client error",JOptionPane.ERROR_MESSAGE);
            }
                   }
                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage() + "Enter the client Number","Client error",JOptionPane.ERROR_MESSAGE);
                    }
        
    }//GEN-LAST:event_btnaddReservationActionPerformed

    private void btnRefereshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefereshActionPerformed
       jTable1.setModel(new DefaultTableModel(null,new Object[]{"ReservationId","ClientId","RoomNo","DateIn","DateOut"}));
       reservations.fillReservationTable(jTable1);
    }//GEN-LAST:event_btnRefereshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReservations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearFields;
    private javax.swing.JButton btnEditReservation;
    private javax.swing.JButton btnReferesh;
    private javax.swing.JButton btnRemoverReservation;
    private javax.swing.JButton btnaddReservation;
    private com.toedter.calendar.JDateChooser jDateChooserIN;
    private com.toedter.calendar.JDateChooser jDateChooserOUT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblClientId;
    private javax.swing.JTextField txtClientId;
    private javax.swing.JTextField txtRoomNo;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}