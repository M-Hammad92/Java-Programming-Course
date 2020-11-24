package chapter3_if;

import java.util.Scanner;

public class If_Else_If_TestResults
{
    public static void main(String args[])
    {
        //Get the test score
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score:");
        double score = scanner.nextDouble();

        //Determine the letter grade
        char grade;

        if(score < 60)
        {
            grade = 'F';
        }
        else if(score < 70)
        {
            grade = 'D';
        }
        else if(score < 80)
        {
            grade = 'C';
        }
        else if(score < 90)
        {
            grade = 'B';
        }
        else
        {
            grade = 'A';
        }
        System.out.println("You grade is " + grade);
    }
}
