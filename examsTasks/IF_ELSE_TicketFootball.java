package examsTasks;

import java.util.Scanner;

public class IF_ELSE_TicketFootball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String categoryVIPorNormal = scanner.nextLine();
        int fansFootball = Integer.parseInt(scanner.nextLine());

        double transport = 0;

        if (fansFootball >= 1 && fansFootball <= 4) {
            transport = 75.00;
        } else if (fansFootball >= 5 && fansFootball <= 9) {
            transport = 60.00;
        } else if (fansFootball >= 10 && fansFootball <= 24) {
            transport = 50.00;
        } else if (fansFootball >= 25 && fansFootball <= 49) {
            transport = 40.00;
        } else {
            transport = 25.00;
        }

        double bugdetTransport = budget * transport / 100;
        double ticketBudget = budget - bugdetTransport;
        boolean enough = false;
        double leftMoney = 0.0;
        double neededMoney = 0.0;

        if (categoryVIPorNormal.equals("VIP")) {
            if (ticketBudget / fansFootball > 499.99) {
                enough = true;
                leftMoney = ticketBudget - (fansFootball * 499.99);
            } else {
                enough = false;
                neededMoney = (fansFootball * 499.99) - ticketBudget;
            }
        } else if (categoryVIPorNormal.equals("Normal")) {
            if (ticketBudget / fansFootball > 249.99) {
                enough = true;
                leftMoney = ticketBudget - (fansFootball * 249.99);
            } else {
                enough = false;
                neededMoney = (fansFootball * 249.99) - ticketBudget;
            }
        }

        if (enough) {
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }
}
