package chapter9;

public class Employee extends Person{

    private String employeeId;
    private String title;

    public Employee(){
        super("aga");
    }

    public String getEmployeeId() {
        System.out.println("Employee is called");
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
