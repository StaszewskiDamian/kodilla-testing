package com.kodilla.rps.game;

import org.springframework.stereotype.Component;

@Component
public class ScoreValidator {
    public int compareMoves(Choice cpuChoice, Choice userMove) {

        if (cpuChoice.equals(userMove)) {
            return 0;
        }
        if (userMove.equals(Choice.BREAK)) {
            return 2;
        }

        switch (cpuChoice) {
            case ROCK:
                return (userMove == Choice.SCISSORS ? 1 : -1);
            case PAPER:
                return (userMove == Choice.ROCK ? 1 : -1);
            case SCISSORS:
                return (userMove == Choice.PAPER ? 1 : -1);
        }
        return 0;
    }
}




