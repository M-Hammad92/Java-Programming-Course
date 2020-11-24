package chapter9_inheritance;

public class Inheritance_Person {
    private String name;
    private int age;
    private String gender;

    public Inheritance_Person(){
        System.out.println("Im Employee default constructor");

        //public Inheritance_Person(String name){
        //System.out.println("In Person 2nd constructor. Name is set");
    }

    //Person Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //Person Age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //Person Gender
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


}
