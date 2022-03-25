import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tictactoe.Person;
import tictactoe.TicTacToeEngine;
import tictactoe.TicTacToeGame;
import tictactoe.TicTacToePlayer;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeEngineTest {


    @org.junit.jupiter.api.Test
    void getWinner() {
        //given
        TicTacToeGame game = new TicTacToeGame();
        game.board(new Character[][]{
                {'X', 'O', ' '},
                {'X', ' ', ' '},
                {'X', ' ', ' '}
        });
        Person bob = new Person();
        bob.setfName("Bob");
        TicTacToePlayer player1 = new TicTacToePlayer(bob);
        TicTacToePlayer player2 = new TicTacToePlayer(new Person());
        TicTacToeEngine x = new TicTacToeEngine(game,player1,player2);
        String actual = "Winner is Bob";
        //when
        String result = x.getWinner(player1);
        //then
        assertEquals(actual,result);
    }

    @org.junit.jupiter.api.Test
    void getWinner2() {
        //given
        TicTacToeGame game = new TicTacToeGame();
        game.board(new Character[][]{
                {'X', 'O', 'X'},
                {'X', 'X', 'O'},
                {'O', 'X', 'O'}
        });
        Person bob = new Person();
        bob.setfName("Bob");
        TicTacToePlayer player1 = new TicTacToePlayer(bob);
        TicTacToePlayer player2 = new TicTacToePlayer(new Person());
        TicTacToeEngine x = new TicTacToeEngine(game,player1,player2);
        String actual = "It is a tie";
        //when
        String result = x.getWinner(player1);
        //then
        assertEquals(actual,result);
    }

    @org.junit.jupiter.api.Test
    void getWinner3() {
        //given
        TicTacToeGame game = new TicTacToeGame();
        game.board(new Character[][]{
                {'X', 'O', 'X'},
                {'X', ' ', 'O'},
                {'O', 'X', 'O'}
        });
        Person bob = new Person();
        bob.setfName("Bob");
        TicTacToePlayer player1 = new TicTacToePlayer(bob);
        TicTacToePlayer player2 = new TicTacToePlayer(new Person());
        TicTacToeEngine x = new TicTacToeEngine(game,player1,player2);
        String actual = " ";
        //when
        String result = x.getWinner(player1);
        //then
        assertEquals(actual,result);
    }

    @Test
    void getGame() {

        TicTacToeGame tt = new TicTacToeGame();
        tt.board(new Character[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        });
        //when
        TicTacToeGame tt2 = new TicTacToeGame();
        //then
        TicTacToeGame game = new TicTacToeGame();
        TicTacToePlayer player1 = new TicTacToePlayer(new Person());
        TicTacToePlayer player2 = new TicTacToePlayer(new Person());
        TicTacToeEngine x = new TicTacToeEngine(game,player1,player2);
        game.turn("1 1",'X');

        game = x.getGame();

        Assertions.assertEquals(tt.board,game.board);
    }
}