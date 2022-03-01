public class Vegetable {

    /*
    Attributes
     */

    private String color;
    private boolean isGreen;
    private String name;
    private double calories;
    private boolean isEdible;
    private double weight;

    /*
    Constructor
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

    public String getColor() {
        return this.color;
    }

    public boolean getIsGreen() {
        return this.isGreen;
    }

    public String getName() {
        return this.name;
    }

    public double getCalories() {
        return this.calories;
    }

    public boolean getIsEdible() {
        return this.isEdible;
    }

    public double getWeight() {
        return this.weight;
    }

    /*
    Mutators
     */

    public void newColor(String color) {
        this.color = color;
    }

    public void newGreen(boolean green) {
        this.isGreen = green;
    }

    public void newName(String name) {
        this.name = name;
    }

    public void newCalories(double calories) {
        this.calories = calories;
    }

    public void newEdible(boolean edible) {
        this.isEdible = edible;
    }

    public void newWeight(double weight) {
        this.weight = weight;
    }


}
