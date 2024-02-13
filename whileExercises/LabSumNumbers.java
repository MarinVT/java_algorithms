package whileExercises;

import java.util.Scanner;

public class LabSumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (true) {
            if (sum >= inputNum) {
                break;
            }

            int currentNum = Integer.parseInt(scanner.nextLine());
            sum+=currentNum;
        }
        System.out.println(sum);
    }
}
