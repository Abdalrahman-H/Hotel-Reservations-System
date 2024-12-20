/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation;

import hotel.iterator.Iterator;
import java.util.List;


public class ReservationIterator implements Iterator<Reservation> {
    private List<Reservation> reservations;
    private int index = 0;

    public ReservationIterator(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public boolean hasNext() {
        return index < reservations.size();
    }

    @Override
    public Reservation next() {
        if (hasNext()) {
            return reservations.get(index++);
        }
        return null;
    }
}

