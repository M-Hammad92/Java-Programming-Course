package chapter4_loops;

import java.util.Scanner;

/*
 * LOOP BREAK:
 * Search a string to determine if it contains the letter 'A'.
 */
public class Loop_Break_LetterSearch
{
    public static void main(String args[])
    {
        //Get text
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text:");
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;
        //Search text for letter A
        for (int i=0; i<text.length(); i++)
        {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a')
            {
                letterFound = true;
                break;
            }
        }
        if (letterFound)
        {
            System.out.println("This text contains the letter 'A'");
        }
        else
            {
                System.out.println("This text does not contain the letter 'A'");
            }
    }
}
