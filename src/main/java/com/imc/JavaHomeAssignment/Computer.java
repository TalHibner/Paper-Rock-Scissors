package com.imc.JavaHomeAssignment;

import java.util.Random;

/**
 * @author Tal Hibner
 *
 * Represents the Computer that is playing with the human.
 * The class chooses a random Move enumeration from either rock, paper, or scissors.
 */

public class Computer implements Player {
	
	//We will let the computer randomly select ROCK PAPER SCISSORS.
	public RockPaperScissorsMove getMove() {
		RockPaperScissorsMove[] moves = RockPaperScissorsMove.values();
	    Random random = new Random();
	    int index = random.nextInt(moves.length);
	    return moves[index];
	}
}
