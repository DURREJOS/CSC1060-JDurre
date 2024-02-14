import java.util.Scanner;

public class CircleCalculations {
    public static double findArea(double radius){
        return radius * radius*Math.PI;
    }
    public static double findCircumference(double radius){
        return radius*Math.PI;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int radius = in.nextInt();

        double diameter = radius*2;
        double area = findArea(diameter/2);
        double circumference = findCircumference(diameter);
        System.out.println("The diameter of the circle is "+ diameter + ".");
        System.out.println("The area of the circle is "+ area + ".");
        System.out.println("The circumference of the circle is "+ circumference + ".");




    }
}