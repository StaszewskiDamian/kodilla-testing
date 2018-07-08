package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SudokuTestSuite {

    @Test
    public void testMakeCopy() {
        //Given
        int[][] board = new int[9][9];
        SudokuBoard sudokuBoard = new SudokuBoard();
        //When
        int[][] boardCopy = sudokuBoard.makeCopy(board);
        //Then
        Assert.assertEquals(true, Arrays.deepEquals(board, boardCopy));
    }

    @Test
    public void testAddInput() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();
        int[][] board = new int[9][9];
        //When
        sudokuBoard.addInput(board, "666");
        //Then
        Assert.assertEquals(6, board[5][5]);
    }

    @Test
    public void testIsInput() {
        //Given
        SudokuProc sudokuProc = new SudokuProc();
        //When
        //Then
        Assert.assertEquals(true, sudokuProc.isInput("999"));
        Assert.assertEquals(false, sudokuProc.isInput("90"));
    }

    @Test
    public void testIsValid() {
        //Given
        SudokuProc sudokuProc = new SudokuProc();
        int[][] board = new int[9][9];
        //When
        board[6][6] = 6;
        //Then
        Assert.assertEquals(false, sudokuProc.isValid(board, 6, 6, 6));
        Assert.assertEquals(true, sudokuProc.isValid(board, 1, 1, 1));
    }
}
