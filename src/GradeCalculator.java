import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your numeric grade:");
        int grade = in.nextInt();

        int x = grade;
        if (x >= 92) {
            System.out.print("Your grade is A.");
        } else if (x <= 92 == x >= 89) {
            System.out.print("Your grade is A-.");
        } else if (x <= 89 == x >= 87) {
            System.out.print("Your grade is B+.");
        } else if (x <= 87 == x >= 82) {
            System.out.print("Your grade is B.");
        } else if (x <= 82 == x >= 79) {
            System.out.print("Your grade is B-.");
        } else if (x <= 79 == x >= 77) {
            System.out.print("Your grade is C+.");
        } else if (x <= 77 == x >= 72) {
            System.out.print("Your grade is C.");
        } else if (x <= 72 == x >= 69) {
            System.out.print("Your grade is C-.");
        } else if (x <= 69 == x >= 67) {
            System.out.print("Your grade is D+.");
        } else if (x <= 67 == x >= 60) {
            System.out.print("Your grade is D.");
        } else if (x <= 60 == x >= 0) {
            System.out.print("Your grade is F.");
        } else if (x <= 0) {
            System.out.println("Error. Please put number higher than 0.");
        }
    }
}