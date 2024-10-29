
package domain.map_items;

import domain.MapPosition;

public class Treasure extends MapItem {
    private int effectLives;
    // No-argument constructor
    public Treasure() {
        super(new MapPosition(0, 0, false));
        this.effectLives = 1;
    }

    // Full-argument constructor
    public Treasure(MapPosition position, int lives) {
        super(position);
        this.effectLives = lives;
    }

    // Copy constructor
    public Treasure(Treasure other) {
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
        return "Treasure{" +
                "position=" + getPosition() + ", lives=" + effectLives +
                '}';
    }

    public boolean equals(Treasure other) {
        if (other == null) return false;
        return this.getPosition().equals(other.getPosition()) && this.effectLives == other.effectLives;
    }
}

