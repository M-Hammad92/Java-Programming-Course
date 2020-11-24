package chapter11_abstraction;

public class Abstraction_ShapeTester {

    public static void main(String[] args){
        Abstraction_Shape rectangle = new Abstraction_Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
