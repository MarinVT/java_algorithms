package examsTasks;

import java.util.Scanner;

public class TransportPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKilometersN = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();


        if (dayOrNight.equals("day")) {
            if (countKilometersN < 20) {
                double taxi = 0.70 + countKilometersN * 0.79;
                System.out.printf("%.2f", taxi);
            } else if (countKilometersN >= 20 && countKilometersN <= 99) {
                double priceBus = countKilometersN * 0.09;
                System.out.printf("%.2f", priceBus);
            } else if ( countKilometersN >= 100){
                double trainPrice = countKilometersN * 0.06;
                System.out.printf("%.2f", trainPrice);
            }
        }

        if (dayOrNight.equals("night")) {
            if (countKilometersN < 20) {
                double taxi = 0.70 + countKilometersN * 0.90;
                System.out.printf("%.2f", taxi);
            } else if (countKilometersN >= 20 && countKilometersN <= 99) {
                double priceBus = countKilometersN * 0.09;
                System.out.printf("%.2f", priceBus);
            } else if ( countKilometersN >= 100){
                double trainPrice = countKilometersN * 0.06;
                System.out.printf("%.2f", trainPrice);
            }
        }
    }
}
