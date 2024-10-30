
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
    public Player(MapPosition position) {
        super(position);
        this.points = 100;
        this.lives = 2;
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

    // toString method
    @Override
    public String toString() {
        return "Player{" +
                "position=" + getPosition() +
                ", points=" + points +
                ", lives=" + lives +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Player player = (Player) obj;
        return points == player.points &&
               lives == player.lives &&
               getPosition().equals(player.getPosition());
    }


    

    
}

