package chapter2_javafundamentals;

import java.util.Scanner;

public class MadLibs_Practice
{
    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);

        //1. Get the Year Season
        System.out.println("Enter The Season of The Year");
        int yearSeason = scanner.nextInt();

        //2. Get the Number of Cups
        System.out.println("Enter The Number of Cups");
        int cupsNumber = scanner.nextInt();

        //3. Get the Adjective
        System.out.println("Enter an Adjective");
        String adjective = scanner.next();
        scanner.close();

        //4. Display the Result
        System.out.println("On a " + adjective  + " " + yearSeason + " day, I drink a minimum of " +            cupsNumber  + " cups of coffee.");

    }
}
