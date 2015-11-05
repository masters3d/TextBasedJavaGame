package team3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JOHN W SLIWA
 * @author JOSE E JIMENEZ
 */
public class Game {
    
Random random = new Random();
Scanner scanIn = new Scanner( System.in );


String randomName(){
    String[] array = {"Janfeb","Macapri", "Majune", "Julaug", "Sepoct", "Nodec"};
    return array[random.nextInt(6)];
}

String getPlayerName(){
    Display.text("Please type a name for your Character:");
    return scanIn.next();    
}


String getPlayerGender(){
    Display.text("Please type a gender for your Character:");
    return scanIn.next();    
}


public Character createMonster(){  
  int power = random.nextInt(200);
  Character monster  = new Character(randomName(),"male");
  monster.power = power;
  monster.magic = 200 - power;

  return monster;
}


void waitSeconds(double seconds){

 int miliSeconds = (int) (seconds * 1000);
 
 try {
  Thread.sleep(miliSeconds);    
  } catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    
     

}


int randomAttack() {    
    return random.nextInt(2) + 1;
}



public Game() {
    }

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {

int powerAttack = 1;
int magicAttack = 2;    
    
Game game = new Game();

Display.showTitle();
game.waitSeconds(2.5);
Display.startOfGame();
game.waitSeconds(2.5);

//Get Player Info
String name = game.getPlayerName();
Display.blankLines(1);
String gender = game.getPlayerGender();
Display.blankLines(1);

// Create Characters
Character hero = new Character(name,gender);
Character badDude = game.createMonster();

// Display the Character's starting specs
Display.blankLines(2);
game.waitSeconds(2);
Display.characterSpecs(hero);
game.waitSeconds(5);
Display.blankLines(1);
Display.text("This will be your opponent: ");
Display.blankLines(2);
game.waitSeconds(3);
Display.characterSpecs(badDude);
game.waitSeconds(5);

System.out.print("HERO: " + hero.name + " vs "+ "MONSTER: " + badDude.name + "\n");
System.out.print(hero.name + " power: " + Integer.toString(hero.power) + "  magic: " + Integer.toString(hero.magic)+ "\n");
System.out.print(badDude.name + " power: " + Integer.toString(badDude.power) + "  magic: " + Integer.toString(badDude.magic)+ "\n");




do{
 Display.chooseFightMode();
    
        
if (game.scanIn.nextInt() == 1){
 
hero.attack(powerAttack , badDude);
Display.blankLines(1);
System.out.print("HERO STACKS \n");

game.waitSeconds(1);


System.out.print(hero.name + " power: " + Integer.toString(hero.power) + "  magic: " + Integer.toString(hero.magic)+ "\n");
System.out.print(hero.name + " Health: " + Integer.toString(hero.health) + "\n");


System.out.println();
System.out.print("MONSTER STACKS  \n");


game.waitSeconds(1);

badDude.attack(game.randomAttack(), hero);
System.out.print(badDude.name + " power: " + Integer.toString(badDude.power) + "  magic: " + Integer.toString(badDude.magic)+ "\n");
System.out.print(badDude.name + " Health: " + Integer.toString(badDude.health) + " Magic: " +Integer.toString(badDude.magic)+"\n");

System.out.println();
System.out.print(hero.name + " power: " + Integer.toString(hero.power) + "  magic: " + Integer.toString(hero.magic)+ "\n");
System.out.print(hero.name + " Health: " + Integer.toString(hero.health) + " Magic: " +Integer.toString(hero.magic)+"\n");

if (badDude.health <= 0 && hero.health > 0){
    System.out.print(hero.name + " Wins!");
}
else if (hero.health <= 0 && badDude.health > 0){
    System.out.print(badDude.name + " Wins!");
}
else if (hero.health <= 0 && badDude.health <= 0){
    System.out.print(badDude.name + " " + " " + hero.name + " are both Dead!");
}

} 



else{
 
hero.attack(magicAttack , badDude);
System.out.println();
System.out.print("HERO STACKS \n");

game.waitSeconds(1);

System.out.print(hero.name + " power: " + Integer.toString(hero.power) + "  magic: " + Integer.toString(hero.magic)+ "\n");
System.out.print(hero.name + " Health: " + Integer.toString(hero.health) + "\n");


System.out.println();
System.out.print("MONSTER STACKS  \n");

game.waitSeconds(1);

badDude.attack(game.randomAttack(), hero);
System.out.print(badDude.name + " power: " + Integer.toString(badDude.power) + "  magic: " + Integer.toString(badDude.magic)+ "\n");
System.out.print(badDude.name + " Health: " + Integer.toString(badDude.health) + " Magic: " +Integer.toString(badDude.magic)+"\n");

System.out.println();
System.out.print(hero.name + " power: " + Integer.toString(hero.power) + "  magic: " + Integer.toString(hero.magic)+ "\n");
System.out.print(hero.name + " Health: " + Integer.toString(hero.health) + " Magic: " +Integer.toString(hero.magic)+"\n");

if (badDude.health <= 0 && hero.health > 0){
    System.out.print(hero.name + " Wins!");
}
else if (hero.health <= 0 && badDude.health > 0){
    System.out.print(badDude.name + " Wins!");
}
else if (hero.health <= 0 && badDude.health <= 0){
    System.out.print(badDude.name + " " + " " + hero.name + " are both Dead!");
}

}
}
while(badDude.health > 0 && hero.health > 0);

}
}
    
    
   
