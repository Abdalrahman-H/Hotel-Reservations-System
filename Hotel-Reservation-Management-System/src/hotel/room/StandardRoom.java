/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.room;

public class StandardRoom extends Room {
    public StandardRoom(int id, boolean availability, String location) {
        super(id, "Standard", 2, 150.0, availability, location); // قيم افتراضية
    }

    public String getDetails() {
        return "Standard Room with basic facilities.";
    }
}
