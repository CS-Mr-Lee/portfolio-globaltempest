/**
 * Name: Eric
 * Class: ICS4U1-1A
 * Date: Mar 3, 2022
 * Description: creates vegetables with traits such as name, calories, weight
 */
public class Vegetable {

    /*
    Attributes
     */

    /** name of vegetable */
    private String name;
    /** calories of vegetable */
    private int calories;
    /** weight of vegetable */
    private double weight;

    /*
    Constructor
     */


    /**
     Vegetable
     Creates Vegetable
     */
    public Vegetable() {
        this.name = "";
        this.weight = -1;
        this.calories = -1;
    }


    /**
     Vegetable
     creates a vegetable
     @param name: name of vegetable
     @param calories: calories of vegetable
     @param weight: weight of vegetable
     */
    public Vegetable(String name, double weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;


    }

    /*
    Accessors
     */

    /**
     gets vegetable name
     @return vegetable name
     */
    public String getName() {
        return this.name;
    }

    /**
     gets vegetable calories
     @return vegetable calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     gets vegetable weight
     @return vegetable weight
     */
    public double getWeight() {
        return this.weight;
    }

    /*
    Mutators
     */

    /**
     eats vegetable and reduces weight and calories of vegetable
     @param weight: weight of eaten vegetable
     @return -1 if eaten weight > vegetable weight, the calories gained by person if vegetable is eaten
     */
    public int eaten(double weight) {
        //check if eaten vegetable weight is too big
        if (weight > this.weight) {
            return -1;
        }
        else {
            //reduces vegetable weight and calories
            int loseCal = (int)Math.round(this.calories * weight/this.weight);
            this.weight -= weight;
            this.calories -= loseCal;
            return loseCal;
        }
    }

    /**
     gets all attributes of cookie
     @return all cookie attributes
     */
    public String toString() {
        return "Name: " + this.name + "\nWeight: " + this.weight + "\nCalories: " + this.calories;
    }





}