package labConditionalStatements;

import java.util.Scanner;

public class LabExamToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        int puzzlesTotal = Integer.parseInt(scanner.nextLine());
        int speakingDollsTotal = Integer.parseInt(scanner.nextLine());
        int puppyBearsTotal = Integer.parseInt(scanner.nextLine());
        int minionsTotal = Integer.parseInt(scanner.nextLine());
        int tracksTotal = Integer.parseInt(scanner.nextLine());


        double totalSumPrice = puzzlesTotal * 2.60 +
                               3.00 * speakingDollsTotal +
                               4.10 * puppyBearsTotal +
                               8.20 * minionsTotal +
                               2.00 * tracksTotal;

        double totalCountToys = puzzlesTotal + speakingDollsTotal + puppyBearsTotal + minionsTotal + tracksTotal;

        if (totalCountToys >= 50) {
            totalSumPrice = totalSumPrice - (totalSumPrice * 0.25);
        }

        totalSumPrice = totalSumPrice - (totalSumPrice * 0.10);

        double diff = Math.abs(totalSumPrice - priceTrip);
        if (totalSumPrice >= priceTrip) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
        System.out.println();
    }
}
