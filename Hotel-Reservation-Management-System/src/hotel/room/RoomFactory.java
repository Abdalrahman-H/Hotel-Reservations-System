/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.room;

public class RoomFactory {
    public static Room createRoom(int id, String roomType, boolean availability, String location) {
        switch (roomType.toLowerCase()) {
            case "standard":
                return new StandardRoom(id, availability, location); 
            case "deluxe":
                return new DeluxeRoom(id, availability, location);
            case "suite":
                return new SuiteRoom(id, availability, location);
            default:
                throw new IllegalArgumentException("Unknown room type: " + roomType);
        }
    }
}

