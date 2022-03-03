/**
 * Name: Eric
 * Class: ICS4U1-1A
 * Date: Mar 3, 2022
 * Description: Creates humans with traits such as nationality,
 * name, gender, weight, and changing energy levels.
 */
public class Human {


    /*
     * Attributes
     */

    /** the name of the human */
    private String name;

    /** the weight of the human */
    private double weight;

    /** the energy level of the human */
    private int energyLevel;

    /*
     * Constructor
     */

    /**
     Human
     Creates a human
     */
    public Human() {
        this.name = "";
        this.weight = -1;
        this.energyLevel = -1;
    }

    /**
     * Human
     * Creates a human (person)
     *
     * @param name:        the name of the human
     * @param weight:      the weight of the human (in kgs)
     * @param energyLevel: the current energy level of the human
     */
    public Human(String name, double weight, int energyLevel) {

        this.name = name;
        this.energyLevel = energyLevel;
        this.weight = weight;
    }

    /*
     * Methods
     */

    // Accessors

    /**
     * Gets the name of human
     * @return the human's name
     */

    public String getName() {
        return this.name;
    }

    /**
     * Gets the weight of human
     * @return the human's weight
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Gets the energy level of human
     * @return the human's energy level
     */
    public int getEnergy() {
        return this.energyLevel;
    }



    /*
     * Methods
     */

    /**
     * This method raises energyLevel by hours * 10%
     * @param hours: hours slept
     */

    public void sleep(int hours) {
        if (hours <= 0) { // restriction for negative and zero numbers
            this.energyLevel = this.energyLevel;
        }
        else { // for every positive number of hrs of sleep
            this.energyLevel = (int)(energyLevel + 0.1 * hours); // formula
            if (energyLevel > 100) { // if greater than 100, reduce down to max energy level
                this.energyLevel = 100;
            }
        }
    }

    /**
     * This method causes the human to lose energy by 3% per km and decrease weight by 0.001 per km
     * @param km: number of km ran
     */

    public void run(double km) {
        if (km <= 0) { // restriction for negative and zero numbers
            this.energyLevel = this.energyLevel;
            this.weight = this.weight;
        }
        else { // for every positive number of kilometres
            this.energyLevel = (int)(energyLevel - 3 * km); // energy level decreases by 3% for every kilometre
            if (this.energyLevel < 0) { // if energyLevel goes below zero, reset to 0
                this.energyLevel = 0;
            }
            this.weight = weight - 0.001 * km; // weight decreases by 0.001kg for every kilometre
        }
    }

    /**
     Human eats vegetable and gains weight and calories unless he eats more than there is vegetable
     @param veg: vegetable to be eaten
     @param grams: grams of vegetables to be eaten
     */
    public void eat(Vegetable veg, double grams) {
        if (veg.getWeight() < grams) {
            System.out.println("I don’t have that much food");
        }
        else {
            this.weight += 0.001*grams;
            this.energyLevel += (1.0/15)*veg.eaten(grams);
        }
    }

    /**
     Human eats cookie and gains weight and calories unless he eats more than there is cookie
     @param food: cookie to be eaten
     @param grams: grams of cookie to be eaten
     */
    public void eat(Cookie food, double grams) {
        if (food.getPackaged()) {
            System.out.println("I can’t eat the bag");
        }
        else if (food.getWeight() < grams) {
            System.out.println("I don’t have that much food");
        }
        else {
            this.weight += 0.001*grams;
            this.energyLevel += Math.round((1.0/15)*food.eaten(grams));
        }
    }


    /**
     * This method returns all the attributes of the human in a String
     * @return all the attributes of human class
     */

    public String toString() {

        return "Name: " + this.name + "\nWeight: " + this.weight + "\nEnergy Level: " + this.energyLevel;
    }
}