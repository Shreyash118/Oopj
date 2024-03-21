package Com.Assignments.in;

public class Vehicles {
    public void displayInfo() {
        System.out.println("This is a cars.");
    }

    public void displayInfo(String type) {
        System.out.println("This is a " + type + ".");
    }

    public void displayInfo(String type, String model) {
        System.out.println("This is a " + type + " " + model + ".");
    }

    public void displayInfo(String type, String make, String model) {
        System.out.println("This is a " + make + " " + model + " " + type + ".");
    }

    public static void main(String[] args) {
        Vehicles car = new Vehicles();

        car.displayInfo();
        car.displayInfo("Virtus GT");
        car.displayInfo("car", "Virtus GT");
        car.displayInfo("car", "Toyota FORTUNER ", "DEFENDER");
    }
}

