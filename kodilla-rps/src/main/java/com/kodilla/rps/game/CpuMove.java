package com.kodilla.rps.game;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CpuMove {

    public Choice getCpuMove() {

        Random random = new Random();
        int index = random.nextInt(Choice.values().length - 1);
        return Choice.values()[index];
    }
}
