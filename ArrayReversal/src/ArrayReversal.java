import java.util.Scanner;
public class ArrayReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter numbers! (-1 to stop)");

        int[] numbers = new int[10];
        int count = 0;

        while(true) {
            if (in.hasNextInt()) {
                int num = in.nextInt();
                if (num == -1) {
                    break;
                }
                if (count >= numbers.length) {
                    numbers = addArray(numbers, count * 2);
                }
                numbers[count] = num;
                count++;
            } else {
                    System.out.println("Please enter positive numbers. (-1 to stop)");
                    in.next();
            }
        }
        int[] reversedArray = new int[count];
        int i = 0;
        for(i = 0; i < count; i++) {
            reversedArray[i] = numbers[count - i - 1];
        }
        System.out.println("Reversed Numbers:");
        for (int num : reversedArray) {
            System.out.println(num);
        }
    }
    public static int[] addArray(int[] arr, int newSize){
        int[] newArray = new int[newSize];
        System.arraycopy(arr, 0, newArray, 0,arr.length);
        return newArray;
    }


}