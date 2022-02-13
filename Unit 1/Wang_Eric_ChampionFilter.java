import java.io.*;

/**
 * Name: Eric Wang
 * Date: Feb 12 2022
 * Course: ICS4U1-2A
 * Description: reads file with league of legends champion stats and creates a new file "MaxChampStats.txt" with
 * the name and hp of the champion with the highest hp
 * the name and armor of the champion with the lowest armor
 */

public class Wang_Eric_ChampionFilter {


    public static void main(String[] args) {

        //variable declaration
        String champHp = "", champArmor = "";
        String fileRead = "ChampStats.txt";
        String fileWrite = "MaxChampStats.txt";
        String line;
        String currentName = "";
        String[] lineData;
        double currentHp, currentArmor;
        double maxHp = -1e6;
        double minArmor = 1e6;

        //try read from file and write on new file
        try {

            //creates bufferedreader to read file
            BufferedReader reader = new BufferedReader(new FileReader(fileRead));
            line = reader.readLine();

            //goes through each line in the file
            while(line != null) {
                //splits line into array of String
                lineData = (line.substring(0, line.length()-1)).split(" ");

                //loops through each String in the line
                for (int i = 0; i < lineData.length; i ++) {

                    //checkcs for champiopn name
                    if (lineData[i].equals("\"name\":")) {
                        currentName = lineData[i+1];
                    }
                    //checks for champion armor
                    if (lineData[i].equals("\"armor\":")) {
                        currentArmor = Double.parseDouble(lineData[i+1]);
                        //checks if current champion armor is the smallest
                        if (currentArmor < minArmor) {
                            minArmor = currentArmor;
                            champArmor = currentName;
                        }
                    }
                    //checks for champion hp
                    if (lineData[i].equals("\"hp\":")) {
                        currentHp = Double.parseDouble(lineData[i+1]);
                        //checks if current champion hp is the largest
                        if (currentHp > maxHp) {
                            maxHp = currentHp;
                            champHp = currentName;
                        }
                    }

                }
                //goes to next line in file
                line = reader.readLine();
            }

            //creates bufferredreader and new file
            BufferedWriter write = new BufferedWriter(new FileWriter(fileWrite, false));

            //the name and hp of the champion with the highest hp
            write.write(champHp + " has the highest hp of " + maxHp);
            write.newLine();
            //the name and armor of the champion with the lowest armor
            write.write(champArmor + " has the lowest armor of " + minArmor);

            //closes writer
            write.close();

        } catch (IOException e) { // catches any IOException
            System.out.println(e.getMessage());
        }


    }

}

