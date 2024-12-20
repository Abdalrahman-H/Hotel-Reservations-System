package hotel.room;

import hotel.database.DatabaseConnection;
import hotel.iterator.Iterator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Rooms {

    // Singleton instance
    private static Rooms instance;

    // List to hold all room objects
    private List<Room> roomList;

    // Private constructor to prevent external instantiation
    private Rooms() {
        roomList = new ArrayList<>();
    }

    // Public method to provide access to the single instance
    public static Rooms getInstance() {
        if (instance == null) {
            instance = new Rooms();
        }
        return instance;
    }

    // Method to add a room to the list
    public void addRoom(Room room) {
        roomList.add(room);
    }

    // Method to remove a room by ID
    public boolean removeRoom(int roomId) {
        return roomList.removeIf(room -> room.getId() == roomId);
    }

    // Method to retrieve a room by ID
    public Room getRoomById(int roomId) {
        return roomList.stream()
                .filter(room -> room.getId() == roomId)
                .findFirst()
                .orElse(null);
    }
    
    public void fetchAllRooms() {
        try {
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "SELECT * FROM rooms";
            PreparedStatement stmt = conn.prepareStatement(query);
            // Execute the query and get the result
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.clearRooms();
                do {
                  int id = rs.getInt("RoomNumber");
                  String type = rs.getString("RoomType");
                  int capacity = rs.getInt("RoomCapacity");
                  boolean availability = rs.getBoolean("Availability");
                  double pricePerNight = rs.getDouble("PricePerNight");
                  String location = rs.getString("Location");
                  Room room = new Room(id, type, capacity, pricePerNight, availability, location);
                  room.setId(id);
                  this.addRoom(room);
                } while (rs.next());
            }
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fetchAvailableRooms() {
        try {
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            // First check if the user exists in the admin table
            String query = "SELECT * FROM rooms WHERE Availability = true";
            PreparedStatement stmt = conn.prepareStatement(query);
            // Execute the query and get the result
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.clearRooms();
                do {
                  int id = rs.getInt("RoomNumber");
                  String type = rs.getString("RoomType");
                  int capacity = rs.getInt("RoomCapacity");
                  boolean availability = rs.getBoolean("Availability");
                  double pricePerNight = rs.getDouble("PricePerNight");
                  String location = rs.getString("Location");
                  Room room = new Room(id, type, capacity, pricePerNight, availability, location);
                  room.setId(id);
                  this.addRoom(room);
                } while (rs.next());
            }
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Rooms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Method to clear all rooms (for testing or reinitialization)
    public void clearRooms() {
        roomList.clear();
    }
    
    public Iterator<Room> createIterator() {
        return new RoomIterator(this.roomList);
    }
}
