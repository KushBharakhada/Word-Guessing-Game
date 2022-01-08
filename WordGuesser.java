/**
 * A class to represent a word guessing game
 * @author Kush Bharakhada
 */
import java.util.Scanner;

public class WordGuesser {

  private static int numberOfLives = 3;
  private static String wordToGuess = Words.getWord();
  private static String hiddenWord = Words.hideWord(wordToGuess);

  /**
   * Checks if the user has guessed a character correct or incorrect
   * @param guess the user's guess
   */
  public static void check(char guess) {
    //Convert the hidden word to an array so specific index's can be replaced
    char[] hiddenWordToArray = hiddenWord.toCharArray();
    String newWord = "";
    boolean incorrectGuess = true;

    for (int i=0; i<wordToGuess.length(); i++) { 
      //If the guessed letter is in the word, replace those asterisks in the array
      //with the letter     
      if (guess == wordToGuess.charAt(i)) {
        hiddenWordToArray[i] = wordToGuess.charAt(i);
        incorrectGuess = false;
      }
    }

    if (incorrectGuess)
      numberOfLives--;

    //Convert array into a string
    for (char c : hiddenWordToArray)
      newWord += c;
    hiddenWord = newWord;
  }

  /**
   * Displays the number of lives the user has (guesses left)
   */
  public static void displayLives() {
    switch (numberOfLives) {
      case 0 -> Display.noLife();
      case 1 -> Display.oneLife();
      case 2 -> Display.twoLives();
      case 3 -> Display.threeLives();
    }
  }

  /**
   * Asks the user for a single character, otherwise user is asked again if multiple
   * characters are given. User is displayed a "YOU WIN" if the word is guessed otherwise
   * displays "YOU LOSE".
   * @param args no command line arguments used
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean win = false;
    
    displayLives();
    while (numberOfLives > 0 && !win) {
      System.out.println();
      System.out.print("Word to guess: ");
      System.out.println(hiddenWord);
      System.out.print("Enter your guess: ");
      String input = sc.nextLine();

      //Only single character's allowed, otherwise keep asking again
      while (input.length() != 1) {
        System.out.print("Enter your guess (single character): ");
        input = sc.nextLine();
      }

      char guess = input.charAt(0);
      check(guess);
      displayLives();

      //If the hidden word contains no asterisks, user wins
      if (hiddenWord.indexOf("*") == -1) {
        System.out.print("Word to guess: ");
        System.out.println(hiddenWord);
        Display.winGame();
        win = true;
      }
    }
    sc.close();

    if (!win) {
      Display.loseGame();
      System.out.println();
      System.out.println("The word was " + wordToGuess + "!");
    }
  }

}
