package chapter9_inheritance;

public class OverridingOverloading_InheritanceTester {

    public static void main(String[] args){
        OverridingOverloading_Rectangle rectangle = new OverridingOverloading_Rectangle();
        rectangle.print();

        OverridingOverloading_Square square = new OverridingOverloading_Square();
        square.print("square");

    }

    public static void testSquareOverride(){
        OverridingOverloading_Rectangle rectangle = new OverridingOverloading_Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        OverridingOverloading_Square square = new OverridingOverloading_Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}
