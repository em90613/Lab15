import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by ericm on 7/11/2017.
 */
public class Validation {
    public static int menuNumValidation(int menuNum) {//This method takes the userInput and compares it to 1,2, or 3. If they put in anything
        Scanner scnr = new Scanner(System.in);          // besides those options it reads invalid and prompts to re-enter.

        while ((menuNum != 1) && (menuNum != 2) && (menuNum != 3)) {

            System.out.println("Invalid entry! Enter 1, 2, or 3");
            menuNum = scnr.nextInt();
        }
        return menuNum;
    }

    public static boolean checkForDuplicateCountry (String countryInput){//This checks the countryInput to verify if it is already on the
        String[] countries;                                                 //Countries.txt file. If so it will let the user know and prompt
        boolean isDuplicate = false;                                        // them for other input.

        try {
            countries = Files.readAllLines(new File("Countries.txt").toPath()).toArray(new String[0]);

            for (String country:countries){
                if (country.equalsIgnoreCase(countryInput)){
                    isDuplicate = true;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isDuplicate;
    }


}

