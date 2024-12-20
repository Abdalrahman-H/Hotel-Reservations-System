/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class UIHelper {

    public static  void setButtonProperties(JButton button, String text, String iconPath, boolean isHorizontalLayout) {
                // Loading The Icons
                ImageIcon icon = new ImageIcon(iconPath);
                Image img = icon.getImage();
                Image resizedImg = img.getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);

                // Set Icon and other properties
                button.setIcon(new ImageIcon(resizedImg)); //Add text next to the icon
                button.setText(text);
                
                // Sepecify text and icon style based on orientation
                if (isHorizontalLayout) {
                    button.setHorizontalTextPosition(SwingConstants.RIGHT); // Text right of icon.
                    button.setVerticalTextPosition(SwingConstants.CENTER);  // The icon and text in the middle are vertical.
                } else {
                    button.setHorizontalTextPosition(SwingConstants.CENTER); // Text in the middle.
                    button.setVerticalTextPosition(SwingConstants.BOTTOM);   // Text under the Icon.
                }
            }
    public static  void setLabelProperties(JLabel label, String text, String iconPath){
                //Loading The Icone
                ImageIcon icon =new ImageIcon(iconPath);
                Image img = icon.getImage();
                Image resizedImg = img.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);

                //Set Icon and other properties
                label.setIcon(new ImageIcon(resizedImg));
                label.setText(text);
                label.setHorizontalAlignment(SwingConstants.LEFT);
                label.setVerticalTextPosition(SwingConstants.CENTER);
                
    }
    public class ImagePaths {
   
    public static final String CHECK_IN_ICON = "src/images/check-in.png";
    public static final String CHECK_OUT_ICON = "src/images/check-out.png";
    public static final String  HOME = "src/images/home.png";
    public static final String  PERMISSION = "src/images/permission.png";
    public static final String  USER = "src/images/user.png";
    public static final String  SETTING = "src/images/settings.png";
    public static final String  ROOM = "src/images/room.png";
    public static final String  STAFF = "src/images/staff.png";
    public static final String  LOGS = "src/images/logs.png";
    public static final String  LOG_OUT = "src/images/logout.png";
    public static final String  GEST = "src/images/gest.png";
    
    public static final String  ParsonData_ICON = "src/images/parsonData.png";
    public static final String  Name_ICON = "src/images/name.png";
    public static final String  Phone_ICON = "src/images/phone.png";
    public static final String  Email_ICON = "src/images/gest.png";
    public static final String  Address_ICON = "src/images/address.png";
    public static final String  City_ICON = "src/images/city.png";
    public static final String  Nationality_ICON = "src/images/nationality.png";
    public static final String  Passport_No_ICON = "src/images/passport.png";
    public static final String  Reset_ICON = "src/images/reset.png";
    

    }


}


