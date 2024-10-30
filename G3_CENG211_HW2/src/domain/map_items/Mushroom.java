
package domain.map_items;

import domain.MapPosition;

public class Mushroom extends MapItem {
    
    private int effectPoints;
    // No-argument constructor
    public Mushroom() {
        super(new MapPosition(0, 0, false));
        this.effectPoints = -20;
    }

    // Full-argument constructor
    public Mushroom(MapPosition position) {
        super(position);
        this.effectPoints = -20;
    }

    // Copy constructor
    public Mushroom(Mushroom other) {
        super(new MapPosition(other.getPosition()));
        this.effectPoints = other.effectPoints;
    }

    @Override
    public void interaction(Player player){
        player.setPoints(player.getPoints() + effectPoints);
    }

    // toString method
    @Override
    public String toString() {
        return "Mushroom{" +
                "position=" + getPosition() + ", points=" + effectPoints +
                '}';
    }
    public boolean equals(Mushroom other) {
        if (other == null) return false;
        return this.getPosition().equals(other.getPosition()) && this.effectPoints == other.effectPoints;
    }
}

