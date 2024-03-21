package Com.Assignments.in;

public class Student {
	    private String name;
	    private int age;
	    private String id;

	    public Student(String name, int age, String id) {
	        this.name = name;
	        this.age = age;
	        this.id = id;
	    }

	    public String getInfo() {
	        return "Name: " + name + "\nAge: " + age + "\nID: " + id;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public static void main(String[] args) {
	        Student student1 = new Student("Shreyash", 21, "Q12");

	        System.out.println("Student Information :");
	        System.out.println(student1.getInfo());

	        student1.setName("Shreyash BHagat");
	        student1.setAge(23);

	        System.out.println("\nModified Details:");
	        System.out.println(student1.getInfo());
	    }
	}

