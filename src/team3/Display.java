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
public class Display {
    
static public void text(String input){
    
    System.out.println(input);
}    

static public void showTitle(){

    String title =
"        ******************************\n" +
"        ***    ┌──────────────┐    ***\n" +
"        ***    │  WAR GAMES   │    ***\n" +
"        ***    └──────────────┘    ***\n" +
"        ******************************";

text(title);    
    
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

 String game = 
         
"**********************************************************\n" +
"**********************************************************\n" +
"***    ┌───────────────────────────────────────┐       ***\n" +
"***    │                                       │       ***\n" +
"***    │               WAR GAMES               │       ***\n" +
"***    │                                       │       ***\n" +
"***    └───────────────────────────────────────┘       ***\n" +
"**********************************************************\n" +
"**********************************************************";
    
text(graphic);  
 
}


static public void characterSpecs(Character input){
       
  String box =  String.format(
"********************************\n" +
"**       Name  : %s                  \n" +
"**       Health: %d                  \n" +
"**       Power : %d                  \n" +
"**       Magic : %d                  \n" + 
"********************************\n", input.name,input.health, input.power,input.magic);
  
  text("********************************" );
  text("These are " + input.name + "'s battle specs");
  text(box);
  
  
  
  
}

static public void chooseFightMode(){
       text("Choose 1 or 2");
    }
    
static public void blankLines(int number){
   
    for(int i = 0; i<number ; i++){
        System.out.println();
    }
        
}
}