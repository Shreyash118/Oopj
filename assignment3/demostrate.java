package assignment3;

public class demostrate { 
    public static void main(String[] args) {
    int num1 = 10;
    double num2 = num1;
    System.out.println("Widening conversion from int to double: " + num2);

    float num3 = num1;
    System.out.println("Widening conversion from int to float: " + num3);
   
    boolean bool= (num1 != 0); 
    System.out.println("Explicit conversion from int to boolean: " + bool);

    String str = Integer.toString(num1);
    System.out.println("Explicit conversion from int to String: " + str);
}
}
    

