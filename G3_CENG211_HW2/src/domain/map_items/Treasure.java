package domain.map_items;

import domain.MapPosition;

public class Treasure extends MapItem {
    // No-argument constructor
    public Treasure() {
        super(new MapPosition(0, 0, false));
    }

    // Full-argument constructor
    public Treasure(MapPosition position) {
        super(position);
    }

    // Copy constructor
    public Treasure(Treasure other) {
        super(new MapPosition(other.getPosition()));
    }

    // toString method
    @Override
    public String toString() {
        return "Treasure{" +
                "position=" + getPosition() +
                '}';
    }

    
}
