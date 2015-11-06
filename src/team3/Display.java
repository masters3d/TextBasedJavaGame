/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3;

import static team3.Game.waitSeconds;

/**
 * @author JOHN W SLIWA
 * @author JOSE E JIMENEZ
 */
public class Display {
    
static public void text(String input, int lines, double seconds){
    
    System.out.println(input);
    blankLines(lines);
    waitSeconds(seconds);
    
}    

static public void anouncement(String hero, String badDude){
    
    String star = "*";
    String content = hero + " VS " + badDude + "\n";
    String line = new String(new char[content.length()]).replace("\0", star);

    text("",1,0);
    text(line +"\n" + content + line +"\n" , 2, 4);
            
}

static public void showTitle(){

    String title =
"        ******************************\n" +
"        ***    |  WAR GAMES  |     ***\n" +
"        ******************************";

text(title, 0 ,2.5);    
}
static public void startOfGame(){

    String graphic = 
"                    /                              \n" +
"     **            /             !!!!!             \n" +
"     **           /             #!@!@!#            \n" +
"  ***   **      //              ######             \n" +
" **  * * **     //    ++++++++++  ||   +++++       \n" +
" *         *  (/      +//+++   +++++++++  +++++    \n" +
"*** * *  * *** )    ///       ++++&&&+++++    +++  \n" +
"    *  *           ////      +++&&&&&& +++      ++ \n" +
"   *    *          //        ++++&&&&&++++       **\n" +
"   *    *         //         +++++++++++++         \n" +
"   *     *       //           ++++++++++++         \n" +
"  *       *      /              +++++++            \n" +
"  *        *                    ##  $$             \n" +
"  *         *                   ##   $$            \n" +
"  **        **                ###    $$$           \n" ;

    
text(graphic, 0, 1);  
}


static public void characterSpecs(Character input, int lines, double seconds){
       
  String box =  String.format(
"********************************\n" +
"**       Name  : %s                  \n" +
"**       Health: %d                  \n" +
"**       Power : %d                  \n" +
"**       Magic : %d                  \n" + 
"********************************\n", input.name,input.health, input.power,input.magic);
  
  text("********************************" ,0 ,0);
  text("These are " + input.name + "'s battle specs",0 ,0);
  text(box, 0, 0);
  blankLines(lines);
  waitSeconds(seconds);

  
  
}

static public void chooseFightMode(){
       text("Choose 1 for Power Attack or 2 for Magic Attack", 0, 0);
    }
    
static public void blankLines(int number){
   
    for(int i = 0; i<number ; i++){
        System.out.println();
    }
        
}

}
