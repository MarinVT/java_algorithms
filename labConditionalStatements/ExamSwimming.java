package labConditionalStatements;

import java.util.Scanner;

public class ExamSwimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondPerMeter = Double.parseDouble(scanner.nextLine());


        double totalTime = distance * secondPerMeter;
        totalTime = totalTime + Math.floor(distance / 15) * 12.5;

        if (totalTime < record) {
            System.out.printf("Yes, he succeeded. Time: %.2f", totalTime);
        } else {
            System.out.printf("No record with time %.2f", totalTime - record);
        }
    }
}
