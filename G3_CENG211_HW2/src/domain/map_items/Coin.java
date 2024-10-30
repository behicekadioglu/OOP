package domain.map_items;

import domain.MapPosition;

public class Coin extends MapItem {

    private int effectPoints;

    // No-argument constructor
    public Coin() {
        super(new MapPosition(0, 0, false));
        this.effectPoints = 5;
    }

    // Full-argument constructor
    public Coin(MapPosition position) {
        super(position);
        this.effectPoints = 5;
    }

    // Copy constructor
    public Coin(Coin other) {
        super(new MapPosition(other.getPosition()));
        this.effectPoints = other.effectPoints;
    }
    //interaction method for coin
    @Override
    public void interaction(Player player){
        player.setPoints(player.getPoints() + effectPoints);
    }

    // toString method
    @Override
    public String toString() {
        return "Coin{" +
                "position=" + getPosition() + ", points=" + effectPoints +
                '}';
    }

    // equals method
    public boolean equals(Coin other) {
        if (other == null) return false;
        return this.getPosition().equals(other.getPosition()) && this.effectPoints == other.effectPoints;
    }
}

