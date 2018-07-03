package com.kodilla.sudoku;

public class SudokuProc {

    public boolean isInput(String toValidate) {
        if (toValidate.length() == 3) {
            for (int i = 0; i < 3; i++) {
                if (Character.isDigit(toValidate.charAt(i)) && !String.valueOf(toValidate).contains("0")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean isEmpty(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isValid(int[][] board, int row, int col, int number) {
        return !(isInRow(board, row, number) || isInCol(board, col, number) ||
                isInBox(board, row, col, number));
    }

    private boolean isInRow(int[][] board, int row, int number) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isInCol(int[][] board, int col, int number) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isInBox(int[][] board, int row, int col, int number) {
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
