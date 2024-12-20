/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.ui;

import hotel.database.DatabaseConnection;
import hotel.guest.Guest;
import hotel.guest.Guests;
import hotel.room.Room;
import hotel.room.RoomFactory;
import hotel.ui.UIHelper.ImagePaths;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class NewGuest extends javax.swing.JFrame {

    //private String roomNumber;
    /**
     * Creates new form CheckIn
     */
    //*******************************************************************//
    //*******************************************************************//
    //          This Method sets the window display properties.          //
    //*******************************************************************//
    //*******************************************************************//
    private void customizeFrameAppearance() {
        //Change the frame
        this.getContentPane().setBackground(new java.awt.Color(240, 240, 240));
        //Change frame size
        this.setSize(400, 300);
        // Change frame address
        this.setTitle("Hotel Management - New Guest");
        //  Change the Frame Icon
        ImageIcon appIcon = new ImageIcon("src/images/check-in.png");
        this.setIconImage(appIcon.getImage());

    }

    public NewGuest() {
        customizeFrameAppearance();
        initComponents();
        // Customize Buttons using the shared Function
        UIHelper.setLabelProperties(CheckInPageLabel, "New Guest", ImagePaths.CHECK_IN_ICON);
//      UIHelper.setLabelProperties(PearsonalDataLabel, "Pearsonal Data", ImagePaths.ParsonData_ICON);
        UIHelper.setLabelProperties(nameLabel, "name", ImagePaths.Name_ICON);
        UIHelper.setLabelProperties(phoneLabel, "phone", ImagePaths.Phone_ICON);
        UIHelper.setLabelProperties(EmailLabel, "Email", ImagePaths.Email_ICON);
        UIHelper.setLabelProperties(AddressLabel, "Address", ImagePaths.Address_ICON);
        UIHelper.setLabelProperties(CityLabel, "City", ImagePaths.City_ICON);
        UIHelper.setLabelProperties(NationalityLabel, "Nationality", ImagePaths.Nationality_ICON);
        UIHelper.setLabelProperties(Passport_no_Label, "Passport Number", ImagePaths.Passport_No_ICON);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomTypebuttonGroup = new javax.swing.ButtonGroup();
        roomCapasitybuttonGroup = new javax.swing.ButtonGroup();
        GuestTypebuttonGroup = new javax.swing.ButtonGroup();
        Pearsonal_Data_Panel = new javax.swing.JPanel();
        PearsonalDataLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        guestNameTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        guestPhoneTextField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        guestEmailField = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        guestAddressField = new javax.swing.JTextField();
        CityLabel = new javax.swing.JLabel();
        guestCityField = new javax.swing.JTextField();
        NationalityLabel = new javax.swing.JLabel();
        guestNationalityField = new javax.swing.JTextField();
        Passport_no_Label = new javax.swing.JLabel();
        guestPassportNumberField = new javax.swing.JTextField();
        CheckInPageLabel = new javax.swing.JLabel();
        SearchRoomButton = new javax.swing.JButton();
        backToHomeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PearsonalDataLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PearsonalDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PearsonalDataLabel.setText("Pearsonal Data");
        PearsonalDataLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PearsonalDataLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel.setText("Name");

        guestNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestNameTextFieldActionPerformed(evt);
            }
        });

        phoneLabel.setText("Phone");

        guestPhoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestPhoneTextFieldActionPerformed(evt);
            }
        });

        EmailLabel.setText("Email");

        guestEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestEmailFieldActionPerformed(evt);
            }
        });

        AddressLabel.setText("Address");

        guestAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestAddressFieldActionPerformed(evt);
            }
        });

        CityLabel.setText("City");

        guestCityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestCityFieldActionPerformed(evt);
            }
        });

        NationalityLabel.setText("Nationality");

        guestNationalityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestNationalityFieldActionPerformed(evt);
            }
        });

        Passport_no_Label.setText("Passport Number");

        guestPassportNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestPassportNumberFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pearsonal_Data_PanelLayout = new javax.swing.GroupLayout(Pearsonal_Data_Panel);
        Pearsonal_Data_Panel.setLayout(Pearsonal_Data_PanelLayout);
        Pearsonal_Data_PanelLayout.setHorizontalGroup(
            Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pearsonal_Data_PanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pearsonal_Data_PanelLayout.createSequentialGroup()
                        .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NationalityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Passport_no_Label))
                            .addComponent(CityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(guestNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(guestPhoneTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(guestEmailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guestAddressField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guestCityField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guestNationalityField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guestPassportNumberField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pearsonal_Data_PanelLayout.createSequentialGroup()
                        .addComponent(PearsonalDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        Pearsonal_Data_PanelLayout.setVerticalGroup(
            Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pearsonal_Data_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PearsonalDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(guestNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLabel)
                    .addComponent(guestPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailLabel)
                    .addComponent(guestEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressLabel)
                    .addComponent(guestAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CityLabel)
                    .addComponent(guestCityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guestNationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NationalityLabel))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guestPassportNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Passport_no_Label))
                .addGap(20, 20, 20))
        );

        CheckInPageLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CheckInPageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckInPageLabel.setText("New Guest");

        SearchRoomButton.setText("Save");
        SearchRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchRoomButtonActionPerformed(evt);
            }
        });

        backToHomeButton.setText("Back");
        backToHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backToHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(SearchRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pearsonal_Data_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(CheckInPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(CheckInPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pearsonal_Data_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guestNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestNameTextFieldActionPerformed

    private void guestPhoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestPhoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestPhoneTextFieldActionPerformed

    private void guestEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestEmailFieldActionPerformed

    private void guestAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestAddressFieldActionPerformed

    private void guestCityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestCityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestCityFieldActionPerformed

    private void guestNationalityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestNationalityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestNationalityFieldActionPerformed

    private void guestPassportNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestPassportNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestPassportNumberFieldActionPerformed

    private void SearchRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchRoomButtonActionPerformed
        // Get Value From Buttons
        //Storing Guest data from input Fields without searching for it in the database
        String guestName = guestNameTextField.getText();
        String guestPhone = guestPhoneTextField.getText();
        String guestEmail = guestEmailField.getText();
        String guestAddress = guestAddressField.getText();
        String guestCity = guestCityField.getText();
        String guestNationality = guestNationalityField.getText();
        String passportNumber = guestPassportNumberField.getText();

        Guest guest = new Guest.Builder()
                .setGuestName(guestName)
                .setGuestPhone(guestPhone)
                .setGuestEmail(guestEmail)
                .setGuestAddress(guestAddress)
                .setGuestCity(guestCity)
                .setGuestNationality(guestNationality)
                .setPassportNumber(passportNumber)
                .build();

        guest.save();

        Guests guests = Guests.getInstance();
        guests.addGuest(guest);

        this.dispose();
        GuestsList guestsList = new GuestsList();
        guestsList.setVisible(true);
    }//GEN-LAST:event_SearchRoomButtonActionPerformed

    private void backToHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeButtonActionPerformed
        // Close Check In page
        this.dispose();
        // Opening Home apge
        GuestsList guestsList = new GuestsList();
        guestsList.setVisible(true);
    }//GEN-LAST:event_backToHomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewGuest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel CheckInPageLabel;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.ButtonGroup GuestTypebuttonGroup;
    private javax.swing.JLabel NationalityLabel;
    private javax.swing.JLabel Passport_no_Label;
    private javax.swing.JLabel PearsonalDataLabel;
    private javax.swing.JPanel Pearsonal_Data_Panel;
    private javax.swing.JButton SearchRoomButton;
    private javax.swing.JButton backToHomeButton;
    private javax.swing.JTextField guestAddressField;
    private javax.swing.JTextField guestCityField;
    private javax.swing.JTextField guestEmailField;
    private javax.swing.JTextField guestNameTextField;
    private javax.swing.JTextField guestNationalityField;
    private javax.swing.JTextField guestPassportNumberField;
    private javax.swing.JTextField guestPhoneTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.ButtonGroup roomCapasitybuttonGroup;
    private javax.swing.ButtonGroup roomTypebuttonGroup;
    // End of variables declaration//GEN-END:variables

    private void showRoomDetailsDialogWindowActivated(ActionEvent evt, int roomNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
