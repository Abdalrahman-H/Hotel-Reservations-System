/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.ui;

import hotel.database.DatabaseConnection;
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


public class CheckIn extends javax.swing.JFrame {

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
        this.setTitle("Hotel Management - Check IN");
        //  Change the Frame Icon
        ImageIcon appIcon = new ImageIcon("src/images/check-in.png");  
        this.setIconImage(appIcon.getImage());

  }
    public CheckIn() {
        customizeFrameAppearance();
        initComponents();
        // Customize Buttons using the shared Function
        UIHelper.setLabelProperties(CheckInPageLabel, "Check In", ImagePaths.CHECK_IN_ICON);
//      UIHelper.setLabelProperties(PearsonalDataLabel, "Pearsonal Data", ImagePaths.ParsonData_ICON);
        UIHelper.setLabelProperties(nameLabel, "name", ImagePaths.Name_ICON);
        UIHelper.setLabelProperties(phoneLabel, "phone", ImagePaths.Phone_ICON);
        UIHelper.setLabelProperties(EmailLabel, "Email", ImagePaths.Email_ICON);
        UIHelper.setLabelProperties(AddressLabel, "Address", ImagePaths.Address_ICON);
        UIHelper.setLabelProperties(CityLabel, "City", ImagePaths.City_ICON);
        UIHelper.setLabelProperties(NationalityLabel, "Nationality", ImagePaths.Nationality_ICON);
        UIHelper.setLabelProperties(Passport_no_Label, "Passport Number", ImagePaths.Passport_No_ICON);
        UIHelper.setButtonProperties(resetButton, "Reset", ImagePaths.Reset_ICON,true);
            
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
        jPanel2 = new javax.swing.JPanel();
        RoomdataLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        standardRoomRadioButton = new javax.swing.JRadioButton();
        deluxeRoomRadioButton = new javax.swing.JRadioButton();
        suiteRoomRadioButton = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        singleRoomRadioButton = new javax.swing.JRadioButton();
        doubleRoomRadioButton = new javax.swing.JRadioButton();
        tripleRoomRadioButton = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        checkInDateChooser = new com.toedter.calendar.JDateChooser();
        checkOutDateChooser = new com.toedter.calendar.JDateChooser();
        guestType = new javax.swing.JLabel();
        VIPRadioButton = new javax.swing.JRadioButton();
        regularRadioButton = new javax.swing.JRadioButton();
        corporateRadioButton = new javax.swing.JRadioButton();
        helpButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
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

        RoomdataLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        RoomdataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomdataLabel.setText("Room Data");

        jLabel10.setText("Room Type");

        roomTypebuttonGroup.add(standardRoomRadioButton);
        standardRoomRadioButton.setText("Standard");
        standardRoomRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardRoomRadioButtonActionPerformed(evt);
            }
        });

        roomTypebuttonGroup.add(deluxeRoomRadioButton);
        deluxeRoomRadioButton.setText("Deluxe");
        deluxeRoomRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deluxeRoomRadioButtonActionPerformed(evt);
            }
        });

        roomTypebuttonGroup.add(suiteRoomRadioButton);
        suiteRoomRadioButton.setText("Suite");
        suiteRoomRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suiteRoomRadioButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Room Capacity");

        roomCapasitybuttonGroup.add(singleRoomRadioButton);
        singleRoomRadioButton.setText("Single ");
        singleRoomRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleRoomRadioButtonActionPerformed(evt);
            }
        });

        roomCapasitybuttonGroup.add(doubleRoomRadioButton);
        doubleRoomRadioButton.setText("Double ");

        roomCapasitybuttonGroup.add(tripleRoomRadioButton);
        tripleRoomRadioButton.setText("Triple ");
        tripleRoomRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tripleRoomRadioButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("Check in Data");

        jLabel13.setText("Check out Data");

        checkInDateChooser.setToolTipText("1");

        checkOutDateChooser.setToolTipText("1");

        guestType.setText("Guest Type");

        GuestTypebuttonGroup.add(VIPRadioButton);
        VIPRadioButton.setText("VIP");
        VIPRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIPRadioButtonActionPerformed(evt);
            }
        });

        GuestTypebuttonGroup.add(regularRadioButton);
        regularRadioButton.setText("Regular");

        GuestTypebuttonGroup.add(corporateRadioButton);
        corporateRadioButton.setText("Corporate ");

        helpButton.setText("?");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(singleRoomRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(standardRoomRadioButton))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(doubleRoomRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(deluxeRoomRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tripleRoomRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addComponent(suiteRoomRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(corporateRadioButton)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(guestType, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(regularRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(VIPRadioButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(checkOutDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(RoomdataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(checkInDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(helpButton)))
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RoomdataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(standardRoomRadioButton)
                    .addComponent(deluxeRoomRadioButton)
                    .addComponent(suiteRoomRadioButton))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(singleRoomRadioButton)
                    .addComponent(doubleRoomRadioButton)
                    .addComponent(tripleRoomRadioButton))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(checkInDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOutDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VIPRadioButton)
                    .addComponent(regularRadioButton)
                    .addComponent(corporateRadioButton)
                    .addComponent(guestType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CheckInPageLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CheckInPageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckInPageLabel.setText("Check In");

        SearchRoomButton.setText("Search & Confirmation");
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
                .addGap(117, 117, 117)
                .addComponent(backToHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Pearsonal_Data_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CheckInPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(CheckInPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pearsonal_Data_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
    }//GEN-LAST:event_SearchRoomButtonActionPerformed

    private void backToHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeButtonActionPerformed
         // Close Check In page
        this.dispose();
        // Opening Home apge
        Home homePage = new Home();  
        homePage.reloadImages();
        homePage.setVisible(true);
    }//GEN-LAST:event_backToHomeButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        //Reset all Fields and Buttons
        checkInDateChooser.setCalendar(null);
        checkOutDateChooser.setCalendar(null);
        roomTypebuttonGroup.clearSelection();
        roomCapasitybuttonGroup.clearSelection();
        GuestTypebuttonGroup.clearSelection();

        // ADD ALL INPUT Field
    }//GEN-LAST:event_resetButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Select room type, capacity, and dates, then click Search.", "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpButtonActionPerformed

    private void VIPRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIPRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VIPRadioButtonActionPerformed

    private void tripleRoomRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tripleRoomRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tripleRoomRadioButtonActionPerformed

    private void singleRoomRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleRoomRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singleRoomRadioButtonActionPerformed

    private void suiteRoomRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suiteRoomRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suiteRoomRadioButtonActionPerformed

    private void deluxeRoomRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deluxeRoomRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deluxeRoomRadioButtonActionPerformed

    private void standardRoomRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardRoomRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standardRoomRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
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
    private javax.swing.JLabel RoomdataLabel;
    private javax.swing.JButton SearchRoomButton;
    private javax.swing.JRadioButton VIPRadioButton;
    private javax.swing.JButton backToHomeButton;
    private com.toedter.calendar.JDateChooser checkInDateChooser;
    private com.toedter.calendar.JDateChooser checkOutDateChooser;
    private javax.swing.JRadioButton corporateRadioButton;
    private javax.swing.JRadioButton deluxeRoomRadioButton;
    private javax.swing.JRadioButton doubleRoomRadioButton;
    private javax.swing.JTextField guestAddressField;
    private javax.swing.JTextField guestCityField;
    private javax.swing.JTextField guestEmailField;
    private javax.swing.JTextField guestNameTextField;
    private javax.swing.JTextField guestNationalityField;
    private javax.swing.JTextField guestPassportNumberField;
    private javax.swing.JTextField guestPhoneTextField;
    private javax.swing.JLabel guestType;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JRadioButton regularRadioButton;
    private javax.swing.JButton resetButton;
    private javax.swing.ButtonGroup roomCapasitybuttonGroup;
    private javax.swing.ButtonGroup roomTypebuttonGroup;
    private javax.swing.JRadioButton singleRoomRadioButton;
    private javax.swing.JRadioButton standardRoomRadioButton;
    private javax.swing.JRadioButton suiteRoomRadioButton;
    private javax.swing.JRadioButton tripleRoomRadioButton;
    // End of variables declaration//GEN-END:variables

    private void showRoomDetailsDialogWindowActivated(ActionEvent evt, int roomNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
