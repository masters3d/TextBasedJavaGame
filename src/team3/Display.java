package team3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JOHN W SLIWA
 * @author JOSE E JIMENEZ
 */
public class Game {

    /**
     * A new random number
     */
    static public Random random = new Random();

    /** 
     * A new console input scanner
     */
    static public Scanner scanIn = new Scanner(System.in);

    /**
     * A console based game. Hero vs Monster
     */
    public Game() {
    }
    
    /**
     * Generates one of six randomly selected names.
     * @return array a randomly selected name
     */
    public String randomName() {
        String[] array = {"Janfeb", "Macapri", "Majune", "Julaug", "Sepoct", "Nodec"};
        return array[random.nextInt(6)];
    }

    /**
     * Prompts user to input their hero's name.
     * @return toReturn Hero's name
     */
    public String getPlayerName() {

        String toReturn = "";
        System.out.print("Please name your character:\n");
        System.out.print("Enter text here: ");
//        toReturn = scanIn.next();
//        scanIn.nextLine();
      
             try {
                toReturn = scanIn.next();
                scanIn.nextLine();
            } catch (InputMismatchException ime) {
                
                scanIn.nextLine();
            }
             
            return toReturn;
        

    }

    /**
     * Constructor for the monster. Generates random stats and name
     * @return monster with random stats and name
     */
    public Character createMonster() {
        int power = random.nextInt(200);
        Character monster = new Character(randomName());
        monster.setPower(power);
        monster.setMagic(200 - power);

        return monster;
    }

    /**
     * Method for adding a small delay that allows the user time to read information.
     * @param seconds how many seconds to wait
     * @return true a boolean value indicating the wait was successful.
     */
    public static Boolean waitSeconds(double seconds) {

        int miliSeconds = (int) (seconds * 1000);

        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return true;
    }

    /**
     * generates a 1 or a 2 for randomly selecting the attack mode for the monster.
     * @return random  1 for power attack, 2 for magic attack
     */
    public static int randomAttack() {
        return random.nextInt(2) + 1;
    }

    /**
     * Decision making method, accepts a 1 or a 2. 1 is for power attack, 2 is for magic attack
     * @param hero the game's hero
     * @param attack the user or randomly generated attack decision.
     * @param badDude the games very ugly bad dude a.k.a. the monster.
     * @return true boolean value showing the code was completed successfully. 
     */
    public Boolean chooseAttackMode(Character hero, int attack, Character badDude) {
        int powerAttack = 1;
        int magicAttack = 2;

        if (attack == 1) {
            hero.attack(powerAttack, badDude);
            badDude.attack(randomAttack(), hero);
        } else {
            hero.attack(magicAttack, badDude);
            badDude.attack(randomAttack(), hero);
        }
        return true;
    }

    /**
     * Method for checking whether or not a character has died.
     * @param badDude
     * @param hero
     * @return boolean true only if both characters are still alive.
     */
    public boolean alive(Character badDude, Character hero) {
        if (badDude.getHealth() > 0 && hero.getHealth() > 0) {
            return true;
        } else {
            checkWin(badDude, hero);
            return false;
        }
    }

    /**
     * Checks to see if the game is over. Displays winner.
     * @param badDude
     * @param hero
     * @return 
     */
    public Boolean checkWin(Character badDude, Character hero) {

        String whoWins = " ";

        if (badDude.getHealth() <= 0 && hero.getHealth() > 0) {
            whoWins = hero.getName() + " Wins!";
            badDude.setHealth(0);

        } else if (hero.getHealth() <= 0 && badDude.getHealth() > 0) {
            whoWins = badDude.getName() + " Wins!";
            hero.setHealth(0);
          
        } else if (hero.getHealth() <= 0 && badDude.getHealth() <= 0) {
            whoWins = badDude.getName() + " and " + hero.getName() + " are both Dead!";
            hero.setHealth(0);
            badDude.setHealth(0);

        }
        Display.blankLines(1);
        Display.characterSpecs(hero, 0, 0);
        Display.characterSpecs(badDude, 0, 0);
        Display.announcement("| ", whoWins, " |", 1, 5);
        
        return true;
    }

    /**
     * The actual game logic. Build characters, calls display and inputs decisions into game logic.
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Game game = new Game();

        Display.showTitle();
        Display.startOfGame();

//Get Player Info
        String name = game.getPlayerName();
        Display.blankLines(1);

// Create Characters
        Character hero = new Character(name);
        Character badDude = game.createMonster();

// Display the Character's starting specs
        Display.instructions();
        scanIn.nextLine();
        Display.text("Let the games begin.", 2, 1);
        Display.announcement(hero.getName(), " VS ", badDude.getName(), 2, 2);

        int attackMode = -1;
        do {
            Display.blankLines(1);
            Display.characterSpecs(hero, 0, 0);
            Display.characterSpecs(badDude, 1, 0);
            Display.chooseFightMode();

            try {
                attackMode = scanIn.nextInt();
                game.chooseAttackMode(hero, attackMode, badDude);
            } catch (InputMismatchException ime) {
                attackMode = -1;
                scanIn.nextLine();
            }

        } while (game.alive(badDude, hero));
    }

}
