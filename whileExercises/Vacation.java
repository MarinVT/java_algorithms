package whileExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needMoney = Double.parseDouble(scanner.nextLine());
        double ownMoney = Double.parseDouble(scanner.nextLine());

        int countSpendDays = 0;
        int daysCount = 0;

        while (ownMoney < needMoney && countSpendDays < 5) {
            String command = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());

            daysCount++;
            if (command.equals("save")) {
                ownMoney += currentMoney;
                countSpendDays = 0;
            } else if (command.equals("spend")) {
                countSpendDays++;
                ownMoney -= currentMoney;
                if (ownMoney < 0) {
                    ownMoney = 0;
                }
            }
        }

        if (countSpendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCount);
        } else {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}
