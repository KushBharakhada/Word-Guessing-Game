/**
 * A class to represent a display for number of lives and win or lose
 * @author Kush Bharakhada
 */

public class Display{

  /**
   * 3 lives display
   */
  public static void threeLives() {
    System.out.println(" _________________________________________________ ");
    System.out.println("|                                           LIVES |");
    System.out.println("|     ooo   ooo       ooo   ooo     ooo   ooo     |");
    System.out.println("|    ooooo ooooo     ooooo ooooo   ooooo ooooo    |");
    System.out.println("|    ooooooooooo     ooooooooooo   ooooooooooo    |");
    System.out.println("|      ooooooo         ooooooo       ooooooo      |");
    System.out.println("|        ooo             ooo           ooo        |");
    System.out.println("|         o               o             o         |");
    System.out.println(" _________________________________________________ ");
  }

  /**
   * 2 lives display
   */
  public static void twoLives() {
    System.out.println(" _________________________________________________ ");
    System.out.println("|                                           LIVES |");
    System.out.println("|     ooo   ooo       ooo   ooo                   |");
    System.out.println("|    ooooo ooooo     ooooo ooooo                  |");
    System.out.println("|    ooooooooooo     ooooooooooo                  |");
    System.out.println("|      ooooooo         ooooooo                    |");
    System.out.println("|        ooo             ooo                      |");
    System.out.println("|         o               o                       |");
    System.out.println(" _________________________________________________ ");
  }

  /**
   * 1 life display
   */
  public static void oneLife() {
    System.out.println(" _________________________________________________ ");
    System.out.println("|                                           LIVES |");
    System.out.println("|     ooo   ooo                                   |");
    System.out.println("|    ooooo ooooo                                  |");
    System.out.println("|    ooooooooooo                                  |");
    System.out.println("|      ooooooo                                    |");
    System.out.println("|        ooo                                      |");
    System.out.println("|         o                                       |");
    System.out.println(" _________________________________________________ ");
  }

  /**
   * No lives left display
   */
  public static void noLife() {
    System.out.println(" _________________________________________________ ");
    System.out.println("|                                           LIVES |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println("|                                                 |");
    System.out.println(" _________________________________________________ ");
  }

  /**
   * You lose display
   */
  public static void loseGame() {
    you();
    //System.out.println(" _________________________________________________ ");
    System.out.println("|                                                 |");
    System.out.println("|    ooo        ooooooo     oooooo    ooooooo     |");
    System.out.println("|    ooo       oo     oo   oooooo    oooooooo     |");
    System.out.println("|    ooo       oo     oo   oo        oo           |");
    System.out.println("|    ooo       oo     oo   oooooo    oooooooo     |");
    System.out.println("|    oooooooo  oo     oo        oo   oo           |");
    System.out.println("|    oooooooo   ooooooo    oooooo    oooooooo     |");
    System.out.println(" _________________________________________________ ");
  }

  /**
   * You win display
   */
  public static void winGame() {
    you();
    //System.out.println(" _________________________________________________ ");
    System.out.println("|                                                 |");
    System.out.println("|      oo           oo    oo    ooo      oo       |");
    System.out.println("|      oo           oo    oo    oo o     oo       |");
    System.out.println("|      oo     oo    oo    oo    oo  oo   oo       |");
    System.out.println("|      oo   oo oo   oo    oo    oo   oo  oo       |");
    System.out.println("|       oo oo   oo oo     oo    oo    oo oo       |");
    System.out.println("|        oo       oo      oo    oo      ooo       |");
    System.out.println(" _________________________________________________ ");
  }

  /**
   * Used with win and lose
   */
  public static void you() {
    System.out.println(" _________________________________________________ ");
    System.out.println("|                                                 |");
    System.out.println("|        oo    oo     ooooooo    oo     oo        |");
    System.out.println("|         oo  oo     oo     oo   oo     oo        |");
    System.out.println("|          oooo      oo     oo   oo     oo        |");
    System.out.println("|           oo       oo     oo   oo     oo        |");
    System.out.println("|           oo       oo     oo    oo   oo         |");
    System.out.println("|           oo        ooooooo      ooooo          |");
    //System.out.println(" _________________________________________________ ");
  }
}