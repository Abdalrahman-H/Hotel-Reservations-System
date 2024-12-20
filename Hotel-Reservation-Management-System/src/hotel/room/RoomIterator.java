/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.room;

import hotel.reservation.*;
import hotel.iterator.Iterator;
import java.util.List;

public class RoomIterator implements Iterator<Room> {
    private List<Room> rooms;
    private int index = 0;

    public RoomIterator(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean hasNext() {
        return index < rooms.size();
    }

    @Override
    public Room next() {
        if (hasNext()) {
            return rooms.get(index++);
        }
        return null;
    }
}

