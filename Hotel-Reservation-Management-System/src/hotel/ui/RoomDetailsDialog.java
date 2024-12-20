/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.ui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class RoomDetailsDialog extends javax.swing.JDialog {

    /**
     * Creates new form showRoomDetailsDialog
     */
    
    
// تعريف المتغيرات لاستقبال البيانات
private final int roomNumber;
private final String roomType;
private final int roomCapacity;
private final java.sql.Date checkInDate;
private final java.sql.Date checkOutDate;
private final String guestType;
private final String guestName;
private final String guestPhone;
private final String guestEmail;
private final String guestAddress;
private final String guestCity;
private final String guestNationality;
private final String passportNumber;

// المُنشئ (Constructor) المعدل لاستقبال البيانات
public RoomDetailsDialog(
    java.awt.Frame parent,
    boolean modal,
    String guestName,
    String guestPhone,
    String guestEmail,
    String guestAddress,
    String guestCity,
    String guestNationality,
    String passportNumber,
    String guestType,
    int roomNumber,
    String roomType,
    int roomCapacity,
    java.sql.Date checkInDate,
    java.sql.Date checkOutDate
) {
    super(parent, modal);
    initComponents();

    // تخزين البيانات في المتغيرات
    this.guestName = guestName;
    this.guestPhone = guestPhone;
    this.guestEmail = guestEmail;
    this.guestAddress = guestAddress;
    this.guestCity = guestCity;
    this.guestNationality = guestPhone;
    this.passportNumber = passportNumber;
    this.guestType = guestType;
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.roomCapacity = roomCapacity;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;

    // تحديث الـ Labels في التصميم
    roomNumberResultLabel.setText(String.valueOf(roomNumber));
    roomTypeResultLabel.setText(roomType);
    roomCapasityResultLabel.setText(roomCapacity + " Person(s)");
    CheckInDateResultLabel.setText(checkInDate.toString());
    CheckOutDateResultLabel.setText(checkOutDate.toString());
    numberOfNightResultLabel.setText(String.valueOf(getNumberOfNights()));

    // تحديث الـ Labels ببيانات النزيل
    guestNameResultLabel.setText(guestName);
    guestPhoneResultLabel.setText(guestPhone);
    EmailField.setText(guestEmail);
    AddressField.setText(guestAddress);
    CityField.setText(guestCity);
    NationalityField.setText(guestNationality);
    Password_no_Field.setText(passportNumber);
    guestTypeResultLabel.setText(guestType);

}
     // حساب عدد الليالي
    private int getNumberOfNights() {
        long diffInMillis = checkOutDate.getTime() - checkInDate.getTime();
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        return (int) diffInDays;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myLabel = new javax.swing.JLabel();
        SaveResrvationButton = new javax.swing.JButton();
        EditResrvationButton1 = new javax.swing.JButton();
        Pearsonal_Data_Panel = new javax.swing.JPanel();
        PearsonalDataLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        guestNameResultLabel = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        guestPhoneResultLabel = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        CityLabel = new javax.swing.JLabel();
        CityField = new javax.swing.JTextField();
        NationalityLabel = new javax.swing.JLabel();
        NationalityField = new javax.swing.JTextField();
        Passport_no_Label = new javax.swing.JLabel();
        Password_no_Field = new javax.swing.JTextField();
        RoomTypeLabel1 = new javax.swing.JLabel();
        guestTypeResultLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        roomNumberResultLabel = new javax.swing.JLabel();
        roomTypeResultLabel = new javax.swing.JLabel();
        RoomTypeLabel = new javax.swing.JLabel();
        RoomNumberLabel = new javax.swing.JLabel();
        RoomDataLabel = new javax.swing.JLabel();
        RoomCapasityLabel = new javax.swing.JLabel();
        roomCapasityResultLabel = new javax.swing.JLabel();
        CheckInDateResultLabel = new javax.swing.JLabel();
        CheckInDateLabel = new javax.swing.JLabel();
        CheckOutDateLabel = new javax.swing.JLabel();
        CheckOutDateResultLabel = new javax.swing.JLabel();
        NumberNightLabel = new javax.swing.JLabel();
        numberOfNightResultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        myLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        SaveResrvationButton.setText("Save");
        SaveResrvationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveResrvationButtonActionPerformed(evt);
            }
        });

        EditResrvationButton1.setText("Edit");
        EditResrvationButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditResrvationButton1ActionPerformed(evt);
            }
        });

        PearsonalDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PearsonalDataLabel.setText("Pearsonal Data");
        PearsonalDataLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel.setText("Name");

        guestNameResultLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestNameResultLabelActionPerformed(evt);
            }
        });

        phoneLabel.setText("Phone");

        guestPhoneResultLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestPhoneResultLabelActionPerformed(evt);
            }
        });

        EmailLabel.setText("Email");

        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        AddressLabel.setText("Address");

        AddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFieldActionPerformed(evt);
            }
        });

        CityLabel.setText("City");

        CityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityFieldActionPerformed(evt);
            }
        });

        NationalityLabel.setText("Nationality");

        NationalityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityFieldActionPerformed(evt);
            }
        });

        Passport_no_Label.setText("Passport Number");

        Password_no_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_no_FieldActionPerformed(evt);
            }
        });

        RoomTypeLabel1.setText("Guest Type");

        javax.swing.GroupLayout Pearsonal_Data_PanelLayout = new javax.swing.GroupLayout(Pearsonal_Data_Panel);
        Pearsonal_Data_Panel.setLayout(Pearsonal_Data_PanelLayout);
        Pearsonal_Data_PanelLayout.setHorizontalGroup(
            Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pearsonal_Data_PanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pearsonal_Data_PanelLayout.createSequentialGroup()
                        .addComponent(PearsonalDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pearsonal_Data_PanelLayout.createSequentialGroup()
                        .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NationalityLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Passport_no_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RoomTypeLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(guestPhoneResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password_no_Field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NationalityField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guestTypeResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(AddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(EmailField)
                            .addComponent(guestNameResultLabel))
                        .addGap(38, 38, 38))))
        );
        Pearsonal_Data_PanelLayout.setVerticalGroup(
            Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pearsonal_Data_PanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(PearsonalDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(guestNameResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLabel)
                    .addComponent(guestPhoneResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailLabel)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressLabel)
                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CityLabel)
                    .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NationalityLabel))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_no_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Passport_no_Label))
                .addGap(18, 18, 18)
                .addGroup(Pearsonal_Data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guestTypeResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RoomTypeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        RoomTypeLabel.setText("Room Type");

        RoomNumberLabel.setText("Room Number");

        RoomDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoomDataLabel.setText("Room Data");
        RoomDataLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RoomCapasityLabel.setText("Room Capasity");

        CheckInDateLabel.setText("Check In Date");

        CheckOutDateLabel.setText("Check Out Date");

        NumberNightLabel.setText("Number Of Night");

        numberOfNightResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(RoomDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(RoomNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RoomTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RoomCapasityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheckInDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheckOutDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NumberNightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(numberOfNightResultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CheckOutDateResultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CheckInDateResultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomCapasityResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomTypeResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomNumberResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RoomDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(RoomNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(RoomTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(RoomCapasityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(CheckInDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(CheckOutDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NumberNightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(roomNumberResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47))
                                .addComponent(roomTypeResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(roomCapasityResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(CheckOutDateResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(CheckInDateResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47))
                        .addComponent(numberOfNightResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pearsonal_Data_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(EditResrvationButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveResrvationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(myLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Pearsonal_Data_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaveResrvationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditResrvationButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
            myLabel.setText("Confirmation Check-In ");
            
    }//GEN-LAST:event_formWindowOpened

    private void EditResrvationButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditResrvationButton1ActionPerformed
          // إغلاق النافذة المنبثقة
    this.dispose(); // تقوم بإغلاق الـ JDialog الحالي
    
    // العودة إلى صفحة Check-In (افترض أن اسم صفحة Check-In هو CheckInPage)
    // يمكنك جعل نافذة Check-In مرئية مجددًا
    if (getParent() instanceof javax.swing.JFrame) { // تحقق أن الوالد هو نافذة JFrame
        javax.swing.JFrame parentFrame = (javax.swing.JFrame) getParent();
        parentFrame.setVisible(true);
    }
    }//GEN-LAST:event_EditResrvationButton1ActionPerformed

    private void guestNameResultLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestNameResultLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestNameResultLabelActionPerformed

    private void guestPhoneResultLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestPhoneResultLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestPhoneResultLabelActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void CityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityFieldActionPerformed

    private void NationalityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityFieldActionPerformed

    private void Password_no_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_no_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_no_FieldActionPerformed

    private void SaveResrvationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveResrvationButtonActionPerformed

    }//GEN-LAST:event_SaveResrvationButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RoomDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            /*  ********************************************************************************/
            /*  ********************************************************************************/
           //   ***   This Virtual Information to test the Object (showRoomDetailsDialog)     **/
           /*   ********************************************************************************/
           /*   ********************************************************************************/
            RoomDetailsDialog dialog = new RoomDetailsDialog(
                new javax.swing.JFrame(), 
                true,                     
                "Ali",
                "01012345678",
                "example@gmail.com",
                " 6th Of October Zone 3 No 251, Cairo",
                "Cairo",
                "Egyptioan",
                "8268048MA",
                "VIP",
                101,                      
                "Standard",               
                2,                        
                java.sql.Date.valueOf("2024-12-10"), 
                java.sql.Date.valueOf("2024-12-15")
            /*   *******************************************************************************/
            );
            
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialog.setVisible(true);
    }
});

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel CheckInDateLabel;
    private javax.swing.JLabel CheckInDateResultLabel;
    private javax.swing.JLabel CheckOutDateLabel;
    private javax.swing.JLabel CheckOutDateResultLabel;
    private javax.swing.JTextField CityField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JButton EditResrvationButton1;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField NationalityField;
    private javax.swing.JLabel NationalityLabel;
    private javax.swing.JLabel NumberNightLabel;
    private javax.swing.JLabel Passport_no_Label;
    private javax.swing.JTextField Password_no_Field;
    private javax.swing.JLabel PearsonalDataLabel;
    private javax.swing.JPanel Pearsonal_Data_Panel;
    private javax.swing.JLabel RoomCapasityLabel;
    private javax.swing.JLabel RoomDataLabel;
    private javax.swing.JLabel RoomNumberLabel;
    private javax.swing.JLabel RoomTypeLabel;
    private javax.swing.JLabel RoomTypeLabel1;
    private javax.swing.JButton SaveResrvationButton;
    private javax.swing.JTextField guestNameResultLabel;
    private javax.swing.JTextField guestPhoneResultLabel;
    private javax.swing.JLabel guestTypeResultLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel myLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numberOfNightResultLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel roomCapasityResultLabel;
    private javax.swing.JLabel roomNumberResultLabel;
    private javax.swing.JLabel roomTypeResultLabel;
    // End of variables declaration//GEN-END:variables
}