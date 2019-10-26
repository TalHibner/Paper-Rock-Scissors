package com.imc.JavaHomeAssignment;

/**
 * @author Tal Hibner
 *
 * Enumeration for the hand gestures.
 * Move is an helper class containing the Rock Paper Scissor
 * constant variables and the business logic code to find out who wins.
 */

public enum RockPaperScissorsMove implements Strategy{
	ROCK, PAPER, SCISSORS;
	
	RockPaperScissorsMove losesTo;
	
	/**
     * Compares this move with another move to determining a tie, a win, or
     * a loss.
     * 
     * @param otherMove
     *            move to compare to
     * @return 1 if this move beats the other move, -1 if this move loses to
     *         the other move, 0 if these moves tie
     */
	
	public boolean losesTo(Strategy other) {
	      return losesTo == other;
	}

    static {
    	SCISSORS.losesTo = ROCK;
        ROCK.losesTo = PAPER;
        PAPER.losesTo = SCISSORS;
    }


    //This function will help to display who selected what
    public void display(String who, Strategy otherMove) {
        System.out.println(who + " selected " + otherMove);
    }

}
