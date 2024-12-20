/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation;

import hotel.database.DatabaseConnection;
import hotel.iterator.Iterator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Reservations {
    // Singleton instance
    private static Reservations instance;

    // List to hold all reservation objects
    private List<Reservation> reservationList;

    // Private constructor to prevent external instantiation
    private Reservations() {
        reservationList = new ArrayList<>();
    }

    // Public method to provide access to the single instance
    public static Reservations getInstance() {
        if (instance == null) {
            instance = new Reservations();
        }
        return instance;
    }

    // Method to add a reservation to the list
    public void addReservation(Reservation reservation) {
        reservationList.add(reservation);
    }

    // Method to remove a reservation by ID
    public boolean removeReservation(int reservationId) {
        return reservationList.removeIf(reservation -> reservation.getId() == reservationId);
    }

    // Method to retrieve a reservation by ID
    public Reservation getReservationById(int reservationId) {
        return reservationList.stream()
                .filter(reservation -> reservation.getId() == reservationId)
                .findFirst()
                .orElse(null);
    }

    public void fetchAllReservations() {
        try {
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "SELECT * FROM reservations";
            PreparedStatement stmt = conn.prepareStatement(query);
            // Execute the query and get the result
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.clearReservations();
                do {
                  int id = rs.getInt("id");
                  int guestId = rs.getInt("GuestID");
                  int roomNumber = rs.getInt("RoomNumber");
                  Date checkInDate = new Date(rs.getDate("CheckInDate").getTime());
                  Date checkOutDate = new Date(rs.getDate("CheckOutDate").getTime());
                  double totalPrice = rs.getDouble("TotalPrice");
                  Date reservationDate = new Date(rs.getTimestamp("ReservationDate").getTime());
                  Reservation reservation = new Reservation(guestId, roomNumber, checkInDate, checkOutDate);
                  reservation.setId(id);
                  reservation.setReservationDate(reservationDate);
                  this.addReservation(reservation);
                } while (rs.next());
            }
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reservations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Method to clear all reservations (for testing or reinitialization)
    public void clearReservations() {
        reservationList.clear();
    }
    
    public Iterator<Reservation> createIterator() {
        return new ReservationIterator(this.reservationList);
    }
}
