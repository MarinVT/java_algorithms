package nestedLoops;

import java.util.Scanner;

public class LabTravelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        String destination = "";

        while (!input.equals("End")) {
            destination = input;
            double minBudget = Double.parseDouble(scanner.nextLine());
            double sum = 0;

            while (true) {
                if (sum >= minBudget) {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }

                double currVal = Double.parseDouble(scanner.nextLine());
                sum+=currVal;
            }
            input = scanner.nextLine();
        }

    }
}
