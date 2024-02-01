import java.util.Scanner; // imports code for me to use the scanner

public class TemperatureConversion {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in); // is used for input

        System.out.println("Give me any temperature in Fahrenheit!"); // given input

        int fahrenheit = in.nextInt(); // connects the input to the scanner

        double CelsiusConverter = (fahrenheit - 32) * 5/9; // double is used for decimals
        double kelvinConverter = (fahrenheit - 32) * (5/9) - 273.15; // double is used for decimals

        System.out.println( CelsiusConverter + " Degrees Celsius"); // prints output double converters I made
        System.out.println( kelvinConverter + " kelvin"); // and then adds the words at the end in "quotations"
    }
}
