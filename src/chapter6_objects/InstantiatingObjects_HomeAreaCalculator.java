package chapter6_objects;

/*
 * Write a class that creates instances of the Rectangle class to find the
 * totals area of two rooms in a house.
 */
public class InstantiatingObjects_HomeAreaCalculator {

    public static void main(String args[]){
        /***************
         * RECTANGLE 1
         **************/

        //Create instance of Rectangle class
        ClassesAndObjects_Rectangle room1 = new ClassesAndObjects_Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /***************
         * RECTANGLE 2
         **************/
        //Create instance of Rectangle class
        ClassesAndObjects_Rectangle room2 = new ClassesAndObjects_Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
