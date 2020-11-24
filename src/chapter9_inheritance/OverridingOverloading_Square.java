package chapter9_inheritance;

public class OverridingOverloading_Square extends OverridingOverloading_Rectangle{

    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
