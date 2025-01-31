import java.util.Scanner;

public class A2_CommonElements {
    public static void main(String[] args) {
        String[] arrayOne;
        String lineTwo;
        try (Scanner scanner = new Scanner(System.in)) {

            String lineOne = scanner.nextLine();
            arrayOne = lineOne.split(" ");
            lineTwo = scanner.nextLine();
        }
        String[] arrayTwo = lineTwo.split(" ");

        for (int i = 0; i < arrayTwo.length; i++) {

            for (int j = 0; j < arrayOne.length; j++) {

                if(arrayTwo[i].equals(arrayOne[j])) {

                    System.out.print(arrayOne[j] + " ");

                }
            }
        }
    }
}
