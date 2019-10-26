/**
 * 
 */
package com.imc.JavaHomeAssignment;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.imc.JavaHomeAssignment.Computer;
import com.imc.JavaHomeAssignment.RockPaperScissorsMove;
import com.imc.JavaHomeAssignment.Strategy;


/**
 * @author TalHibner
 *
 */
public class ComputerTest {

	private Computer computer;
	
	@Before
	public void setUp() throws Exception {
		computer = new Computer();
	}

	/**
	 * Test method for {@link com.imc.JavaHomeAssignment.Computer#getMove()}.
	 */
	@Test
	public void testGetMove() {
		List<RockPaperScissorsMove> moves = Arrays.asList(RockPaperScissorsMove.values()); 

		Strategy computerMove = computer.getMove();
		
		assertTrue(moves.contains(computerMove));
	}
}
