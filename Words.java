/**
 * A class to represent the words used in the guessing game
 * @author Kush Bharakhada
 */

public class Words {

  /**
   * Contains all possible words and returns a random word from the array
   * @return a random word
   */
  public static String getWord() {
    String[] wordsArray = {
      "able", "about", "account", "acid", "across", "act" , "addition", "adjustment",
      "advertisement", "after", "again", "against" , "agreement", "air" , "all" ,
      "almost", "among" ,"amount" , "amusement", "and", "angle", "angry", "animal",
      "answer", "ant", "any", "apparatus", "apple", "approval", "arch", "argument",
      "arm", "army", "art", "as", "at", "attack", "attempt", "attention", "attraction",
      "authority" , "automatic", "awake", "baby", "back", "bad", "bag", "balance",
      "ball", "band", "base", "basin", "basket", "bath", "be", "beautiful", "because",
      "bed", "bee", "before", "behaviour", "belief", "bell", "bent", "berry", "between",
      "bird", "birth", "bit" ,"bite", "bitter", "black", "blade", "blood", "blow",
      "blue", "board", "boat", "body", "boiling", "bone", "book", "boot", "bottle",
      "box", "boy", "brain", "brake", "branch", "brass", "bread", "breath", "brick",
      "bridge", "bright", "broken", "brother", "brown", "brush", "bucket"
    };
    double randomNumber = Math.random() * wordsArray.length;
    int positionOfWord = (int)randomNumber;
    String chosenWord = wordsArray[positionOfWord];
    return chosenWord;    
  }

  /**
   * Takes a word as a parameter and converts all the letters into asterisk
   * @param word the word to be converted into asterisks
   * @return a hidden word in asterisks
   */
  public static String hideWord(String word) {
    String hiddenWord = "";
    for (int i=0; i<word.length(); i++)
      hiddenWord += "*";
    return hiddenWord; 
  }
  
}
