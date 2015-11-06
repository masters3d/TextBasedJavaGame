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

    static public Random random = new Random();
    static public Scanner scanIn = new Scanner(System.in);

    public String randomName() {
        String[] array = {"Janfeb", "Macapri", "Majune", "Julaug", "Sepoct", "Nodec"};
        return array[random.nextInt(6)];
    }

    public String getPlayerName() {

        String toReturn = " ";
        System.out.print("Please name your Character:\n");
        System.out.print("Enter text here: ");
        toReturn = scanIn.next();
        scanIn.nextLine();
        return toReturn;

    }

    public Character createMonster() {
        int power = random.nextInt(200);
        Character monster = new Character(randomName());
        monster.power = power;
        monster.magic = 200 - power;

        return monster;
    }

    public static void waitSeconds(double seconds) {

        int miliSeconds = (int) (seconds * 1000);

        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }

    public static int randomAttack() {
        return random.nextInt(2) + 1;
    }

    public Game() {
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
        Display.text("Let the games begin.", 1, 1);
        Display.anouncement(hero.name, " VS ", badDude.name);

        int attackMode = 2;
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

    public void chooseAttackMode(Character hero, int attack, Character badDude) {
        int powerAttack = 1;
        int magicAttack = 2;

        if (attack == 1) {
            hero.attack(powerAttack, badDude);
            badDude.attack(randomAttack(), hero);
        } else {
            hero.attack(magicAttack, badDude);
            badDude.attack(randomAttack(), hero);
        }

    }

    public boolean alive(Character badDude, Character hero) {
        if (badDude.health > 0 && hero.health > 0) {
            return true;
        } else {
            checkWin(badDude, hero);
            return false;
        }
    }

    public void checkWin(Character badDude, Character hero) {
        
        String whoWins = " ";
        
        if (badDude.health <= 0 && hero.health > 0) {
            whoWins = hero.name + " Wins!";
            badDude.health = 0;
            
        } else if (hero.health <= 0 && badDude.health > 0) {
            whoWins = badDude.name + " Wins!";
            hero.health = 0;
            Display.characterSpecs(hero, 0, 0);
            Display.characterSpecs(badDude, 1, 0);
        } else if (hero.health <= 0 && badDude.health <= 0) {
            whoWins = badDude.name + " and " + hero.name + " are both Dead!";
            hero.health = 0;
            badDude.health = 0;
           
        }

        Display.characterSpecs(hero, 0, 0);
        Display.characterSpecs(badDude, 1, 0);
        Display.anouncement("| ",whoWins," |");
        System.out.println("Thanks for playing!");
    }
}
