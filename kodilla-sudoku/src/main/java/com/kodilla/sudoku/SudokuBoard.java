package com.kodilla.sudoku;

import java.util.Random;

public class SudokuBoard {
    private SudokuProc proc = new SudokuProc();

    public void printBoard(int[][] board) {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0) {
                System.out.print("\n");
            }
            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0) {
                    System.out.print(" ");
                }
                if (board[row][col] == 0) {
                    System.out.print(".  ");
                } else {
                    System.out.print(board[row][col] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] makeCopy(int[][] board) {
        int[][] copy = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                copy[i][j] = board[i][j];
            }
        }
        return copy;
    }

    public int[][] addInput(int[][] board, String input) {
        int row = Character.getNumericValue(input.charAt(0)) - 1;
        int col = Character.getNumericValue(input.charAt(1)) - 1;
        int val = Character.getNumericValue(input.charAt(2));
        int[][] copy = makeCopy(board);
        if (proc.isValid(copy, row, col, val)) {
            copy[row][col] = val;
            if (solveSudoku(copy)) {
                board[row][col] = val;
            } else {
                System.out.println("The cell you enter won't help you in solving board, try again.");
            }
        } else {
            System.out.println("This digit is in the sequence");
        }
        return board;
    }

    public int[][] InitBoard() {
        Random random = new Random();
        int[][] board = new int[9][9];
        for (int i = 0; i < 25; i++) {
            int row = random.nextInt(8);
            int col = random.nextInt(8);
            int val = random.nextInt(9);
            if (proc.isValid(board, row, col, val) && solveSudoku(makeCopy(board))) {
                board[row][col] = val;
            }
        }
        return board;
    }

    public boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int number = 1; number <= 9; number++) {
                        if (proc.isValid(board, row, col, number)) {
                            board[row][col] = number;
                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
