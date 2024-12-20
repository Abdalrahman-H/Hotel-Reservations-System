package hotel.guest;

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

public class Guests {

    // Singleton instance
    private static Guests instance;

    // List to hold all guest objects
    private List<Guest> guestList;

    // Private constructor to prevent external instantiation
    private Guests() {
        guestList = new ArrayList<>();
    }

    // Public method to provide access to the single instance
    public static Guests getInstance() {
        if (instance == null) {
            instance = new Guests();
        }
        return instance;
    }

    // Method to add a guest to the list
    public void addGuest(Guest guest) {
        guestList.add(guest);
    }

    // Method to remove a guest by ID
    public boolean removeGuest(int guestId) {
        return guestList.removeIf(guest -> guest.getId() == guestId);
    }

    // Method to retrieve a guest by ID
    public Guest getGuestById(int guestId) {
        return guestList.stream()
                .filter(guest -> guest.getId() == guestId)
                .findFirst()
                .orElse(null);
    }

    public void fetchAllGuests() {
        try {
            // Create a connection from the DatabaseConnection class
            Connection conn = DatabaseConnection.getInstance().getConnection();
            String query = "SELECT * FROM guests";
            PreparedStatement stmt = conn.prepareStatement(query);
            // Execute the query and get the result
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.clearGuests();
                do {
                    int id = rs.getInt("id");
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
                    guest.setId(id);
                    this.addGuest(guest);
                } while (rs.next());
            }
        } catch (SQLException e) {
            // Handle database errors
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Guests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Method to clear all guests (for testing or reinitialization)
    public void clearGuests() {
        guestList.clear();
    }
    
    public Iterator<Guest> createIterator() {
        return new GuestIterator(this.guestList);
    }
}
