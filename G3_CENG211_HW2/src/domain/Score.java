package domain;
public class Score {
    private int points;
    private MapPosition from;
    private MapPosition to;

    // No-argument constructor
    public Score() {
        this.points = 0;
        this.from = new MapPosition();
        this.to = new MapPosition();
    }

    // Full-argument constructor
    public Score(int points, MapPosition from, MapPosition to) {
        this.points = points;
        this.from = from;
        this.to = to;
    }

    // Copy constructor
    public Score(Score other) {
        this.points = other.points;
        this.from = new MapPosition(other.from);
        this.to = new MapPosition(other.to);
    }

    // Getters and Setters
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public MapPosition getFrom() {
        return from;
    }

    public void setFrom(MapPosition from) {
        this.from = from;
    }

    public MapPosition getTo() {
        return to;
    }

    public void setTo(MapPosition to) {
        this.to = to;
    }

    // toString method
    @Override
    public String toString() {
        return "Score{" +
               "points=" + points +
               ", from=" + from +
               ", to=" + to +
               '}';
    }

    // equals method
    public boolean equals(Score other) {
        if (other == null) return false;

        return this.points == other.points &&
               this.from.equals(other.from) &&
               this.to.equals(other.to);
    }


}
