package firstSteps;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double centemer = Double.parseDouble(scanner.nextLine());
        double inch = 2.54;
        double convert = centemer * inch;

        System.out.printf("%.2f", convert);
    }
}
