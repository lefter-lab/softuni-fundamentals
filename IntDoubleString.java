import java.util.Scanner;

public class IntDoubleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading integer input
        int intValue = scanner.nextInt();

        // Reading double input
        double doubleValue = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline

        // Reading String input
        String stringValue = scanner.nextLine();

        // Printing output in the required format
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

        scanner.close();
    }
}
