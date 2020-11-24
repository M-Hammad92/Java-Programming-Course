package chapter9_inheritance;

public class Inheritance_Tester {
    public static void main(String[] args){

        Inheritance_Mother mom = new Inheritance_Mother();
        mom.setName("mummy");

        System.out.println(mom.getName() + " is a " + mom.getGender());

       //Inheritance_Person person = new Inheritance_Employee();
       //Inheritance_Employee employee = new Inheritance_Employee();
    }
}
