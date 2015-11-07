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
     *
     */
    static public Random random = new Random();

    /**
     *
     */
    static public Scanner scanIn = new Scanner(System.in);

    /**
     *
     */
    public Game() {
    }
    
    /**
     *
     * @return
     */
    public String randomName() {
        String[] array = {"Janfeb", "Macapri", "Majune", "Julaug", "Sepoct", "Nodec"};
        return array[random.nextInt(6)];
    }

    /**
     *
     * @return
     */
    public String getPlayerName() {

        String toReturn = " ";
        System.out.print("Please name your character:\n");
        System.out.print("Enter text here: ");
        toReturn = scanIn.next();
        scanIn.nextLine();
        return toReturn;

    }

    /**
     *
     * @return
     */
    public Character createMonster() {
        int power = random.nextInt(200);
        Character monster = new Character(randomName());
        monster.setPower(power);
        monster.setMagic(200 - power);

        return monster;
    }

    /**
     *
     * @param seconds
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
     *
     * @return
     */
    public static int randomAttack() {
        return random.nextInt(2) + 1;
    }

    /**
     *
     * @param hero
     * @param attack
     * @param badDude
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
     *
     * @param badDude
     * @param hero
     * @return
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
     *
     * @param badDude
     * @param hero
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
