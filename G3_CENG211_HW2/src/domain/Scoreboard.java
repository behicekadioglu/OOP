package domain;

import java.util.ArrayList;

import data.FileIO;

public class Scoreboard {
    // Attributes
    private ArrayList<Score> scores;

    // Constructor
    public Scoreboard() {
        scores = new ArrayList<>();
    }

    // Method to add a score
    public void addScore(Score score) {
        scores.add(score);
    }

    // Method to print scores to a file
    public void printScores(FileIO fileIO) {
    // Logic for printing to a file using FileIO
}
}
