/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.guest;

import hotel.database.DatabaseConnection;
import hotel.database.DatabaseObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Guest implements DatabaseObject {

    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String nationality;
    private String passportNumber;

    private Guest(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.email = builder.email;
        this.address = builder.address;
        this.city = builder.city;
        this.nationality = builder.nationality;
        this.passportNumber = builder.passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void save() {
        try {
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "INSERT INTO guests (GuestName, GuestPhone, GuestEmail, GuestAddress, GuestCity, GuestNationality, PassportNumber) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, this.name);
            stmt.setString(2, this.phone);
            stmt.setString(3, this.email);
            stmt.setString(4, this.address);
            stmt.setString(5, this.city);
            stmt.setString(6, this.nationality);
            stmt.setString(7, this.passportNumber);
            // Execute the query
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                this.id = rs.getRow();
            }
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Guest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Guest fetchGuest(int guestId) {
        try {
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "SELECT * FROM guests WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, guestId);
            // Execute the query and get the result
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String name = rs.getString("GuestName");
                String phone = rs.getString("GuestPhone");
                String email = rs.getString("GuestEmail");
                String address = rs.getString("GuestAddress");
                String city = rs.getString("GuestCity");
                String nationality = rs.getString("GuestNationality");
                String passportNumber = rs.getString("PassportNumber");

                Guest guest = new Guest.Builder()
                        .setGuestName(name)
                        .setGuestPhone(phone)
                        .setGuestEmail(email)
                        .setGuestAddress(address)
                        .setGuestCity(city)
                        .setGuestNationality(nationality)
                        .setPassportNumber(passportNumber)
                        .build();

                guest.setId(guestId);
                
                return guest;
            }
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Guest.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    // Builder Class
    public static class Builder {

        private String name;
        private String phone;
        private String email;
        private String address;
        private String city;
        private String nationality;
        private String passportNumber;

        public Builder setGuestName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGuestPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setGuestEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setGuestAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setGuestCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setGuestNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder setPassportNumber(String passportNumber) {
            this.passportNumber = passportNumber;
            return this;
        }

        // Method to build the Guest object
        public Guest build() {
            return new Guest(this);
        }
    }
}
