package techFundBasicConditionalLoops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadSet = games / 2;
        int countMouse = games / 3;
        int countKeyboard = games / 6;
        int countDisplay = games / 12;

        double cost = headSetPrice * countHeadSet + mousePrice * countMouse +
                        keyboardPrice * countKeyboard + displayPrice * countDisplay;

        System.out.println(String.format("Rage expenses: %.2f", cost));

    }
}
