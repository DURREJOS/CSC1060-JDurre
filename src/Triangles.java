import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c; // declared variables 4 for loop (used later)
        String y = "";

        do { // do loop allows yes or no
            System.out.println("Enter size: ");
            int size = in.nextInt();

            if (size <= 0 || size > 50) { // used to make sure the size is within limits of 1 & 50
                while (size <= 0 || size > 50) {
                    System.out.println("Between 1 and 50 please!");
                    System.out.println("Enter size: ");
                    size = in.nextInt();
                } // ended the while loop in the if statement before next if statement
            }

            if (size <= 50) { // connects the input to the next step if number entered correctly

                System.out.println("Enter fill: ");
                Character f = in.next().charAt(0);

                // in English for understanding:
                // start with a equals 0; where a is less than the size + 1; update with a + 1
                for (a = 0; a < size + 1; a++) { // size +1

                    for (b = size; b > a; b--) {
                        System.out.print(" ");
                    }
                    for (c = 0; c < (a * 2 - 1); c++) {
                        System.out.print(f); // f is the character declared above!
                    }
                    System.out.println();
                }
            }
            System.out.println("Would you like another triangle? (Y or N)");
            y = in.next();
        } while (y.equalsIgnoreCase("Y")); // while part of do loop
    }
}