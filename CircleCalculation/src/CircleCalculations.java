import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int radius = in.nextInt();

        int diameter = radius * 2;
        double area = (radius* radius) * Math.PI;
        double circumference = radius * 2 * Math.PI;

        System.out.println("The diameter of the circle is "+ diameter + ".");
        System.out.println("The area of the circle is "+ area + ".");
        System.out.println("The circumference of the circle is "+ circumference + ".");




    }
}