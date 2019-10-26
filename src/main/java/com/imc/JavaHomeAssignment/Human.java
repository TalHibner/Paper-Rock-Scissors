package com.imc.JavaHomeAssignment;

import java.util.Scanner;

/**
 * @author Tal Hibner
 *
 * Represents the human who is going to play the game with the computer.
 * The class that prompts the Human for either rock, paper, or scissors.
 */

public class Human implements Player {

	private String name;// Represents the Players name
	private Scanner inputScanner;// Will help to take inputs from keyboard
        
    public Human(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    
    public void askName() {// Will let the user enter his name
        System.out.println("Please enter your name");
        name = inputScanner.nextLine();
    }
     
    //We will ask the user to enter his name. Then select one among ROCK PAPER SCISSORS.
    public RockPaperScissorsMove getMove() {
    	// Prompt the user
        System.out.println("Please Select: Rock, paper, or scissors? ");
        
        // Get the user input
        while (inputScanner.hasNextLine()) {
	        String userInput = inputScanner.nextLine();
	
	        try {
	        	System.out.println(userInput);
	        	return RockPaperScissorsMove.valueOf(userInput.toUpperCase());
	          } catch (Exception e) {
	            System.out.println("Invalid choice");
	            continue;
	          }
        }
        
        // User has not entered a valid input. Prompt again.
        return getMove();
    }
}
