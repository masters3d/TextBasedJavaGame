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

    static public void text(String input, int lines, double seconds) {

        System.out.println(input);
        blankLines(lines);
        waitSeconds(seconds);

    }


    static public void anouncement(String hero, String VS, String badDude) {

        String star = "*";
        String content = hero + VS + badDude + "\n";
        String line = new String(new char[content.length() - 1]).replace("\0", star);

        text("", 1, 0);
        text("        " + line + "\n"
                + "        " + content
                + "        " + line + "\n", 2, 2);

    }

    static public void showTitle() {

        String title
                = "        ******************************\n"
                + "        ***    |  WAR GAMES  |     ***\n"
                + "        ******************************";

        
        text(title, 0, 1.5);
 
        
    }
    
    static public void instructions(){
        
                 
String show = 
"The objective of the game is to kill the monster\n" +
"You play by attacking the monster with one of two modes:\n"+
"If your power/magic is more than the moster,\n"+ 
"You will cause more damage \n";

text(show,0,0);
System.out.print("\n({Enter] to continue...");

        
        
        
    }

    static public void startOfGame() {

        String graphic
                = "                    /                              \n"
                + "     **            /             !!!!!             \n"
                + "     **           /             #!@!@!#            \n"
                + "  ***   **      //              ######             \n"
                + " **  * * **     //    ++++++++++  ||   +++++       \n"
                + " *         *  (/      +//+++   +++++++++  +++++    \n"
                + "*** * *  * *** )    ///       ++++&&&+++++    +++  \n"
                + "    *  *           ////      +++&&&&&& +++      ++ \n"
                + "   *    *          //        ++++&&&&&++++       **\n"
                + "   *    *         //         +++++++++++++         \n"
                + "   *     *       //           ++++++++++++         \n"
                + "  *       *      /              +++++++            \n"
                + "  *        *                    ##  $$             \n"
                + "  *         *                   ##   $$            \n"
                + "  **        **                ###    $$$           \n";

        text(graphic, 0, 1);
    }

    static public void characterSpecs(Character input, int lines, double seconds) {

        String box = String.format(
                "********************************\n"
                + "**       Name  : %s                  \n"
                + "**       Health: %d                  \n"
                + "**       Power : %d                  \n"
                + "**       Magic : %d                  \n"
                + "********************************\n", input.name, input.health, input.power, input.magic);

        text("********************************", 0, 0);
        text(input.lastAttackTitle, 0, 0);
        text(box, 0, 0);
        blankLines(lines);
        waitSeconds(seconds);

    }

    static public void chooseFightMode() {
        System.out.print("Choose 1 for Power Attack or 2 for Magic Attack\n");
        System.out.print("Enter number here: ");
    }

    static public void blankLines(int number) {

        for (int i = 0; i < number; i++) {
            System.out.println();
        }

    }

}
