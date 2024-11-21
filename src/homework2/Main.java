package homework2;
import java.lang.Character;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        vowelCounter("The quick brown fox jumped over the lazy dog.");
        System.out.println();
        vowelCounter("aaeeeeiiiioouuuu");
        System.out.println();
        palindromeChecker("level");
        System.out.println();
        palindromeChecker("abcde");
        System.out.println();
        palindromeChecker("racecar");
        System.out.println();
        palindromeChecker("aBbA");
        System.out.println();
        //extra credit
        palindromeChecker("s*dfj*js");
        System.out.println();
        palindromeChecker("jf&fj");

    }

    public static void vowelCounter(String str) {
        //initialize the variables for counting vowels
        int numA = 0;
        int numE = 0;
        int numI = 0;
        int numO = 0;
        int numU = 0;
        //the selected character in the loop will be converted to lowercase and manually check if it is one of the 5 vowels
        for (char letter : str.toCharArray()) {

            if (Character.toLowerCase(letter) == 'a') {
                numA++;
            } else if (Character.toLowerCase(letter) == 'e') {
                numE++;
            } else if (Character.toLowerCase(letter) == 'i') {
                numI++;
            } else if (Character.toLowerCase(letter) == 'o') {
                numO++;
            } else if (Character.toLowerCase(letter) == 'u') {
                numU++;
            }
        }
        //print the results!
        System.out.println("Number of a's: " + numA);
        System.out.println("Number of e's: " + numE);
        System.out.println("Number of i's: " + numI);
        System.out.println("Number of o's: " + numO);
        System.out.println("Number of u's: " + numU);
    }

    public static void palindromeChecker(String str) {
        //initializes a variable to compare the character in the loop to
        int compareTo = str.length()-1;
        for (char letter : str.toCharArray()) {
            //if the selected character from the loop does not equal its opposite counterpart
            //it will check for an invalid, print, and break
            if (Character.toLowerCase(letter) != (str.toLowerCase()).charAt(compareTo)) {
                if (!Character.isLetter(letter)) {
                    System.out.println(str.toLowerCase() + " has an invalid character");
                    break;
                }
                System.out.println(str.toLowerCase() + " is not a palindrome.");
                break;
            } else {
                //iterates the compared character variable and checks for both an invalid character
                //and if it has finished iterating it will print
                compareTo--;
                if (!Character.isLetter(letter)) {
                    System.out.println(str.toLowerCase() + " has an invalid character");
                    break;
                }
                if (compareTo == 0) {
                    System.out.println(str.toLowerCase()+" is a palindrome.");
                    break;
                }
            }
        }
    }
}