package domain.map_items;

import domain.MapPosition;

public class Diamond extends MapItem {
     // No-argument constructor
    public Diamond() {
        super(new MapPosition(0, 0, false));
    }

    // Full-argument constructor
    public Diamond(MapPosition position) {
        super(position);
    }

    // Copy constructor
    public Diamond(Diamond other) {
        super(new MapPosition(other.getPosition()));
    }

    // toString method
    @Override
    public String toString() {
        return "Diamond{" +
                "position=" + getPosition() +
                '}';
    }

    // equals method
    public boolean equals(Diamond other) {
        if (other == null) return false;
        return this.getPosition().equals(other.getPosition());
    }

}
