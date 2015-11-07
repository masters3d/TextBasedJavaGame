/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import static team3.Game.scanIn;

/**
 * @author JOHN W SLIWA
 * @author JOSE E JIMENEZ
 */
public class GameTest {
    
        @Rule public TestName testName = new TestName();

         /**
     * Character object used for testing.
     */
    Character hero;
    Character enemy;
    Game game;

    /**
     * Instantiates the Character object.
     */
    @Before
    public void setUp() {
        hero = new Character("hero");
        enemy = new Character("enemy");
        game = new Game();
    }
    
    public GameTest() {
    }

    /**
     * Test of randomName method, of class Game.
     */
    @Test
    public void testRandomName() {
       
        String[] array = {"Janfeb", "Macapri", "Majune", "Julaug", "Sepoct", "Nodec"};
        List<String> arrayList = Arrays.asList(array); 
        assertTrue(arrayList.contains(game.randomName()));
       System.out.println(testName.getMethodName() + " PASSED.");
        
    }

    /**
     * Test of getPlayerName method, of class Game.
     */
    @Test
    public void testGetPlayerName() {
        
        // this needs the user input to test properly
        //game.getPlayerName();
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of createMonster method, of class Game.
     */
    @Test
    public void testCreateMonster() {
        assertNotNull(game.createMonster());
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of waitSeconds method, of class Game.
     */
    @Test
    public void testWaitSeconds() {
        assertTrue(Game.waitSeconds(1));
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of randomAttack method, of class Game.
     */
    @Test
    public void testRandomAttack() {
     assertTrue((Game.randomAttack() < 3 && Game.randomAttack() > 0));
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of chooseAttackMode method, of class Game.
     */
    @Test
    public void testChooseAttackMode() {
        
        assertTrue(game.chooseAttackMode(hero, 1, hero));
        System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of alive method, of class Game.
     */
    @Test
    public void testAlive() {
        assertTrue(game.alive(hero, hero));
        System.out.println(testName.getMethodName() + " PASSED.");
        
    }

    /**
     * Test of checkWin method, of class Game.
     */
    @Test
    public void testCheckWin() {
        assertTrue(game.checkWin(hero, enemy));
        System.out.println(testName.getMethodName() + " PASSED.");
    }

    
}
