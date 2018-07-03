package com.kodilla.sudoku;

import java.util.Scanner;

public class UserInput {

    private Scanner read = new Scanner(System.in);
    private SudokuBoard board = new SudokuBoard();
    private SudokuProc proc = new SudokuProc();
    private int[][] init = board.InitBoard();

    private boolean endGame = true;

    private void printHead() {
        System.out.println("       SU  do  KU");
        board.printBoard(init);
        System.out.println("Enter three digits from 1 to 9 to set row, column and value of the cell. " +
                "Enter n for solving board. Enter x to quit.");
    }

    public void UserInput() {
        printHead();

        String input = read.next();

        while (endGame) {
            switch (input) {
                case "n":
                    System.out.println("Solved board:");
                    if (board.solveSudoku(init)) {
                        board.printBoard(init);
                    } else {
                        System.out.println("Can't find solution");
                    }
                    endGame = false;
                    break;
                case "x":
                    System.out.println("You quit.");
                    endGame = false;
                    break;
                default:
                    if (proc.isInput(input)) {
                        board.addInput(init, input);
                    }else{
                        System.out.println("You entered wrong input.");
                    }
                    board.printBoard(init);
                    if (!proc.isEmpty(init)) {
                        System.out.println("You solved the board");
                        endGame = false;
                        break;
                    }
                    System.out.println("Enter three digits from 1 to 9 to set row, column and value of the cell." +
                            " Enter n for solving board. Enter x to quit.");
                    input = read.next();
                    break;
            }
        }
    }
}


