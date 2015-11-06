package team3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JOHN W SLIWA
 * @author JOSE E JIMENEZ
 */
public class Game {
    
static public  Random random = new Random();
static public Scanner scanIn = new Scanner( System.in );


public String randomName(){
    String[] array = {"Janfeb","Macapri", "Majune", "Julaug", "Sepoct", "Nodec"};
    return array[random.nextInt(6)];
}

public String getPlayerName(){
    Display.text("Please type a name for your Character:", 0 , 0);
    return scanIn.next();    
}

public Character createMonster(){  
  int power = random.nextInt(200);
  Character monster  = new Character(randomName());
  monster.power = power;
  monster.magic = 200 - power;

  return monster;
}


public static void waitSeconds(double seconds){

 int miliSeconds = (int) (seconds * 1000);
 
 try {
  Thread.sleep(miliSeconds);    
  } catch(InterruptedException ex) {
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

int powerAttack = 1;
int magicAttack = 2;    
    
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
Display.text("", 2, 2);
Display.characterSpecs(hero,1,3);
Display.text("This will be your opponent: ", 2, 3);
Display.characterSpecs(badDude,1,1);

System.out.print("HERO: " + hero.name + " vs "+ "MONSTER: " + badDude.name + "\n");

do{
Display.blankLines(1);
Display.characterSpecs(hero,0,0);  
Display.characterSpecs(badDude,1,0);
Display.chooseFightMode();

if (scanIn.nextInt() == 1){ 
hero.attack(powerAttack , badDude);
badDude.attack(randomAttack(), hero);
} 

else{ 
hero.attack(magicAttack , badDude);
waitSeconds(1);
badDude.attack(randomAttack(), hero);
}
}
while(game.alive(badDude,hero));
}



boolean alive(Character badDude, Character hero){
  if(  badDude.health > 0 && hero.health > 0){
      return true;
  }
  else{
      Display.characterSpecs(hero,0,0);  
      Display.characterSpecs(badDude,1,0);
      checkWin(badDude,hero);
      return false;
  }
}

void checkWin(Character badDude, Character hero)
{
if (badDude.health <= 0 && hero.health > 0){
    System.out.println(hero.name + " Wins!");
}
else if (hero.health <= 0 && badDude.health > 0){
    System.out.println(badDude.name + " Wins!");
}
else if (hero.health <= 0 && badDude.health <= 0){
    System.out.println(badDude.name + " " + " " + hero.name + " are both Dead!");
}
}
}
    
    
   
