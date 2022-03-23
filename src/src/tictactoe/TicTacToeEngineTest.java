package tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeEngineTest {


    @org.junit.jupiter.api.Test
    void getWinner() {

    }

    @Test
    void getGame() {

        TicTacToeGame game = new TicTacToeGame();
        TicTacToePlayer player1 = new TicTacToePlayer(new Person());
        TicTacToePlayer player2 = new TicTacToePlayer(new Person());
        TicTacToeEngine x = new TicTacToeEngine(game,player1,player2);
        game.turn("1 1",'X');
        String board = game.getBoard();
        game = x.getGame();
        String board2 = game.getBoard();
        assertFalse(board.equals(board2));
    }
}