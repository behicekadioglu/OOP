package domain;

import java.util.ArrayList;
import java.util.List;

import data.FileIO;

public class Scoreboard {
    // Attributes
    private ArrayList<Score> scores;

    // Constructor
    public Scoreboard() {
        scores = new ArrayList<>();
    }

    // Getter with deep copy
    public List<Score> getScores() {
        return new ArrayList<Score>(scores);
    }

    // Setter with deep copy
    public void setScores(List<Score> scores) {
        this.scores = new ArrayList<>(scores);
    }

    // Method to add a score
    public void addScore(Score score) {
        scores.add(score);
    }

    // Method to print scores to a file
    public void printScores(FileIO fileIO) {
    // Logic for printing to a file using FileIO
    }

    // toString method
    @Override
    public String toString() {
        return "Scoreboard{" +
               "scores=" + scores +
               '}';
    }

    // equals method 
    public boolean equals(Scoreboard other) {
        if (other == null) return false;
        if (this.scores.size() != other.scores.size()) {
            return false;
        }
        for (int i = 0; i < this.scores.size(); i++) {
            if (!this.scores.get(i).equals(other.scores.get(i))) {
                return false;
            }
        }

        return true;
    }


}
