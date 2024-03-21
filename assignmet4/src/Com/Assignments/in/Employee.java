package Com.Assignments.in;

public class Employee {
    private int id;
    private double salary;
    private String name;

    public Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public void displayInfo(int id) {
        System.out.println("ID: " + id);
    }

    public void displayInfo(double salary) {
        System.out.println("Salary: $" + salary);
    }

    public void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(10,700000, "Shreyash");

      emp.displayInfo(emp.id);
        emp.displayInfo(emp.name);
        emp.displayInfo(emp.salary);
    }

}
