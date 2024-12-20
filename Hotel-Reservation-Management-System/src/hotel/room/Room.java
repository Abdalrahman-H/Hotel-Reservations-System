/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.room;

import hotel.database.DatabaseConnection;
import hotel.database.DatabaseObject;
import hotel.observer.Observer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


// Room.java
public class Room implements DatabaseObject, Observer {

    private int id;
    private String type; // نوع الغرفة
    private int capacity; // السعة
    private double pricePerNight; // السعر لكل ليلة
    private boolean availability;
    private String location;

    public Room(int id, String type, int capacity, double pricePerNight, boolean availability, String location) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
        this.location = location;
    }

    // Getters and Setters (إذا لزم الأمر)
    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean getAvailability() {
        return availability;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Room fetchRoom(int roomId) {
        try {
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "SELECT * FROM rooms WHERE RoomNumber = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, roomId);
            // Execute the query and get the result
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String type = rs.getString("RoomType");
                int capacity = rs.getInt("RoomCapacity");
                boolean availability = rs.getBoolean("Availability");
                double pricePerNight = rs.getDouble("PricePerNight");
                String location = rs.getString("Location");

                Room room = new Room(roomId, type, capacity, pricePerNight, availability, location);

                return room;
            }
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public void save() {
        try {
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "INSERT INTO rooms (RoomNumber, RoomType, RoomCapacity, PricePerNight, Availability, Location) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, this.id);
            stmt.setString(2, this.type);
            stmt.setInt(3, this.capacity);
            stmt.setDouble(4, this.pricePerNight);
            stmt.setBoolean(5, this.availability);
            stmt.setString(6, this.location);
            // Execute the query
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String status, int id) {
        try {
            boolean availability = !status.equals("booked"); 
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "UPDATE rooms SET Availability = ? WHERE RoomNumber = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setBoolean(1, availability);
            stmt.setInt(2, id);
            // Execute the query
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
