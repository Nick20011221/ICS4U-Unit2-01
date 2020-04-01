import java.util.Scanner;

/**
 * This program creates a 3 number lock and lets the user guess the combo.
 * 
 * @author Nick P-A
 * @since 2020/3/23
 * @version 1.0
 */

 
public class Numberlock {
  static int randomNum;
  static int userGuess;
  static int userGuess2;
  static int userGuess3;
  static int randomInt;
  static int randomInt2;
  static int randomInt3;
  static int comboNumber1;
  static int comboNumber2;
  static int comboNumber3;
  
  /**
  * This class generates 3 random numbers from 0-9 and lets the user try to guess it.
  */
  

  

 
  public static void main(String[] args) {
    firstNumber();
    
  }
 
  /**
   * This class generates a random number from 0-9 and lets the user try to guess it.
  */
  public static void firstNumber() {
    double randomDouble = Math.random();
    randomDouble = randomDouble * 9 + 1;
    int randomInt = (int) randomDouble;
    
    comboNumber1 = randomInt;
    Scanner userInput = new Scanner(System.in);
    System.out.print("try to guess the first number between 0 and 9: ");
    userGuess = userInput.nextInt();
    
    while (userGuess != randomInt) {
      System.out.print("wrong, guess between 0 and 9: ");
      userGuess = userInput.nextInt();
    }

    System.out.println("Correct the first Number is " + randomInt);
    secondNumber();
  }
  
  /**
   * This class generates the second random number from 0-9 and lets the user try to guess it.
  */
  
  public static void secondNumber() {
    
    double randomDouble = Math.random();
    randomDouble = randomDouble * 9 + 1;
    int randomInt2 = (int) randomDouble;
    
    comboNumber2 = randomInt2;
    Scanner userInput = new Scanner(System.in);
    System.out.print("try to guess the second number between 0 and 9: ");
    userGuess2 = userInput.nextInt();
    
    while (userGuess2 != randomInt2) {
      System.out.print("wrong, guess between 0 and 9: ");
      userGuess2 = userInput.nextInt();
    }

    System.out.println("Correct the second Number is " + randomInt2);
    thirdNumber();
  }

  /**
   * This class generates third random number from 0-9 and lets the user try to guess it.
  */

  public static void thirdNumber() {
    
    double randomDouble = Math.random();
    randomDouble = randomDouble * 9 + 1;
    int randomInt3 = (int) randomDouble;
    
    comboNumber3 = randomInt3;
    Scanner userInput = new Scanner(System.in);
    System.out.print("try to guess the third number between 0 and 9: ");
    userGuess3 = userInput.nextInt();
    
    while (userGuess3 != randomInt3) {
      System.out.print("wrong, guess between 0 and 9: ");
      userGuess3 = userInput.nextInt();
    }
    System.out.println("Correct the third Number is " + randomInt3);
    System.out.println("congratulations you guessed the combo which was " + comboNumber1 
        + " " + comboNumber2 + " " + comboNumber3);
  }
}
  