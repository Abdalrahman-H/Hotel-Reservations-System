/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.room;


public class DeluxeRoom extends Room {
    public DeluxeRoom(int id, boolean availability, String location) {
        super(id, "Deluxe", 2, 300.0, availability, location); 
    }

    public String getDetails() {
        return "Deluxe Room with premium facilities.";
    }
}