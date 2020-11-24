package chapter3_if;

import java.util.Scanner;

public class DollarGame_Practice
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        double penny = 0.01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        System.out.println("How many pennies would you like?");
        double pennies = scanner.nextDouble();
        System.out.println("How many nickles would you like?");
        double nickles = scanner.nextDouble();
        System.out.println("How many dimes would you like?");
        double dimes = scanner.nextDouble();
        System.out.println("How many quarters would you like?");
        double quarters = scanner.nextDouble();

        scanner.close();

        double total = pennies * penny + nickles * nickel + dimes * dime + quarters * quarter;

        if (total == dollar)
        {
            System.out.println("Congrats! You Won.");
        }
        else if(total > dollar)
        {
            double over = total - dollar;
            System.out.println("Sorry, you went over $1 by $" + over);
        }
        else if(total < dollar)
        {
            double minus = dollar - total;
            System.out.println("Sorry, you went short $1 by $" + minus);
        }

    }
}
