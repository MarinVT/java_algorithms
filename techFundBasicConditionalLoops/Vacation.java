package techFundBasicConditionalLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroup = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.0;

        if (day.equals("Friday")) {
            if (typeGroup.equals("Students")) {
                price = 8.45 * countGroup;
            } else if (typeGroup.equals("Business")) {
                price = 10.9 * countGroup;
            } else {
                price = 15 * countGroup;
            }
        } else if (day.equals("Saturday")) {
            if (typeGroup.equals("Students")) {
                price = 9.8 * countGroup;
            } else if (typeGroup.equals("Business")) {
                price = 15.60 * countGroup;
            } else {
                price = 20 * countGroup;
            }
        } else {
            if (typeGroup.equals("Students")) {
                price = 10.46 * countGroup;
            } else if (typeGroup.equals("Business")) {
                price = 16 * countGroup;
            } else {
                price = 22.5 * countGroup;
            }
        }

        if (typeGroup.equals("Students") && countGroup >= 30) {
            price *= 0.85;
        } else if (typeGroup.equals("Business") && countGroup >= 100) {
            double pricePerPerson = price / countGroup;
            price -= pricePerPerson * 10;
        } else if (countGroup >= 10 && countGroup <= 20 && typeGroup.equals("Regular")) {
                price *= 0.95;
        }

        System.out.println(String.format("Total price: %.2f", price));
    }
}
