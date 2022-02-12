import java.util.*;

/**
 * Name: Eric Wang
 * Date: Feb 11 2022
 * Course: ICS4U1-2A
 * Description: Gets user input of name and price of 2 items and outputs text in formatted manner
 */

public class Wang_Eric_GroceryItem {

    public static void main(String[] args) {

        // declaring variables
        Scanner sc = new Scanner(System.in);
        String item1, item2;
        String cost1, cost2;

        // getting name and cost of items
        System.out.println("What is your first item?");
        item1 = sc.next();
        System.out.println("How much does it cost?");
        cost1 = "$" + String.format("%.2f", sc.nextDouble()); // reads double and formats into String

        System.out.println("What is your second item?");
        item2 = sc.next();
        System.out.println("How much does it cost?");
        cost2 = "$" + String.format("%.2f", sc.nextDouble()); // reads double and formats into String

        //format and output information
        System.out.println("-".repeat(27));
        System.out.printf("%-21s%6s\n", item1, cost1);
        System.out.printf("%-21s%6s\n", item2, cost2);
        System.out.println("-".repeat(27));





    }

}


