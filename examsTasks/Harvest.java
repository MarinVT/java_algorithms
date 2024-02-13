package examsTasks;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lozeX = Integer.parseInt(scanner.nextLine());
        double quarterYLoze = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrozde = lozeX * quarterYLoze;
        double wineTotal = (totalGrozde * 0.4) / 2.5;



        if (wineTotal > wineNeeded) {
            double diffWine = wineTotal - wineNeeded;
            double forWorkersWine = diffWine / countWorkers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wineTotal);
            System.out.printf("%.0f liters left -> %.0f liters per person.", diffWine,forWorkersWine);
        } else {
            double diffWine = Math.abs(wineTotal - wineNeeded);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diffWine);
        }
    }
}
