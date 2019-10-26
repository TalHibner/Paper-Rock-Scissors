package com.imc.JavaHomeAssignment;

import java.util.Scanner;

/**
 * @author Tal Hibner
 *
 * This will be the class where we will write the game.
 * The class containing the main function where the program execution will begin.
 */
public class RockPaperScissorsGame 
{
	private Human human;
	private Computer computer;
	private int humanScore;
	private int computerScore;
	private int numberOfGamesPlayed;

	private int numberOfGamesDesired;
	
	private Scanner inputScanner;// Will help to take inputs from keyboard
	
	//Default Constructor initializing the instance variables
    public RockPaperScissorsGame() {
    	inputScanner = new Scanner(System.in);
        human = new Human(inputScanner);
        computer = new Computer();
        humanScore = 0;
        computerScore = 0;
        numberOfGamesPlayed = 0;
    }
    
	//Default Constructor initializing the instance variables
    public RockPaperScissorsGame(Scanner inputScanner) {
    	this.inputScanner = inputScanner;
        human = new Human(inputScanner);
        computer = new Computer();
        humanScore = 0;
        computerScore = 0;
        numberOfGamesPlayed = 0;
    }
    
    public void startGame() {
    	Utils.printGameStart("ROCK, PAPER, SCISSORS");
        
        Strategy humanMove = human.getMove();
        ((RockPaperScissorsMove) humanMove).display(human.getName(), humanMove);
        Strategy computerMove = computer.getMove();
        ((RockPaperScissorsMove) computerMove).display("Computer", computerMove);
    
     // Compare moves and determine winner
        if (humanMove.equals(computerMove)) {
            System.out.println("Tie!");
            Utils.printSymbols(40, "-");
            System.out.println();
        }else if(computerMove.losesTo(humanMove)){
            System.out.println(humanMove + " beats " + computerMove + ". You are the WINNER of this move! :-)");
            Utils.printSymbols(40, "-");
            System.out.println();
            humanScore++;
        }else {// Computer wins
            System.out.println(computerMove + " beats " + humanMove + ". You lost in this move :-(");
            Utils.printSymbols(40, "-");
            System.out.println();
            computerScore++;
        }
        
        numberOfGamesPlayed++;
        
        if(numberOfGamesPlayed==numberOfGamesDesired)
        {
        	String winner = computerScore > humanScore ? "Computer" : "YOU";
            Utils.printGameStats(winner, humanScore, computerScore, numberOfGamesPlayed);
            System.exit(0);
        }else {
        	System.out.println("Lets play again!");
            startGame();
        }
    }
    

    
	public int getNumberOfGamesDesired() {
		return numberOfGamesDesired;
	}
    
	protected void getNumberOfGames() {
        System.out.println("Please enter the number of games you want to play");
        while (!inputScanner.hasNextInt() && inputScanner.nextLine().charAt(0) != '-' ) {
            System.out.println("That's not a positive number!");
            inputScanner.next();
        }
        numberOfGamesDesired = Integer.parseInt(inputScanner.nextLine());
	}
	
    //helps to get the users name
    public String getplayerName() {
        human.askName();
        return human.getName();
    }
        
    public static void main( String[] args )
    {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        game.getNumberOfGames();//Getting number of game
        game.getplayerName();//Getting user name
        game.startGame();
    }

}
