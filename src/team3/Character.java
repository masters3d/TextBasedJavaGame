/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3;

/**
 * @author JOHN W SLIWA
 * @author JOSE E JIMENEZ
 */
public class Character {
    
// Health and Game Level
protected int health = 100;

//Character name 
protected String name;

//Character Abilities
protected int power = 100;
protected int magic = 100;


void attack(int power1ormagic2 , Character enemy ){
    
    int basePoint = 5;

    if (power1ormagic2 == 1 ){
    
     if (power > enemy.power ){
        enemy.health -= 5*basePoint;
    } else { 
        enemy.health -= 2*basePoint; 
    }
    if (power > 2*basePoint){
        power -= 2*basePoint;
    }
    else {
        power = 0;
    }
        
    } else {
    
    if (magic > enemy.magic){
        enemy.health -= 4*basePoint;
    } else {
        enemy.health -= 3*basePoint;
    } 
    if (magic > 2*basePoint){
    magic -=2*basePoint;
    }
    else{
        magic = 0;
    }
    }

    
}

    public Character(String name) {
        this.name = name;
       
    }
    
   
    
    
}


