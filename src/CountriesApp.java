import java.util.Scanner;

/**
 * Created by ericm on 7/11/2017.
 *///
public class CountriesApp {
    public static void main(String[] args) {
        boolean userContinue = true;//this is set to true to keep looping if use hits 1 or 2. Once 3 is entered it will break. *see case 3*

        Scanner scnr = new Scanner(System.in);

        do {
            System.out.println("What would you like to do?");
            System.out.println("Option 1: Display a list of countries. \nOption 2: Add a country to the list. \nOption 3: Exit Program");
            int menuNum = scnr.nextInt();
            menuNum = Validation.menuNumValidation(menuNum);//Communicates back to Validation class to make sure input is 1,2, or 3.

            switch (menuNum) {
                case 1:
                    CountriesTextFile.readFromFile();
                    System.out.println();
                    break;
                case 2:
                    CountriesTextFile.writeToFile();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Goodbye");
                    userContinue = false;//Set to false. This will break the loop because userContinue is changed to false. Telling the program
                    break;                  //the user does not wish to continue.
            }
        } while (userContinue);//This basically says that while userContinue is true (as it was defined initially) then it will loop. It will only
    }//change if a user selects case 3. If that happens then it changes the boolean to false, exiting the program.
}






