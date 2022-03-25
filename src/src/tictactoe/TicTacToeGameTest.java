package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeGameTest {



    @org.junit.jupiter.api.Test
    void isWinner() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', ' ', 'X'},
                {'X', 'X', 'X'}
        });
        boolean expected = true;
        //when
        boolean actual = tt.isWinner();
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void isWinner2() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'O', 'O', 'X'},
                {'O', ' ', 'X'},
                {'O', 'X', 'O'}
        });
        boolean expected = true;
        //when
        boolean actual = tt.isWinner();
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void isWinner3() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'O', 'O', 'X'},
                {'X', ' ', 'X'},
                {'O', 'X', 'O'}
        });
        boolean expected = false;
        //when
        boolean actual = tt.isWinner();
        //then
        assertEquals(expected,actual);
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
    void turnTest() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'O', 'O', 'X'},
                {'X', ' ', 'X'},
                {'O', 'X', 'O'}
        });
        String move = "1 1";
        String expected = "Move Complete";
        //when
        String actual = tt.turn(move,'X');

        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void turnTest2() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'O', 'O', 'X'},
                {'X', ' ', 'X'},
                {'O', 'X', 'O'}
        });
        String move = "0 1";
        String expected = "Not a valid Move";
        //when
        String actual = tt.turn(move,'X');

        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void turnTest3() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'O', 'O', 'X'},
                {'X', 'O', 'X'},
                {'O', 'X', 'O'}
        });
        String move = "0 1";
        String expected = "Board Full";
        //when
        String actual = tt.turn(move,'X');

        //then
        assertEquals(expected,actual);
    }


    @org.junit.jupiter.api.Test
    void boardFullTest() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        });
        boolean expected = true;
        //when
        boolean actual = tt.boardFull();
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void boardFullTest2() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', ' ', 'X'},
                {'X', 'X', 'O'}
        });
        boolean expected = false;
        //when
        boolean actual = tt.boardFull();
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void checkRowsTest() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'X', 'X'},
                {'O', ' ', 'X'},
                {'X', 'X', 'O'}
        });
        boolean expected = true;
        //when
        boolean actual = tt.checkRows('X');
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void checkRowsTest2() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        });
        boolean expected = false;
        //when
        boolean actual = tt.checkRows('X');
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void checkColumnsTest() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'O', 'O', 'X'},
                {'O', ' ', 'X'},
                {'O', 'X', 'O'}
        });
        boolean expected = true;
        //when
        boolean actual = tt.checkColumns('O');
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void checkColumnsTest2() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'O', 'O', 'X'},
                {'X', ' ', 'X'},
                {'O', 'X', 'O'}
        });
        boolean expected = false;
        //when
        boolean actual = tt.checkColumns('O');
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void checkDiagonals() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', 'X', 'X'},
                {'X', 'X', 'O'}
        });
        boolean expected = true;
        //when
        boolean actual = tt.checkDiagonals('X');
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void checkDiagonals2() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        });
        boolean expected = false;
        //when
        boolean actual = tt.checkDiagonals('X');
        //then
        assertEquals(expected,actual);
    }


    @org.junit.jupiter.api.Test
    void isInFavorOfX() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', ' ', 'X'},
                {'X', 'X', 'X'}
        });
        boolean expected = true;
        //when
        boolean actual = tt.isInFavorOfX();
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void isInFavorOfX2() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', ' ', 'X'},
                {'X', 'X', 'O'}
        });
        boolean expected = false;
        //when
        boolean actual = tt.isInFavorOfX();
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void isInFavorOfO() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'O', 'O'}
        });
        boolean expected = true;
        //when
        boolean actual = tt.isInFavorOfO();
        //then
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void isInFavorOfO2() {
        //given
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', ' ', 'X'},
                {'X', 'X', 'O'}
        });
        boolean expected = false;
        //when
        boolean actual = tt.isInFavorOfO();
        //then
        assertEquals(expected,actual);
    }

    @Test
    void getBoard() {
        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        });
        //when
        TicTacToeGame tt2 = new TicTacToeGame();
        //then
        assertEquals(tt.board,tt2.board);
    }
}