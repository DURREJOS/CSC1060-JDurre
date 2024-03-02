import java.util.Scanner;

public class StringWorkshop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some characters please!:");
        String so = in.nextLine();


        while (true) {
            System.out.println("Pick an option:");
            System.out.println("1. Add content");
            System.out.println("2. Check if string contains substring");
            System.out.println("3. Output the length");
            System.out.println("4. Output the substring after a given prefix");
            System.out.println("5. Output the substring before a given suffix");
            System.out.println("6. Output the substring before and after given prefix and suffix");
            System.out.println("7. Exit the program");
            int option = in.nextInt();
            in.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Current string: " + so);
                    so = input(so);
                    break;
                case 2:
                    System.out.println("Enter substring to check:");
                    String check = in.nextLine();
                    theSubstring(so, check);
                    break;
                case 3:
                    int length = theLength(so);
                    System.out.println("Length is: " + length);
                    break;
                case 4:
                    System.out.println("Enter the prefix: ");
                    String prefix4 = in.nextLine();

                    String substringPrefix4 = substringPrefix(so, prefix4);

                    System.out.println("Prefix: " + prefix4);
                    System.out.println("Substring after prefix: " + substringPrefix4);
                    break;
                case 5:
                    System.out.println("Enter the suffix: ");
                    String suffix5 = in.nextLine();
                    String substringSuffix5 = substringSuffix(so, suffix5);

                    System.out.println("Suffix: " + suffix5);
                    System.out.println("Substring before suffix: " + substringSuffix5);
                    break;
                case 6:
                    System.out.println("Enter the prefix: ");
                    String prefix6 = in.nextLine();

                    System.out.println("Enter the suffix: ");
                    String suffix6 = in.nextLine();

                    String both = both(so, prefix6, suffix6);
                    System.out.println("Substring between prefix and suffix: " + both);
                    break;
                case 7:
                    System.out.print("BYEEEEE");
                    in.close();
                    return;
                default:
                    System.out.print("Invalid option. Please enter a number 1-7!");
            }
        }
    }

    public static String input(String so) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter more characters then:");
        String crazy = in.nextLine();

        String updated = so + crazy;
        System.out.println("new string: " + updated);
        return updated;
    }

    public static void theSubstring(String so, String check) {
        int result = so.indexOf(check);
        if (result == -1) {
            System.out.println(check + " is not a substring of " + so);
        } else {
            System.out.println(check + " is a substring of " + so);
        }
    }

    public static int theLength(String wow) {
        return wow.length();
    }


    public static String substringPrefix(String so, String prefix) {
        if (so.startsWith(prefix)) {
            return so.substring(prefix.length());
        } else {
            return "No prefix found or input string is empty.";
        }
    }

    public static String substringSuffix(String so, String suffix) {
        int suffixIndex = so.lastIndexOf(suffix);

        if (suffixIndex != -1) {
            return so.substring(0, suffixIndex);
        } else {
            return "No suffix found or input string is empty.";
        }
    }

    public static String both(String so, String prefix, String suffix) {
        int start = so.indexOf(prefix);
        int end = so.indexOf(suffix, start + prefix.length());

        if (start != -1 && end != -1 && start < end) {
            String substring = so.substring(start + prefix.length(), end);
            return substring;
        } else {
            return "Prefix or Substring does not exist.";
        }
    }
}
