
package domain.map_items;

import domain.MapPosition;

public class Frog extends MapItem {

    private int effectLives;

    // No-argument constructor
    public Frog() {
        super(new MapPosition(0, 0, false));
        this.effectLives = -1;
    }

    // Full-argument constructor
    public Frog(MapPosition position) {
        super(position);
        this.effectLives = -1;
    }

    // Copy constructor
    public Frog(Frog other) {
        super(new MapPosition(other.getPosition()));
        this.effectLives = other.effectLives;
    }

    @Override
    public void interaction(Player player){
        player.setLives(player.getLives() + effectLives);
    }

    // toString method
    @Override
    public String toString() {
        return "Frog{" +
                "position=" + getPosition() + ", lives=" + effectLives +
                '}';
    }

    // equals method
    public boolean equals(Frog other) {
        if (other == null) return false;
        return this.getPosition().equals(other.getPosition()) && this.effectLives == other.effectLives;
    }

}

