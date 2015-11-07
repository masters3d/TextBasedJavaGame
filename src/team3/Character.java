package team3;

/**
 * @author JOHN W SLIWA
 * @author JOSE E JIMENEZ
 */
public class Character {

/**
 * Character's health
 */
    private int health = 100;

/**
 * Character's name
 */
    private String name;
/**
 * Useful information for the user
 */
    private String lastAttackTitle = "The starting battle specs are:";

/**
 * Character's power level
 */
    private int power = 100;
/**
 * Character's magic level
 */    
    private int magic = 100;
    
    /**
     * Method that completes the attack sequence based on current character stats
     * @param power1ormagic2
     * @param enemy
     */
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

    /**
     * Simple method to assign the character's name
     * @param name
     */
    public Character(String name) {
        this.name = name;

    }

    /**
     * Gets the character's health
     * @return
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the character's health
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the character's name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the character's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the last attack title
     * @return
     */
    public String getLastAttackTitle() {
        return lastAttackTitle;
    }

    /**
     *
     * @param lastAttackTitle
     */
    public void setLastAttackTitle(String lastAttackTitle) {
        this.lastAttackTitle = lastAttackTitle;
    }

    /**
     *
     * @return
     */
    public int getPower() {
        return power;
    }

    /**
     *
     * @param power
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     *
     * @return
     */
    public int getMagic() {
        return magic;
    }

    /**
     *
     * @param magic
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }

}
