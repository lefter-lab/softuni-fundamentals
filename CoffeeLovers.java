import java.util.*;

public class CoffeeLovers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read Initial Coffee List
        List<String> coffees = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        // Step 2: Number of Commands
        int n = Integer.parseInt(scanner.nextLine());

        // Step 3: Execute Commands
        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split(" ");
            String command = commandParts[0];

            switch (command) {
                case "Include":
                    includeCoffee(coffees, commandParts[1]);
                    break;
                case "Remove":
                    removeCoffees(coffees, commandParts[1], Integer.parseInt(commandParts[2]));
                    break;
                case "Prefer":
                    preferCoffees(coffees, Integer.parseInt(commandParts[1]), Integer.parseInt(commandParts[2]));
                    break;
                case "Reverse":
                    reverseCoffees(coffees);
                    break;
            }
        }

        // Step 4: Print Final Result
        printCoffees(coffees);
    }

    // Method to Include a coffee at the end of the list
    private static void includeCoffee(List<String> coffees, String coffee) {
        coffees.add(coffee);
    }

    // Method to Remove coffees from either the first or last part of the list
    private static void removeCoffees(List<String> coffees, String position, int count) {
        if (count <= coffees.size()) {
            if (position.equals("first")) {
                coffees.subList(0, count).clear();
            } else if (position.equals("last")) {
                coffees.subList(coffees.size() - count, coffees.size()).clear();
            }
        }
    }

    // Method to swap coffees at given indices if both indices are valid
    private static void preferCoffees(List<String> coffees, int index1, int index2) {
        if (index1 >= 0 && index1 < coffees.size() && index2 >= 0 && index2 < coffees.size()) {
            Collections.swap(coffees, index1, index2);
        }
    }

    // Method to reverse the coffee list
    private static void reverseCoffees(List<String> coffees) {
        Collections.reverse(coffees);
    }

    // Method to print the final list of coffees
    private static void printCoffees(List<String> coffees) {
        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffees));
    }
}
