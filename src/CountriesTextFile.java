/**
 * Created by ericm on 7/11/2017.
 */

import java.io.*;
import java.util.Scanner;

public class CountriesTextFile {


    public static void readFromFile() {

        try {
            File myFile = new File("Countries.txt");
            FileReader reader = new FileReader(myFile);
            BufferedReader buff = new BufferedReader(reader);


            String line = null;


            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }

            buff.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile() {

        try {
            Scanner scnr = new Scanner(System.in);
            FileWriter writer = new FileWriter("Countries.txt", true);
            System.out.println("\n" + "Add a country: ");
            String userCountry = scnr.nextLine();

            if(!Validation.checkForDuplicateCountry(userCountry)) {//Communicates with checkForDuplicate Country in Validation class.
                writer.write(userCountry + "\n");//If country is not on the list it will add it.
                writer.close();
            }else{
                System.out.println("Country already in list!");//Else it prints this statement.
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}