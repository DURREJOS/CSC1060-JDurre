import java.util.Scanner; // imports scanner to use (input)

public class InteractiveGreeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?"); //input asking for name
        String name = in.nextLine(); //output name

        System.out.println("Where are you from?"); // input asking where are they from
        String area = in.nextLine(); // output place

        System.out.println("How old are you (years)?"); // input asking age
        int age = in.nextInt(); // output age

        in.nextLine();

        //put all information together to greet person
        System.out.println("Hi! " + name + " from " + area + ". You are " + age + " years old.");

        System.out.println("What is your favorite activity?"); // input asking fav activity
        String active = in.nextLine(); // output activity

        // stating their activity for them
        System.out.println("I hope you have fun doing " + active + "!");

        System.out.println("How much would you like to donate?"); // input asking for donation
        int donate = in.nextInt(); // output amount of money

        // ending greeting with amount donated
        System.out.println("Thank you for your donation of $" + donate + ".");
    }
}