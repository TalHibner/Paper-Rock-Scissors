package com.imc.JavaHomeAssignment;

/**
 * @author Tal Hibner
 *
 * This will be the class help us display the selections made and who won.
 */

public class Utils {
	
	public static void printGameStart(String gameName) {
		printSymbols(20, "*");
		System.out.println();
	    System.out.println(gameName +"!");
	    printSymbols(20, "*");
	    System.out.println();
	}

	
    /**
     * Prints out the statistics of the game. Calculates ties as 1/2 a win in
     * percentage won.
     */
    public static void printGameStats(String winner, int humanScore, int computerScore, int numberOfGames) {
        System.out.println(winner +" WON THE GAME............!!!!!!!!!");
    	
    	int wins = humanScore;
        int losses = computerScore;
        int ties = numberOfGames - humanScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;
    
        // Line
        System.out.print("+");
        printSymbols(4, "-");
        System.out.println("+");
    
        // Print titles
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |\n",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED");
    
        // Line
        System.out.print("|");
        printSymbols(10, "-");
        System.out.print("+");
        printSymbols(10, "-");
        System.out.print("+");
        printSymbols(10, "-");
        System.out.print("+");
        printSymbols(16, "-");
        System.out.println("|");
    
        // Print values
        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);
    
        // Line
        System.out.print("+");
        printSymbols(49, "-");
        System.out.println("+");
    }
    
    public static void printSymbols(int numberOfDashes, String symbol) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print(symbol);
        }
    }

}
