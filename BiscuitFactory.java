import java.util.Scanner;

public class BiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read Inputs
        int biscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int competitorProduction = Integer.parseInt(scanner.nextLine());

        // Step 2: Calculate Monthly Production (30 days)
        int totalProduction = 0;
        for (int day = 1; day <= 30; day++) {
            int dailyProduction;
            if (day % 3 == 0) {
                // 75% production every 3rd day
                dailyProduction = (int) Math.floor(biscuitsPerDay * workers * 0.75);
            } else {
                dailyProduction = biscuitsPerDay * workers;
            }
            totalProduction += dailyProduction;
        }

        // Step 3: Calculate Percentage Difference
        double difference = totalProduction - competitorProduction;
        double percentage = Math.abs(difference / competitorProduction * 100);

        // Step 4: Display Results
        System.out.println("You have produced " + totalProduction + " biscuits for the past month.");

        if (totalProduction > competitorProduction) {
            System.out.printf("You produce %.2f percent more biscuits.%n", percentage);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.%n", percentage);
        }

        scanner.close();
    }
}
