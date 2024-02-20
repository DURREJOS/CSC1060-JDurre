import javax.swing.*;
import java.util.Scanner;

public class BottlesOfBeer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of bottles to start with:");
        int verse = in.nextInt();
        int bottleNum = verse;
        while (bottleNum > 0) { // while loop

            if (bottleNum == 1) { // each if statement has different requirements in countdown
                System.out.println(); // This creates spaces between what is printed
                System.out.println(bottleNum + " bottle of beer on the wall, " + bottleNum + " bottle of beer.");
                System.out.println("Take one down and pass it around, " + bottleNum + " bottle of beer on the wall.");
                bottleNum = bottleNum - 1;
            }

            if (bottleNum <= 99) {
                System.out.println(); // This creates spaces between what is printed
                System.out.println(bottleNum + " bottles of beer on the wall, " + bottleNum + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + bottleNum + " bottles of beer on the wall.");
                bottleNum = bottleNum - 1;
            }

        }
        System.out.println(); // This creates spaces between what is printed
        System.out.println("Go to the store and buy some more, " + verse + " bottles of beer on the wall.");
    }
}