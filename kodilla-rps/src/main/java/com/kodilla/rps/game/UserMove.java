package com.kodilla.rps.game;

import org.springframework.stereotype.Component;

import java.util.InputMismatchException;
import java.util.Scanner;

@Component
public class UserMove {

    private Scanner input = new Scanner(System.in);

    private String userName;
    private int winStreak;
    public int userScore;
    public int cpuScore;
    public int gamePlayed;

    public UserMove beginGame() {

        userScore = cpuScore = gamePlayed = 0;
        System.out.print("Enter your name: ");
        this.userName = input.next();
        System.out.print("Type a number fo win streak? ");
        try {
            this.winStreak = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You did not enter a number. Default win streak is 2.");
        winStreak = 2;}
        return new UserMove();
    }

    public Choice playGame() {

        System.out.println("Chose any option: 1 for ROCK, 2 for PAPER," +
                "3 for SCISSORS, x for exit and n for a new game.");

        switch (input.next().toLowerCase()) {
            case "1":
                return Choice.ROCK;
            case "2":
                return Choice.PAPER;
            case "3":
                return Choice.SCISSORS;
            case "x":
                if (endGame() == true) {
                    return Choice.BREAK;}
                    else break;
            case "n":
                if (endGame() == true) {
                    beginGame();}
            default:
                break;
        }
        System.out.println("Wrong input.");
        return playGame();
    }

    public boolean endGame() {
        System.out.println("Do you want to end? y for yes, n for no.");
        switch (input.next()) {
            case "y":
                return true;
            case "n":
                return false;
            default:
                break;
        }
        return false;
    }

    public String getUserName() {
        return userName;
    }

    public int getWinStreak() {
        return winStreak;
    }

    public int getUserScore() {
        return userScore;
    }

    public int getCpuScore() {
        return cpuScore;
    }

    public int getGamePlayed() {
        return gamePlayed;
    }
}
