/**
 * 
 */
package com.imc.JavaHomeAssignment;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;


/**
 * @author TalHibner
 *
 */
public class HumanTest extends TestCase {
	
	private Human human;
	private Scanner inputScanner;

	@Before
	protected void setUp() throws Exception {
	    String input = "Tal\nRock";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		inputScanner = new Scanner(System.in);
        human = new Human(inputScanner);
	}

	/**
	 * Test method for {@link com.imc.JavaHomeAssignment.Human#askName()}.
	 */
	@Test
	public void testAskName() {
	    human.askName();
	    assertEquals("Tal", human.getName());
	}

	/**
	 * Test method for {@link com.imc.JavaHomeAssignment.Human#getMove()}.
	 * we except it first to print invalid choice cause we started with the name for the last test
	 */
	@Test
	public void testGetMove() {
		List<RockPaperScissorsMove> moves = Arrays.asList(RockPaperScissorsMove.values()); 

		Strategy humanMove = human.getMove();
		
		assertTrue(moves.contains(humanMove));
	}
}
