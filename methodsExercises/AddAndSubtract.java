package methodsExercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int result = sumFirstTwoNums(num1, num2) - substractOperation(num3);
        System.out.println(result);
    }

    public static int sumFirstTwoNums(int num1, int num2) {
        return num1 + num2;
    }

    public static int substractOperation(int num3) {
        return num3;
    }


}
