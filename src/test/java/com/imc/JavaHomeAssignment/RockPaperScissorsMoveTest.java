/**
 * 
 */
package com.imc.JavaHomeAssignment;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;


/**
 * @author TalHibner
 *
 */
public class RockPaperScissorsMoveTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.imc.JavaHomeAssignment.RockPaperScissorsMove#losesTo(com.imc.JavaHomeAssignment.Strategy)}.
	 */
	@Test
	public void testRockLosesToPaper() {
		RockPaperScissorsMove[] moves = RockPaperScissorsMove.values();//[ROCK, PAPER, SCISSORS];
	    
	    assertTrue(moves[0].losesTo(moves[1]));
	}
	
	/**
	 * Test method for {@link com.imc.JavaHomeAssignment.RockPaperScissorsMove#losesTo(com.imc.JavaHomeAssignment.Strategy)}.
	 */
	@Test
	public void testScissorsLosesToRock() {
		RockPaperScissorsMove[] moves = RockPaperScissorsMove.values();//[ROCK, PAPER, SCISSORS];
	    
	    assertTrue(moves[2].losesTo(moves[0]));
	}
	
	/**
	 * Test method for {@link com.imc.JavaHomeAssignment.RockPaperScissorsMove#losesTo(com.imc.JavaHomeAssignment.Strategy)}.
	 */
	@Test
	public void testPaperLosesToScissors() {
		RockPaperScissorsMove[] moves = RockPaperScissorsMove.values();//[ROCK, PAPER, SCISSORS];
	    
	    assertTrue(moves[1].losesTo(moves[2]));
	}
}
