package examsTasks;
import java.util.Scanner;

class Fueltank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double price = 0;
        if ("Gas".equals(fuel) && "Yes".equals(clubCard)) {
            if (litres >= 20 && litres <= 25) {
                price = (litres * 0.85) * 0.92;
            }if (litres > 25) {
                price = (litres * 0.85) * 0.9;
            }
        }

        if ("Gas".equals(fuel) && "No".equals(clubCard)) {
            price = litres * 0.93;
            if (litres >= 20 && litres <= 25) {
                price = price * 0.92;
            }if (litres > 25) {
                price = price * 0.9;
            }
        }

        if ("Gasoline".equals(fuel) && "Yes".equals(clubCard)) {
            if (litres >= 20 && litres <= 25) {
                price = (litres * 2.04) * 0.92;
            }if (litres > 25) {
                price = (litres * 2.04) * 0.9;
            }
        }

        if ("Gasoline".equals(fuel) && "No".equals(clubCard)) {
            price = litres * 2.22;
            if (litres >= 20 && litres <= 25) {
                price = price * 0.92;
            }else if (litres > 25) {
                price = price * 0.9;
            }
        }

        if ("Diesel".equals(fuel) && "Yes".equals(clubCard)) {
            if (litres >= 20 && litres <= 25) {
                price = (litres * 2.21) * 0.92;
            }else if (litres > 25) {
                price = (litres * 2.21) * 0.9;
            }
        }

        if ("Diesel".equals(fuel) && "No".equals(clubCard)) {
            price = litres * 2.33;
            if (litres >= 20 && litres <= 25) {
                price = price * 0.92;
            }else if (litres > 25) {
                price = price * 0.9;
            }
        }

        System.out.printf("%.2f lv.", price);

    }
}