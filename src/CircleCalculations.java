import java.util.Scanner;

public class CircleCalculations {


    public static double findDiameter(double radius) {
        return radius * 2;
    }

    public static double findArea(double radius) {
        return radius * radius * Math.PI;
    }

    public static double findCircumference(double radius) {
        return radius * 2 * Math.PI;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = in.nextInt();

        double rad = radius;
        double diameter = findDiameter(rad);
        double area = findArea(rad);
        double circumference = findCircumference(rad);
        System.out.println("The diameter of the circle is " + diameter + ".");
        System.out.println("The area of the circle is " + area + ".");
        System.out.println("The circumference of the circle is " + circumference + ".");

    }
}