package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeGameTest {

    @org.junit.jupiter.api.Test
    void isWinner() {

    }

    @org.junit.jupiter.api.Test
    void checkIntsTest_True() {
        int x = 2;
        assertTrue(TicTacToeGame.checkInts(x));
    }

    @org.junit.jupiter.api.Test
    void checkIntsTest_False() {
        int x = 6;
        assertFalse(TicTacToeGame.checkInts(x));
    }

    @org.junit.jupiter.api.Test
    void turn() {
    }

    @org.junit.jupiter.api.Test
    void boardFull() {
    }

    @org.junit.jupiter.api.Test
    void checkRows() {
    }

    @org.junit.jupiter.api.Test
    void checkColumns() {
    }

    @org.junit.jupiter.api.Test
    void checkDiagonals() {
    }

    @org.junit.jupiter.api.Test
    void isInFavorOfX() {
    }

    @org.junit.jupiter.api.Test
    void isInFavorOfO() {
    }

    @org.junit.jupiter.api.Test
    void isTie() {
    }

    @org.junit.jupiter.api.Test
    void getWinner() {
    }

    @Test
    void getBoard() {
    }
}