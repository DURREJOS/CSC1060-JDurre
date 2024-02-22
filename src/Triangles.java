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
                int maxWidth = size*2-1;
                System.out.println("Enter fill: ");
                Character f = in.next().charAt(0);

                // in English for understanding:
                // start with a equals 1; where a is less// equal to size; update with a + 1
                for (a = 1; a <= size; a++) {
                    int spaces =(maxWidth -(2*a-1))/2;

                    for (b = 1; b <= spaces; b++) {
                        System.out.print(" ");
                    }
                    for (c = 1; c <= a; c++) {
                        if(c % 2 ==0) {
                            System.out.print(" ");
                        }else {
                            System.out.print(f);
                        }
                    }
                    for (c = a -1; c>=1; c--) {
                        if(c % 2 ==0) {
                            System.out.print(" ");
                        }else {
                            System.out.print(f);
                        }
                    }
                    System.out.println("");
                }
            }
            System.out.println("Would you like another triangle? (Y or N)");
            y = in.next();
        } while (y.equalsIgnoreCase("Y")); // while part of do loop
    }
}
