package domain.map_items;

import domain.MapPosition;

public class Coin extends MapItem {
    // No-argument constructor
    public Coin() {
        super(new MapPosition(0, 0, false));
    }

    // Full-argument constructor
    public Coin(MapPosition position) {
        super(position);
    }

    // Copy constructor
    public Coin(Coin other) {
        super(new MapPosition(other.getPosition()));
    }

    // toString method
    @Override
    public String toString() {
        return "Coin{" +
                "position=" + getPosition() +
                '}';
    }

    // equals method
    public boolean equals(Coin other) {
        if (other == null) return false;
        return this.getPosition().equals(other.getPosition());
    }
}
