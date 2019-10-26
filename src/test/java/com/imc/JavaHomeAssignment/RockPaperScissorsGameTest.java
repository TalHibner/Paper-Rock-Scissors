/**
 * 
 */
package com.imc.JavaHomeAssignment;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;


/**
 * @author TalHibner
 *
 */
public class RockPaperScissorsGameTest {
	
	private RockPaperScissorsGame game;
	
	private Scanner inputScanner;// Will help to take inputs from keyboard

	@Before
	public void setUp() throws Exception {
		
	    String input = "3\nTal\nRock";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		inputScanner = new Scanner(System.in);
		game = new RockPaperScissorsGame(inputScanner);
	}
	
	/**
	 * Test method for {@link com.imc.JavaHomeAssignment.RockPaperScissorsGame#getNumberOfGames()}.
	 */
	@Test
	public void testGetNumberOfGames() {
		game.getNumberOfGames();//Getting number of games
		assertEquals(3, game.getNumberOfGamesDesired());
	}
	
	/**
	 * Test method for {@link com.imc.JavaHomeAssignment.RockPaperScissorsGame#getplayerNames()}.
	 */
	@Test
	public void testGetplayerName() {
		inputScanner.nextLine();
	    assertEquals("Tal", game.getplayerName());
	}
	
}
