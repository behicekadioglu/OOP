package domain.map_items;

import domain.MapPosition;

public class Frog extends MapItem {
    // No-argument constructor
    public Frog() {
        super(new MapPosition(0, 0, false));
    }

    // Full-argument constructor
    public Frog(MapPosition position) {
        super(position);
    }

    // Copy constructor
    public Frog(Frog other) {
        super(new MapPosition(other.getPosition()));
    }

    // toString method
    @Override
    public String toString() {
        return "Frog{" +
                "position=" + getPosition() +
                '}';
    }

    // equals method
    public boolean equals(Frog other) {
        if (other == null) return false;
        return this.getPosition().equals(other.getPosition());
    }

}
