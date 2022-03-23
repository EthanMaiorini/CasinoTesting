package tictactoe;




import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToeEngine  //extends GameEngine<TicTacToePlayer,TicTacToeGame>
{
    public TicTacToeGame game;
    public TicTacToePlayer player1;
    public TicTacToePlayer player2;

    public TicTacToeEngine(TicTacToeGame game, TicTacToePlayer player1,TicTacToePlayer player2) {
       this.game = game;
       this.player1 = player1;
       this.player2 = player2;
    }


    public void start() {
        String result, move, win;
        Boolean gameOver = false;
        System.out.println(game.getBoard());
                //printBoard();
              while(!gameOver){
               for (int x = 0; x < 2 ; x++) {
                    do {
                        if (x == 0) {
                            move = player1.getMove();
                            result = game.turn(move, 'X');
                            win = getWinner(player1);
                            if (win.equals( "Winner is " + player1.player.fName)) {
                                gameOver = true;
                                System.out.println(win);
                                break;
                            }
                        } else {
                                move = player2.getMove();
                                result = game.turn(move, 'O');
                                win = getWinner(player2);
                                if (win.equals("Winner is " + player2.player.fName)) {
                                    gameOver = true;
                                    System.out.println(win);
                                    break;
                                }
                            }
                                if (result.equals("Not a valid Move")) {
                                    System.out.println(result);
                                }

                }while(result.equals("Not a valid Move"));
                   if (win.equals("It is a tie")){
                       gameOver = true;
                       System.out.println(win);
                       break;
                   }
                   }
                   //ask if you want to exit
            }
            replay();
    }

    public TicTacToeGame getGame() {
       return new TicTacToeGame();
    }

    public String getWinner(TicTacToePlayer player){
        if (game.isWinner()) {
          return "Winner is " + player.player.fName;
        }else if (game.boardFull())
            return "It is a tie";
        return " ";
    }

    public void exitGame() {
        System.out.println("Thank you for playing!");
    }

    public void replay() {;
        String input;
        //Play Again?
        Scanner scanner = new Scanner(System.in);
        // try{
        System.out.println(" Play again? (Y/N): ");
        input = scanner.nextLine();
        if(input.toUpperCase().equals("Y") ||(input.toUpperCase().equals("YES"))){
            this.game = getGame();
            this.start();
        }else exitGame();
    }

     public static void main(String[] args){
        TicTacToeGame game = new TicTacToeGame();
        Person bob = new Person();
        bob.setfName("Bob");
        Person joe = new Person();
        joe.setfName("Joe");
        TicTacToePlayer bobT = new TicTacToePlayer(bob);
        TicTacToePlayer joeT = new TicTacToePlayer(joe);
        TicTacToeEngine x = new TicTacToeEngine(game,bobT,joeT);
        x.start();
    }

//    public Iterable<Person> getPlayers() {
//    }
}
