package domain.map_items;

import domain.MapPosition;

public class Player extends MapItem {
     private int points;
    private int lives;

    // No-argument constructor
    public Player() {
        super(new MapPosition(0, 0, false));
        this.points = 100;
        this.lives = 2;
    }

    // Full-argument constructor
    public Player(MapPosition position, int points, int lives) {
        super(position);
        this.points = points;
        this.lives = lives;
    }

    // Copy constructor
    public Player(Player other) {
        super(new MapPosition(other.getPosition()));
        this.points = other.points;
        this.lives = other.lives;
    }

    // Getters and Setters
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    
}
