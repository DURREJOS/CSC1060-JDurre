public class Main {
    public static void main(String[] args) {
        String example = "Some stuff in here";
        endsWith(example, maybeEnd:"");
        System.out.println();
    }

    public static boolean endsWith(String string, String maybeEnd) {
        return string.endsWith(maybeEnd);
    }
}