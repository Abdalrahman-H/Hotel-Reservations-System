/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation;

import hotel.database.DatabaseConnection;
import hotel.database.DatabaseObject;
import hotel.observer.Observer;
import hotel.room.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Reservation implements DatabaseObject {

    private List<Observer> observers = new ArrayList<>();
    private int id;
    private int guestId;
    private int roomNumber;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPrice;
    private Date reservationDate;

    public Reservation(int guestId, int roomId, Date checkInDate, Date checkOutDate) {
        this.guestId = guestId;
        this.roomNumber = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        
        LocalDate checkIn = checkInDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate checkOut = checkOutDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long noOfNights = ChronoUnit.DAYS.between(checkIn, checkOut);

        Room room = Room.fetchRoom(roomId);

        this.totalPrice = noOfNights * room.getPricePerNight();
    }
    
    // Add an observer to the list
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove an observer from the list
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers about the status change for a specific room
    private void notifyObservers(String status, int id) {
        for (Observer observer : observers) {
            observer.update(status, id);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGuestId() {
        return guestId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Date getResersvationDate() {
        return this.reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public void save() {
        try {
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "INSERT INTO reservations (GuestID, RoomNumber, CheckInDate, CheckOutDate, TotalPrice) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, this.guestId);
            stmt.setInt(2, this.roomNumber);
            stmt.setDate(3, new java.sql.Date(this.checkInDate.getTime()));
            stmt.setDate(4, new java.sql.Date(this.checkOutDate.getTime()));
            stmt.setDouble(5, this.totalPrice);
            // Execute the query
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                this.id = rs.getRow();
                this.reservationDate = new Date();
            }
            
            this.notifyObservers("booked", this.roomNumber);
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
