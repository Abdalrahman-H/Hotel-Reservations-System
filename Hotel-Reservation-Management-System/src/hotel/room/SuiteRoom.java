/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.room;

public class SuiteRoom extends Room {
    public SuiteRoom(int id, boolean availability, String location) {
        super(id, "Suite", 4, 500.0, availability, location); // قيم افتراضية (نوع، سعة، سعر)
    }

    public String getDetails() {
        return "Suite Room with luxurious facilities and amenities.";
    }
}
