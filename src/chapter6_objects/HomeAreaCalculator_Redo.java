package chapter6_objects;

import java.util.Scanner;

public class HomeAreaCalculator_Redo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        HomeAreaCalculator_Redo calculator = new HomeAreaCalculator_Redo();
        ClassesAndObjects_Rectangle kitchen = calculator.getRoom();
        ClassesAndObjects_Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
        calculator.scanner.close();

    }
    public ClassesAndObjects_Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new ClassesAndObjects_Rectangle(length, width);
    }

    public double calculateTotalArea(ClassesAndObjects_Rectangle rectangle1, ClassesAndObjects_Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
