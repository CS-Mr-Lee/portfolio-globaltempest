import java.util.*;

/**
 * Name: Eric Wang
 * Date: Feb 12 2022
 * Course: ICS4U1-2A
 * Description: user continuously inputs numerator and divisor.
 * program outputs the result or error message if invalid input is detected
 * program continues looping after error message
 * program is exited when numerator input starts with 'q' or 'Q'
 */

public class Wang_Eric_FoolProof {


    public static void main(String[] args) {

        //variable declaration
        Scanner sc = new Scanner(System.in);
        double top = 0;
        double bottom = 0;
        double answer;
        String checkStr;
        boolean valid;
        boolean done = false;

        //loops to continuously ask for input until user wants to quit
        while (true) {
            valid = false;
            //loops until proper input is entered
            do {
                try {
                    System.out.println("Enter numerator: ");
                    top = sc.nextDouble();
                    valid = true;
                }
                //catches different data types
                catch (InputMismatchException e) {
                    checkStr = sc.nextLine();
                    //checks if first character of indicates quit
                    if (checkStr.charAt(0) == 'Q' || checkStr.charAt(0) == 'q') {
                        done = true;
                        break;
                    }
                    System.out.println("wrong data");
                }

            } while(!valid);

            //if they enter 'q' or 'Q' then program ends
            if (done) {
                break;
            }

            valid = false;
            //loops until proper input is entered
            do {
                try {
                    System.out.println("Enter divisor: ");
                    bottom = sc.nextDouble();
                    valid = true;
                }
                //checks for different data types
                catch (InputMismatchException e) {
                    System.out.println("wrong data");
                    sc.nextLine();
                }

            } while(!valid);

            //prints quotient
            try {
                //checks if bottom is not = 0
                if (bottom != 0){
                    answer = top / bottom;
                    System.out.println("answer is " + answer);
                }
                else {
                    //creates a zero division error
                    answer = (int)top/(int)bottom;
                }
            }
            //catches improper division
            catch (ArithmeticException e) {
                System.out.println("cant divide by zero");
            }
        }





    }

}


