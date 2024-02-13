package firstSteps;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMetersArea = Double.parseDouble(scanner.nextLine());

        double priceWholeArea = squareMetersArea * 7.61;
        double discountPriceWholeArea = 0.18 * priceWholeArea;

        double finalePrice = priceWholeArea - discountPriceWholeArea;

        System.out.printf("The finale price is: %.2f lv.%n", finalePrice);
        System.out.printf("The discount is: %.2f lv.", discountPriceWholeArea);
    }
}
