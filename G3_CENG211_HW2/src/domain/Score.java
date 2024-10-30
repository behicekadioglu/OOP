
package domain;
public class Score {

    private int point;
    private int maxPoint;
    
    //this class is used to store the score of the single game
    // No-argument constructor
    public Score() {
        this.point = 0;
        this.maxPoint = 0;
    }

    // Full-argument constructor
    public Score(int point, int maxPoint) {
        this.point = point;
        this.setMaxPoint(maxPoint);
    }

    // Copy constructor
    public Score(Score other) {
        this.point = other.point;
        this.maxPoint = other.maxPoint;
    }

    // Getters and Setters
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(int maxPoint) {
        if (this.maxPoint <= maxPoint){
            this.maxPoint = maxPoint;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Score{" + "point=" + point + ", maxPoint=" + maxPoint +'}';
    }

    // equals method
    public boolean equals(Score other) {
        if (other == null) return false;

        return this.point == other.point && this.maxPoint == other.maxPoint;
    }
}

