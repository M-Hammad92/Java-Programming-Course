package chapter6_objects;

import java.awt.*;

public class ClassesAndObjects_Rectangle {

    //global variables // private: accessed only in this class
    private double length;
    private double width;
    //default constructor
    public ClassesAndObjects_Rectangle(){
        length = 0;
        width = 0;
    }
    //Constructor
    public ClassesAndObjects_Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    //getter
    public double getLength(){
        return length;
    }
    //setter
    public void setLength(double length){
        this.length = length;
    }
    //getter
    public double getWidth(){
        return width;
    }
    //setter
    public void setWidth(double width){
        this.width = width;
    }
    //method
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    //method
    public double calculateArea(){
        return length * width;
    }
}
