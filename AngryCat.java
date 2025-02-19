import java.util.*;

public class AngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read Inputs
        List<Integer> priceRatings = parsePriceRatings(scanner.nextLine());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String itemType = scanner.nextLine();

        // Step 2: Calculate Damage
        int leftDamage = calculateDamage(priceRatings, entryPoint, itemType, "left");
        int rightDamage = calculateDamage(priceRatings, entryPoint, itemType, "right");

        // Step 3: Print Result
        printResult(leftDamage, rightDamage);
    }

    // Method to parse price ratings from input string
    private static List<Integer> parsePriceRatings(String input) {
        String[] parts = input.split(", ");
        List<Integer> ratings = new ArrayList<>();
        for (String part : parts) {
            ratings.add(Integer.parseInt(part));
        }
        return ratings;
    }

    // Method to calculate damage for a given direction
    private static int calculateDamage(List<Integer> ratings, int entryPoint, String itemType, String direction) {
        int entryValue = ratings.get(entryPoint);
        int damage = 0;

        if (direction.equals("left")) {
            for (int i = entryPoint - 1; i >= 0; i--) {
                if (isValidItem(ratings.get(i), entryValue, itemType)) {
                    damage += ratings.get(i);
                }
            }
        } else if (direction.equals("right")) {
            for (int i = entryPoint + 1; i < ratings.size(); i++) {
                if (isValidItem(ratings.get(i), entryValue, itemType)) {
                    damage += ratings.get(i);
                }
            }
        }
        return damage;
    }

    // Method to check if an item matches the type ("cheap" or "expensive")
    private static boolean isValidItem(int itemValue, int entryValue, String itemType) {
        if (itemType.equals("cheap")) {
            return itemValue < entryValue;
        } else if (itemType.equals("expensive")) {
            return itemValue >= entryValue;
        }
        return false;
    }

    // Method to print the result based on damage comparison
    private static void printResult(int leftDamage, int rightDamage) {
        if (leftDamage >= rightDamage) {
            System.out.println("Left - " + leftDamage);
        } else {
            System.out.println("Right - " + rightDamage);
        }
    }
}
