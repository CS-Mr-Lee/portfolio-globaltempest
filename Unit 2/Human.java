/**
 * Name: Eric
 * Class: ICS4U1-1A
 * Date: Mar 1, 2022
 * Description: Creates humans with traits such as nationality,
 * name, gender, weight, and changing energy levels.
 */
public class Human {

  private final double MAX_INTAKE = 5;
  private final double MAX_EXCRETE = 5;
  private final double MAX_ENERGY_LEVEL = 100;
  private final double MIN_WEIGHT = 40;

  /*
   * Attributes
   */

  /** the name of the human */
  private String name;

  /** the gender of the human */
  private String gender;

  /** the weight of the human */
  private double weight;

  /** the energy level of the human */
  private double energyLevel;

  /** the nationality of the human */
  private String nationality;

  /*
   * Constructor
   */

  /**
   * Human
   * Creates a human (person)
   * 
   * @param name:        the name of the human
   * @param gender:      the gender of the human
   * @param weight:      the weight of the human (in kgs)
   * @param energyLevel: the current energy level of the human
   * @param nationality: the nationality of the human
   */

  public Human(String name, String gender, double weight, String nationality, double energyLevel) {

    this.name = name;// we are initializing the attribute with the parameter
    this.gender = gender;
    this.nationality = nationality;
    this.energyLevel = energyLevel;

    // setting restrictions for weight attribute (cannot be negative)
    if (weight < 0) {
      this.weight = 0;
    } else {
      this.weight = weight;
    }

    if (energyLevel < 0) {
      this.energyLevel = 0;
    } else if (energyLevel > MAX_ENERGY_LEVEL) {
      this.energyLevel = MAX_ENERGY_LEVEL;
    } else {
      this.weight = weight;
    }
  }

  /*
   * Methods
   */

  // Accessors

  /**
   * Gets the name of human
   * 
   * @return the human's name
   */

  public String getName() {
    return this.name;
  }

  /**
   * Gets the gender of human
   * 
   * @return the human's gender
   */
  public String getGender() {
    return this.gender;
  }

  /**
   * Gets the weight of human
   * 
   * @return the human's weight
   */
  public double getWeight() {
    return this.weight;
  }

  /**
   * Gets the nationality of human
   * 
   * @return the human's nationality
   */
  public String getNationality() {
    return this.nationality;
  }

  /**
   * Gets the energy level of human
   * 
   * @return the human's energy level
   */
  public double getEnergy() {
    return this.energyLevel;
  }

  /*
   * Mutators
   */

  /**
   * changes name of individual
   * 
   * @param newName - registered new name
   */
  public void nameChange(String newName) {
    this.name = newName;
  }

  /**
   * changes gender of individual
   * 
   * @param newGender - registered new gender
   */
  public void genderChange(String newGender) {
    this.gender = newGender;
  }

  /**
   * changes nationality of individual (country of citizenship)
   * 
   * @param newNationality - registered new citizenship
   */
  public void nationalityChange(String newNationality) {
    this.nationality = newNationality;
  }

  /**
   * changes energyLevel; cannot be less than 0 or more than 100
   * 
   * @param newEnergyLevel - newEnergyLevel (has to be between 0 and 100)
   */
  public void energyChange(double newEnergyLevel) {
    if (newEnergyLevel < 0) {
      this.energyLevel = this.energyLevel; // add by max intake (rest is vomitted out)
    } else if (newEnergyLevel == 0) { // if zero, nothing happens to the weight
      this.energyLevel = this.energyLevel;
    } else if (newEnergyLevel > 0) { // if zero, nothing happens to the weight
      this.energyLevel = this.energyLevel;
    } else if (newEnergyLevel == 100) { // all other cases
      this.weight = MAX_ENERGY_LEVEL;
    }
  }

  /**
   * increases weight of human from amount of food eaten;
   * cannot eat more than 10 kgs or less than 0
   * 
   * @param foodWeight - amount of food eaten
   */
  public void intake(double foodWeight) {
    if (foodWeight > MAX_INTAKE) {
      this.weight = this.weight + MAX_INTAKE; // add by max intake (rest is vomitted out)
    } else if (foodWeight < 0) { // restriction from negative weight
      this.weight = this.weight;
    } else if (foodWeight == 0) { // if zero, nothing happens to the weight
      this.weight = this.weight;
    } else { // all other cases
      this.weight = this.weight + foodWeight;
    }
  }

  /**
   * decreases weight of human from amount of matter excreted eaten;
   * cannot excrete more than 10 kgs or less than 0
   * 
   * @param excretionWeight - amount of matter excreted
   */
  public void excrete(double excretionWeight) {
    if (excretionWeight > MAX_EXCRETE) {
      this.weight = this.weight - MAX_EXCRETE; // subtract by max excretion
    } else if (excretionWeight < 0) { // restriction from negative weight
      this.weight = this.weight;
    } else if (excretionWeight == 0) { // if zero, nothing happens to the weight
      this.weight = this.weight;
    } else { // all other cases
      this.weight = this.weight - excretionWeight;
    }
  }

  /*
   * Methods
   */

  /**
   * Method Name: sleep(int hours)
   * Return Type: N/A
   * Parameters: int hours - number of hours of sleep that the human had
   * Description: This method raises energyLevel by hours * 10%
   */

  public void sleep(int hours) {
    if (hours < 0) { // restriction for negative numbers
      this.energyLevel = this.energyLevel;
    } else if (hours == 0) { // if no sleep, energy level is the same
      this.energyLevel = this.energyLevel;
    } else { // for every positive number of hrs of sleep
      this.energyLevel = energyLevel + 0.1 * hours; // formula
      if (energyLevel > MAX_ENERGY_LEVEL) { // if greater than 100, reduce down to max energy level
        this.energyLevel = MAX_ENERGY_LEVEL;
      }
    }
  }

  /**
   * Method Name: run(double km)
   * Return Type: N/A
   * Parameters: double km - number of kilometres travelled by the human
   * Description: This method causes the human to lose energy and decrease weight
   * by 0.001 per km
   */

  public void run(double km) {
    if (km < 0) { // restriction for negative numbers
      this.energyLevel = this.energyLevel;
      this.weight = this.weight;
    } else if (km == 0) { // if zero, energy level and weight is the same
      this.energyLevel = this.energyLevel;
      this.weight = this.weight;
    } else { // for every positive number of kilometres
      this.energyLevel = energyLevel - 0.5 * km; // energy level decreases by 0.5% for every kilometre
      if (this.energyLevel < 0) { // if energyLevel goes below zero, reset to 0
        this.energyLevel = 0;
      }
      this.weight = weight - 0.001 * km; // weight decreases by 0.001kg for every kilometre
      if (this.weight < MIN_WEIGHT) { // if less than minimum weight (40 kgs), reset to min weight
        this.energyLevel = MIN_WEIGHT;
      }
    }
  }

  /**
   * Method Name: toString()
   * Return Type: returns organized string of the given data
   * Parameters: N/A
   * Description: This method returns all the attributes of the human in a String
   */

  public String toString() {

    // convert doubles to strings
    String weightStr = Double.toString(weight);
    String energyLevelStr = Double.toString(energyLevel);

    // return all attributes in an organized fashion
    return "Name: " + name + "\nGender: " + gender + "\nNationality: " + nationality + "\nWeight: " + weightStr
        + "\nEnergy Level: " + energyLevelStr;
  }
}
