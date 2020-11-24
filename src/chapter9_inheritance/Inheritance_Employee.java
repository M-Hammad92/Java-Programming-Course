package chapter9_inheritance;

public class Inheritance_Employee extends Inheritance_Person {

    private String employeeID;
    private String title;

    public Inheritance_Employee(){
        //super("Hammad");
        System.out.println("Im Employee default constructor");
    }

    //Employee ID
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    //Employee Title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }




}
