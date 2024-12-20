
package hotel.guest;

import hotel.reservation.*;
import hotel.iterator.Iterator;
import java.util.List;


public class GuestIterator implements Iterator<Guest> {
    private List<Guest> guests;
    private int index = 0;

    public GuestIterator(List<Guest> guests) {
        this.guests = guests;
    }

    @Override
    public boolean hasNext() {
        return index < guests.size();
    }

    @Override
    public Guest next() {
        if (hasNext()) {
            return guests.get(index++);
        }
        return null;
    }
}

