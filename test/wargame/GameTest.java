/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package wargame;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ranjeet
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Game.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Game.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameName method, of class Game.
     */
    @Test
    public void testGetGameName() {
        System.out.println("getGameName");
        Game instance = null;
        String expResult = "";
        String result = instance.getGameName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = null;
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> players = null;
        Game instance = null;
        instance.setPlayers(players);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Game instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Game instance = null;
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
