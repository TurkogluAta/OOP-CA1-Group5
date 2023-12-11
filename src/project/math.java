/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ataturkoglu
 */
public class math {

    private int level;
    private int currentScore;
    private String playerName;
    private int correctAnswer;
    private String question;
    private int userAnswer;
    private ArrayList<String> playerScores = new ArrayList<>();
    private int lastScore;

    public int getLastScore() {
        return lastScore;
    }

    public void setLastScore(int lastScore) {
        this.lastScore = lastScore;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getPlayerScores() {
        return playerScores;
    }

    public void setPlayerScores(ArrayList<String> playerScores) {
        this.playerScores = playerScores;
    }

    public math() {
        level = 1; // Default level
        currentScore = 0;
        playerName = " ";
        correctAnswer = 0;
        question = " ";
        userAnswer = 0;
    }

    // Generates a math question based on the current level of the game
    // Higher levels make more complex questions
    public void questionGenerate() {
        int num1, num2, num3, num4;

        switch (level) {
            case 1:
                // Level 1 question generation 
                num1 = (int) (Math.random() * 10) + 1;
                num2 = (int) (Math.random() * 10) + 1;
                num3 = (int) (Math.random() * 10) + 1;
                question = num1 + " + " + num2 + " - " + num3;
                correctAnswer = num1 + num2 - num3;
                break;
            case 2:
                // Level 2 question generation 
                num1 = (int) (Math.random() * 20) + 1;
                num2 = (int) (Math.random() * 20) + 1;
                num3 = (int) (Math.random() * 20) + 1;
                question = num1 + " * " + num2 + " - " + num3;
                correctAnswer = num1 * num2 - num3;
                break;
            case 3:
                // Level 3 question generation 
                num1 = (int) (Math.random() * 30) + 1;
                num2 = (int) (Math.random() * 30) + 1;
                num3 = (int) (Math.random() * 30) + 1;
                num4 = (int) (Math.random() * 30) + 1;
                question = num1 + " - " + num2 + " * " + num3 + " + " + num4;
                correctAnswer = num1 - num2 * num3 + num4;
                break;
        }
    }

    // Checks the user's answer.
    // If correct, updates the score and generates a new question.
    public boolean check(int userAnswer) {
        if (userAnswer == correctAnswer) {
            // Add score when correct answer is given. (point = level * 10)
            currentScore += level * 10;
            // Update player score
            updatePlayerScore(playerName, currentScore);
            // Generate and return new questions
            questionGenerate();
            return true;
        } else {
            // Save last score
            lastScore = currentScore;
            // Reset score for the next player or game
            currentScore = 0;
            return false;
        }
    }

    // Updates the player's score in the leaderboard
    // If the new score is higher than the previous score replaces it
    private void updatePlayerScore(String playerName, int newScore) {
        String playerScoreEntry = null;
        int maxScore = 0;

        // Loop through each score in the list of player scores
        for (String scoreEntry : playerScores) {
            // Check if this score is for the player we are looking for
            if (scoreEntry.startsWith(playerName + " : ")) {
                // Get the number part ([1]) of the score and change it into an integer
                int score = Integer.parseInt(scoreEntry.split(" : ")[1]);

                // If this score is higher than the highest score
                if (score > maxScore) {
                    // Make this the new highest score 
                    maxScore = score;
                    playerScoreEntry = scoreEntry;
                }
            }
        }

        // If the new score is higher, update
        if (newScore > maxScore) {
            // Check if we have an old score for this player
            if (playerScoreEntry != null) {
                // If yes remove the old score from the list
                playerScores.remove(playerScoreEntry);
            }
            // Add the player's name and new high score to the list
            playerScores.add(playerName + " : " + newScore);
        }
    }

    // Sorts and returns the list of player scores in descending order.
    public ArrayList<String> playerScores() {
        // Use Collections.sort method to sort the playerScores list. A new Comparator is provided to define how the sorting should work
        Collections.sort(playerScores, new Comparator<String>() {
            // This is the compare method of the Comparator. It tells how to compare two elements (o1 and o2) of the list
            public int compare(String o1, String o2) {
                // Get the score from each score string and turn it into a integer
                // Sort scores from high to low
                int score1 = Integer.parseInt(o1.split(" : ")[1]);
                int score2 = Integer.parseInt(o2.split(" : ")[1]);
                return Integer.compare(score2, score1);
            }
        });

        // Limit to top 10 scores
        int size = playerScores.size();
        return new ArrayList<>(playerScores.subList(0, Math.min(size, 10)));
    }
}
