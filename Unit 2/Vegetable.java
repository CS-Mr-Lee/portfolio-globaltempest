/**
 * Name: Eric
 * Class: ICS4U1-1A
 * Date: Mar 1, 2022
 * Description: creates vegetables with traits such as color, if it is green, name, calories, if it is edible, weight
 */
public class Vegetable {

    /*
    Attributes
     */

    /** color of vegetable */
    private String color;
    /** is vegetable green */
    private boolean isGreen;
    /** name of vegetable */
    private String name;
    /** calories of vegetable */
    private double calories;
    /** is vegetable edible */
    private boolean isEdible;
    /** weight of vegetable */
    private double weight;

    /*
    Constructor
     */

    /**
    Vegetable
    creates a vegetable
    @param color: color of vegetable
    @param isGreen: is vegetable green
    @param name: name of vegetable
    @param calories: calories of vegetable
    @param isEdible: is vegetable edible
    @param weight: weight of vegetable
    */
    public Vegetable(String color, boolean isGreen, String name, double calories, boolean isEdible, double weight) {
        this.color = color;
        this.isGreen = isGreen;
        this.name = name;
        this.isEdible = isEdible;

        if (calories < 0) {
            this.calories = 0;
        }
        else {
            this.calories = calories;
        }

        if (weight < 0) {
            this.weight = 0;
        }
        else {
            this.weight = weight;
        }

    }

    /*
    Accessors
     */

    /**
    gets vegetable color
    @return vegetable color
    */
    public String getColor() {
        return this.color;
    }

    /**
    gets if vegetable is green
    @return if vegetable is green
    */
    public boolean getIsGreen() {
        return this.isGreen;
    }

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
    public double getCalories() {
        return this.calories;
    }

    /**
    gets vegetable edibility
    @return vegetable edibility
    */
    public boolean getIsEdible() {
        return this.isEdible;
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
    changes vegetable color
    @param color: new vegetable color
    */
    public void newColor(String color) {
        this.color = color;
    }

    /**
    changes vegetable if green
    @param green: changes if vegetable is green
    */
    public void newGreen(boolean green) {
        this.isGreen = green;
    }

    /**
    changes vegetable name
    @param name: changes vegetable name
    */
    public void newName(String name) {
        this.name = name;
    }

    /**
    changes vegetable calories
    @param calories: changes vegetable calories
    */
    public void newCalories(double calories) {
        this.calories = calories;
    }

    /**
    changes vegetable edibility
    @param edible: changes vegetable edibility
    */
    public void newEdible(boolean edible) {
        this.isEdible = edible;
    }

    /**
    changes vegetable weight
    @param weight: changes vegetable weight
    */
    public void newWeight(double weight) {
        this.weight = weight;
    }


}
