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
public class DisplayTest {
    
    public DisplayTest() {
    }
    @Rule public TestName testName = new TestName();

         /**
     * Character object used for testing.
     */
    Character hero;
    Character enemy;

    /**
     * Instantiates the Character object.
     */
    @Before
    public void setUp() {
        hero = new Character("hero");
        enemy = new Character("enemy");
    }
    
    
    /**
     * Test of text method, of class Display.
     */
    @Test
    public void testText() {
        
       assertTrue(Display.text("", 0, 0));
       System.out.println(testName.getMethodName() + " PASSED.");
        
    }

    /**
     * Test of announcement method, of class Display.
     */
    @Test
    public void testAnnouncement() {
       assertTrue(Display.announcement("hero", "VS", "enemy", 0, 0));
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of showTitle method, of class Display.
     */
    @Test
    public void testShowTitle() {
       assertTrue(Display.showTitle());
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of instructions method, of class Display.
     */
    @Test
    public void testInstructions() {
        assertTrue(Display.instructions());
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of startOfGame method, of class Display.
     */
    @Test
    public void testStartOfGame() {
        assertTrue(Display.startOfGame());
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of characterSpecs method, of class Display.
     */
    @Test
    public void testCharacterSpecs() {
        
       assertTrue(Display.characterSpecs(enemy, 0 , 0));
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of chooseFightMode method, of class Display.
     */
    @Test
    public void testChooseFightMode() {
       assertTrue(Display.characterSpecs(enemy, 0 , 0));
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of blankLines method, of class Display.
     */
    @Test
    public void testBlankLines() {
        
        assertTrue(Display.blankLines(1));
       System.out.println(testName.getMethodName() + " PASSED.");
    }
    
}
