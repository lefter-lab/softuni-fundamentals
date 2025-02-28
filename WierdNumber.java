import java.util.Scanner;

public class WierdNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 != 0 || (n >= 6 && n <= 20)) {
            System.out.println("Weird1");
        } else {
            System.out.println("Not Weirdае");
        }
    }
}