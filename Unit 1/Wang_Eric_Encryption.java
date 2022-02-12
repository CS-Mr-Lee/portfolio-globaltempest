import java.util.*;

/**
 * Name: Eric Wang
 * Date: Feb 12 2022
 * Course: ICS4U1-2A
 * Description: Encrypts a line of code where
 * first and last character of each word are swapped
 * middle characters of each word are shifted to rhe character 2 after it in the ASCII table
 * spaces are kept and unchanged
 */

public class Wang_Eric_Encryption {


    public static void main(String[] args) {

        // declaring variables
        Scanner sc = new Scanner(System.in);
        String line;
        String[] allWords;
        String answer = "";
        String word;
        int length;
        char modChar;

        // gets user input and changes input into array of String
        System.out.println("Enter line to be encrypted");
        line = sc.nextLine();
        allWords = line.split(" ");

        // encrypting inputted line
        for (int i = 0; i < allWords.length; i ++) {
            // getting each word from array
            word = allWords[i];
            length = word.length();

            // if length = 1 no point in changing
            if (length > 1) {
                // swap first and last character in word
                word = word.charAt(length-1) + word.substring(1, length-1) + word.charAt(0);

                // shift characters in word by 2
                for (int j = 1; j < length -1; j ++) {
                    modChar = (char)((int)word.charAt(j) + 2);
                    word = word.substring(0, j) + modChar + word.substring(j+1, length);

                }
            }
            // add space between words
            answer = answer + word + " ";
        }
        // outputs encrypted line
        System.out.println(answer);




    }

}


