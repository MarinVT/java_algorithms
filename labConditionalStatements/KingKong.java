package labConditionalStatements;

import java.util.Scanner;

public class KingKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());

        double priceDecor = budget * 0.1;
        double priceClothes = people * pricePerPerson;

        if (people > 150) {
            priceClothes = priceClothes - priceClothes * 0.1;
        }
        double totalExpenses = priceDecor + priceClothes;

        double diff = Math.abs(totalExpenses - budget);

        if (totalExpenses >= budget) {
            System.out.println("Not enough money");
            System.out.printf("Wingard needs more money - %.2f", diff);
        } else {
            System.out.println("Auction!");
            System.out.printf("Wingard starts filming with budget %.2f", diff);
        }

    }
}
