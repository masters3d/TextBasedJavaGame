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
public class CharacterTest {
    
    public CharacterTest() {
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
     * Test of attack method, of class Character.
     */
    @Test
    public void testAttack() {
        enemy.attack(1, enemy);
       assertEquals(enemy.getHealth(), 90);
       
        hero.attack(2, hero);
       assertEquals(hero.getHealth(), 85);
       
       
       System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of getHealth method, of class Character.
     */
    @Test
    public void testGetHealth() {
        
        assertEquals(hero.getHealth(), 100);
        System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of setHealth method, of class Character.
     */
    @Test
    public void testSetHealth() {
         assertEquals(hero.getHealth(), 100);
         System.out.println(testName.getMethodName() + " PASSED.");

    }

    /**
     * Test of getName method, of class Character.
     */
    @Test
    public void testGetName() {
         assertEquals(hero.getName(), "hero");
         System.out.println(testName.getMethodName() + " PASSED.");
        
    }

    /**
     * Test of setName method, of class Character.
     */
    @Test
    public void testSetName() {
        
        hero.setName("cheyo");
         assertEquals(hero.getName(), "cheyo");
         System.out.println(testName.getMethodName() + " PASSED.");
        
    }

    /**
     * Test of getLastAttackTitle method, of class Character.
     */
    @Test
    public void testGetLastAttackTitle() {
       
        assertEquals(hero.getLastAttackTitle(), "The starting battle specs are:");
         System.out.println(testName.getMethodName() + " PASSED.");
    }

    /**
     * Test of setLastAttackTitle method, of class Character.
     */
    @Test
    public void testSetLastAttackTitle() {
         hero.setLastAttackTitle("Your end stats are:");
        assertEquals(hero.getLastAttackTitle(), "Your end stats are:");
         System.out.println(testName.getMethodName() + " PASSED.");
        
    }

    /**
     * Test of getPower method, of class Character.
     */
    @Test
    public void testGetPower() {
         assertEquals(hero.getPower(), 100);
         System.out.println(testName.getMethodName() + " PASSED.");
        
    }

    /**
     * Test of setPower method, of class Character.
     */
    @Test
    public void testSetPower() {
        hero.setPower(0);
         assertEquals(hero.getPower(), 0);
         System.out.println(testName.getMethodName() + " PASSED.");
        
    }

    /**
     * Test of getMagic method, of class Character.
     */
    @Test
    public void testGetMagic() {
        assertEquals(hero.getMagic(), 100);
         System.out.println(testName.getMethodName() + " PASSED.");
        
        
    }

    /**
     * Test of setMagic method, of class Character.
     */
    @Test
    public void testSetMagic() {
        hero.setMagic(45);
        assertEquals(hero.getMagic(), 45);
         System.out.println(testName.getMethodName() + " PASSED.");
        
    }
    
}
