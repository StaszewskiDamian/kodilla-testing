package com.kodilla.rps;

import com.kodilla.rps.game.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RpsRunner {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.rps");
        CpuMove cpuChoice = context.getBean(CpuMove.class);
        UserMove userMove = context.getBean(UserMove.class);
        ScoreValidator scoreValidator = context.getBean(ScoreValidator.class);

        userMove.beginGame();
        loop:
        while (true) {
            Choice user = userMove.playGame();
            Choice cpu = cpuChoice.getCpuMove();

            int compareMoves = scoreValidator.compareMoves(cpu, user);

            if (compareMoves == 0) {
                userMove.gamePlayed++;
                System.out.println("Tie. Both player chose: " + user);
                System.out.println("Score: cpu = " + userMove.getCpuScore() + " " + userMove.getUserName() + " = " + userMove.getUserScore());
            } else if (compareMoves == 2) {
                System.out.println("You leave the game.");
                break loop;
            } else if (compareMoves == 1) {
                userMove.cpuScore++;
                userMove.gamePlayed++;
                System.out.println(cpu + " beats " + user + ", " + userMove.getUserName() + " loose the round.");
                System.out.println("Score: cpu = " + userMove.getCpuScore() + " " + userMove.getUserName() + " = " + userMove.getUserScore());
            } else if (compareMoves == -1) {
                userMove.userScore++;
                userMove.gamePlayed++;
                System.out.println(user + " beats " + cpu + ", " + userMove.getUserName() + " win the round.");
                System.out.println("Score: cpu = " + userMove.getCpuScore() + " " + userMove.getUserName() + " = " + userMove.getUserScore());
            }
            if (userMove.getCpuScore() == userMove.getWinStreak() || userMove.getUserScore() == userMove.getWinStreak()) {
                System.out.println("Game over.");
                System.out.println("Game played: " + userMove.getGamePlayed());
                if (userMove.getCpuScore() > userMove.getUserScore()) {
                    System.out.println(userMove.getUserName() + " looses " + userMove.getUserScore() + " to " + userMove.getCpuScore());
                } else {
                    System.out.println(userMove.getUserName() + " wins " + userMove.getUserScore() + " to " + userMove.getCpuScore());
                }
                break;
            }
        }
    }
}



