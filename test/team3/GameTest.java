/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

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
        
    }

    /**
     * Test of getPlayerName method, of class Game.
     */
    @Test
    public void testGetPlayerName() {
    }

    /**
     * Test of createMonster method, of class Game.
     */
    @Test
    public void testCreateMonster() {
    }

    /**
     * Test of waitSeconds method, of class Game.
     */
    @Test
    public void testWaitSeconds() {
    }

    /**
     * Test of randomAttack method, of class Game.
     */
    @Test
    public void testRandomAttack() {
    }

    /**
     * Test of chooseAttackMode method, of class Game.
     */
    @Test
    public void testChooseAttackMode() {
    }

    /**
     * Test of alive method, of class Game.
     */
    @Test
    public void testAlive() {
    }

    /**
     * Test of checkWin method, of class Game.
     */
    @Test
    public void testCheckWin() {
    }

    /**
     * Test of main method, of class Game.
     */
    @Test
    public void testMain() {
    }
    
}
