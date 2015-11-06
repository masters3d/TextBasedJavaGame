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
    private int health = 100;

//Character name and titleAttack
    private String name;
    private String lastAttackTitle = "The starting battle specs are:";

//Character Abilities
    private int power = 100;
    private int magic = 100;
    
    
    
    

    public void attack(int power1ormagic2, Character enemy) {

        String attackName = "";

        switch (power1ormagic2) {
            case 1:
                attackName = "Power";
                break;
            case 2:
                attackName = "Magic";
                break;

        }

        int basePoint = 5;

        int startHealthEnemy = enemy.health;

        if (power1ormagic2 == 1) {

            if (power > enemy.power) {
                enemy.health -= 5 * basePoint;
            } else {
                enemy.health -= 2 * basePoint;
            }
            if (power > 2 * basePoint) {
                power -= 2 * basePoint;
            } else {
                power = 0;
            }

        } else {

            if (magic > enemy.magic) {
                enemy.health -= 4 * basePoint;
            } else {
                enemy.health -= 3 * basePoint;
            }
            if (magic > 2 * basePoint) {
                magic -= 2 * basePoint;
            } else {
                magic = 0;
            }
        }

        lastAttackTitle = attackName + " Attack : Damage " + Integer.toString(startHealthEnemy - enemy.health);

    }

    public Character(String name) {
        this.name = name;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastAttackTitle() {
        return lastAttackTitle;
    }

    public void setLastAttackTitle(String lastAttackTitle) {
        this.lastAttackTitle = lastAttackTitle;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

}
