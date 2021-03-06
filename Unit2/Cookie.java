/**
 * Name: Eric
 * Class: ICS4U1-1A
 * Date: Mar 3, 2022
 * Description: Creates cookie with traits such as name, weight, calories, and if it is packaged
 */
public class Cookie {

  /*
  Atributes
  */

    /** name of cookie */
    private String name;
    /** weight of cookie */
    private double weight;
    /** calories of cookie */
    private int calories;
    /** is cookie packaged */
    private boolean isPackaged;

  /*
  Constructor
  */

    /**
     Cookie
     Creates a cookie
     */
    public Cookie() {
        this.name = "";
        this.weight = -1;
        this.calories = -1;
        this.isPackaged = false;
    }

    /**
     Cookie
     Creates a cookie
     @param name: name of cookie
     @param weight: weight of cookie (g)
     @param calories: calories of cookie
     */
    public Cookie(String name, double weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.isPackaged = false;
    }

    /**
     Cookie
     Creates a cookie
     @param name: name of cookie
     @param weight: weight of cookie (g)
     @param calories: calories of cookie
     @param isPackaged: is cookie packaged
     */
    public Cookie(String name, double weight, int calories, boolean isPackaged) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.isPackaged = isPackaged;
    }

  /*
  Methods
  */

    //Accessors

    /**
     gets name of cookie
     @return cookie name
     */
    public String getName() {
        return this.name;
    }

    /**
     gets weight of cookie
     @return cookie weight
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     gets calories of cookie
     @return cookie calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     gets package of cookie
     @return if cookie is packaged
     */
    public boolean getPackaged() {
        return this.isPackaged;
    }

  /*
  Mutator
  */

    /**
     opens cookie package
     */
    public void open() {
        this.isPackaged = false;
    }

    /**
     eats cookie and reduces weight and calories of cookie
     @param weight: weight of eaten cookie
     @return -2 if packaged, -1 if eaten weight > cookie weight, the calories gained by person if cookie is eaten
     */
    public int eaten(double weight) {
        //check if cookie is packaged
        if (this.isPackaged) {
            return -2;
        }
        else {
            //check if eaten cookie weight is too big
            if (weight > this.weight) {
                return -1;
            }
            else {
                //reduces cookie calories and weight
                int loseCal = (int)Math.round(this.calories * weight/this.weight);
                this.weight -= weight;
                this.calories -= loseCal;
                return loseCal;
            }
        }
    }

    /**
     gets all attributes of cookie
     @return all cookie attributes
     */
    public String toString() {
        return "Name: " + this.name + "\nWeight: " + this.weight + "\nCalories: " + this.calories + "\nisPackaged: " + this.isPackaged;
    }





}