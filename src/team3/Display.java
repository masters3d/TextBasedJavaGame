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

    /**
     *
     * @param input
     * @param lines
     * @param seconds
     */
    static public void text(String input, int lines, double seconds) {

        System.out.print(input);
        blankLines(lines);
        waitSeconds(seconds);

    }

    /**
     *
     * @param hero
     * @param VS
     * @param badDude
     * @param lines
     * @param seconds
     */
    static public void anouncement(String hero, String VS, String badDude, int lines, double seconds) {

        String star = "*";
        String content = hero + VS + badDude + "\n";
        String line = new String(new char[content.length() - 1]).replace("\0", star);

        
        text("        " + line + "\n"
                + "        " + content
                + "        " + line, lines, seconds);

    }

    /**
     *
     */
    static public void showTitle() {

        String title
                = "        ******************************\n"
                + "        ***    |  WAR GAMES  |     ***\n"
                + "        ******************************";

        text(title, 1, 1.5);

    }

    /**
     *
     */
    static public void instructions() {

        String show
                = "The objective of the game is to kill the monster\n"
                + "You play by attacking the monster with one of two modes:\n"
                + "If your power/magic is more than the monster,\n"
                + "You will cause more damage \n";

        text(show, 0, 0);
        System.out.print("\n({Enter] to continue...");

    }

    /**
     *
     */
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

        text(graphic, 1, 1);
    }

    /**
     *
     * @param input
     * @param lines
     * @param seconds
     */
    static public void characterSpecs(Character input, int lines, double seconds) {

        String box = String.format("********************************\n"
                + "**       Name  : %s                  \n"
                + "**       Health: %d                  \n"
                + "**       Power : %d                  \n"
                + "**       Magic : %d                  \n"
                + "********************************\n", input.getName(), input.getHealth(), input.getPower(), input.getMagic());

        text("********************************", 1, 0);
        text(input.getLastAttackTitle(), 1, 0);
        text(box, 1, 0);
        blankLines(lines);
        waitSeconds(seconds);

    }

    /**
     *
     */
    static public void chooseFightMode() {
        System.out.println();
        System.out.print("Choose 1 for Power Attack or 2 for Magic Attack\n");
        System.out.print("Enter number here: ");
    }

    /**
     *
     * @param number
     */
    static public void blankLines(int number) {

        for (int i = 0; i < number; i++) {
            System.out.println();
        }

    }

}
