import java.util.*;

/**
 * Name: Eric Wang
 * Date: Feb 12 2022
 * Course: ICS4U1-2A
 * Description: Method that takes 2 side lengths and an angle between the given sides and
 * returns the smallest angle in the triangle
 */

public class Wang_Eric_SASTriangleSolver {

    /**
     * triangleSolver
     * Description: calculates the smallest angle in a triangle given 2 side lengths and the inner angle
     * @param length1 one of the side lengths of the triangle
     * @param length2 one of the side lengths of the triangle
     * @param innerAngle angle between length1 and length2 in radians
     * @return smallest angle in the triangle in degrees
     */
    public static double triangleSolver(double length1, double length2, double innerAngle) {

        double length3 = Math.sqrt(length1*length1 + length2*length2 - 2*length1*length2*Math.cos(innerAngle)); //get 3rd length with cosine law

        double smallestSide = Math.min(length1, length2); //find smallest side length by comparing side lengths
        smallestSide = Math.min(smallestSide, length3);


        if (smallestSide == length3) { //checks if smallest angle is the inputted angle
            return Math.toDegrees(innerAngle); // returns inner angle in degrees
        }
        else {
            double smallestAngle = Math.asin(Math.sin(innerAngle)*smallestSide/length3); //gets smallest angle with sine law
            return Math.toDegrees(smallestAngle); //returns smallest angle in degrees
        }

    }
    

}


