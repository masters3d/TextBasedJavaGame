package team3;

import static team3.Game.waitSeconds;

/**
 * A helper class with static methods to display text during game.
 *
 * @author JOHN W SLIWA
 * @author JOSE E JIMENEZ
 */
public class Display {

    /**
     * A custom console printer that accepts text and number of blank lines with
     * a wait function built in.
     *
     * @param input scans in the users input
     * @param lines the number of new lines to space out
     * @param seconds how long to pause the console
     * @return boolean
     */
    static public Boolean text(String input, int lines, double seconds) {

        System.out.print(input);
        blankLines(lines);
        waitSeconds(seconds);
        return true;
    }

    /**
     * Start of game announcement. Looks pretty and provides game information.
     *
     * @param hero the heros name
     * @param VS static string
     * @param badDude the monster character's name
     * @param lines number of lines to use for space
     * @param seconds length of time to pause the console
     * @return boolean
     */
    static public Boolean announcement(String hero, String VS, String badDude, int lines, double seconds) {

        String star = "*";
        String content = hero + VS + badDude + "\n";
        String line = new String(new char[content.length() - 1]).replace("\0", star);

        text("        " + line + "\n"
                + "        " + content
                + "        " + line, lines, seconds);

        return true;
    }

    /**
     * Nifty looking title for the start of the game. Wow, so artsy.
     *
     * @return boolean
     */
    static public Boolean showTitle() {

        String title
                = "        ******************************\n"
                + "        ***    |  WAR GAMES  |     ***\n"
                + "        ******************************";

        text(title, 1, 1.5);
        return true;
    }

    /**
     * Game instructions for the user.
     *
     * @return
     */
    static public Boolean instructions() {

        String show
                = "The objective of the game is to kill the monster\n"
                + "You play by attacking the monster with one of two modes:\n"
                + "If your power/magic is more than the monster,\n"
                + "You will cause more damage \n";

        text(show, 0, 0);
        System.out.print("\n({Enter] to continue...");
        return true;
    }

    /**
     * Console art for the game, Depicts a valiant warrior and a bad dude.
     *
     * @return
     */
    static public Boolean startOfGame() {

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
        return true;
    }

    /**
     * Formatted display for communicating the current character's statistics
     * and life points.
     *
     * @param input the heros name
     * @param lines how many blank lines to display
     * @param seconds how long to pause the console
     * @return
     */
    static public Boolean characterSpecs(Character input, int lines, double seconds) {

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
        return true;
    }

    /**
     * Decision making method. Prompts user to make a decision about what type
     * of attack to use.
     *
     * @return boolean
     */
    static public Boolean chooseFightMode() {
        System.out.println();
        System.out.print("Choose 1 for Power Attack or 2 for Magic Attack\n");
        System.out.print("Enter number here: ");
        return true;
    }

    /**
     * a shortcut method for inserting `number` of blank lines.
     *
     * @param number how many blank lines to write to the console
     * @return boolean
     */
    static public Boolean blankLines(int number) {

        for (int i = 0; i < number; i++) {
            System.out.println();
        }
        return true;
    }

}
