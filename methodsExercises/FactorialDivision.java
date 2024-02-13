package methodsExercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        double divisionResult = factMethod(num1) / factMethod(num2);
        System.out.printf("%.2f", divisionResult);
    }

    public static double factMethod(double num) {
        double factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
