package techFundBasicConditionalLoops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabrePrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double sabersPrice = Math.ceil(students * 1.1) * lightsabrePrice;
        robesPrice *= students;
        beltsPrice *= (students - students / 6);

        double totalCost = sabersPrice + robesPrice + beltsPrice;

        if (budget >= totalCost) {
            System.out.println(String.format("The money are enough - it will cost %.2flv.", totalCost));
        } else {
            System.out.println(String.format("Ivan cho will need %.2flv. more.", totalCost - budget));
        }
    }
}
