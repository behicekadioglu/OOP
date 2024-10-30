
package domain.map_items;

import domain.MapPosition;

public class Diamond extends MapItem {
    private int effectPoints;
  
     // No-argument constructor
    public Diamond() {
        super(new MapPosition(0, 0, false));
        this.effectPoints = 10;
    }

    // Full-argument constructor
    public Diamond(MapPosition position) {
        super(position);
        this.effectPoints = 10;
    }

    // Copy constructor
    public Diamond(Diamond other) {
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
        return "Diamond{" +
                "position=" + getPosition() + ", points=" + effectPoints +
                '}';
    }

    // equals method
    public boolean equals(Diamond other) {
        if (other == null) return false;
        return this.getPosition().equals(other.getPosition()) && this.effectPoints == other.effectPoints;
    }

}

