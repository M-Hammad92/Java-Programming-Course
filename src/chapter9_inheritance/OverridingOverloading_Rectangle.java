package chapter9_inheritance;

public class OverridingOverloading_Rectangle {

    protected double length;
    protected double width;
    protected double sides = 4;

    //Length
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    //Width
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    //Sides
    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public void print(){
        System.out.println("I am a rectangle");
    }

}
