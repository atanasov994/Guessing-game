/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggamescanner;
import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author martin.atanasov
 */
public class GuessingGameScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(100) + 1;
        
        out.println("       ************         ");
        out.println("Welcome to the Guessing Game");
        out.println("       ************         ");
        out.println();
        
        out.println("Enter your name");
        String name = keyboard.next();
        out.println("Welcome " + name + "!");
        out.println("Lets start guessing!");
        out.print("Enter a number from 1 to 100: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber) {
            out.println();
            if (inputNumber < randomNumber) {
              out.println("Try again with a higher number ...");
            } else {
              out.println("Try again with a lower number ...");
            }
            out.print("Enter a number from 1 to 100: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }

        out.print("You guessed the number after ");
        out.println(numGuesses + " guesses.");

        keyboard.close();
    
    }
    
}
