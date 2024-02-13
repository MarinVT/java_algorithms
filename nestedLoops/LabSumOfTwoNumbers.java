package nestedLoops;

import java.util.Scanner;

public class LabSumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isValid = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                int sum = i + j;

                if (sum == magicNumber) {
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter,i, j, sum);
                    break;
                }
            }
            if (isValid){
                break;
            }
        }

        if (isValid == false) {
            System.out.printf("%d combination - neither equals %d", counter, magicNumber);
        }
    }
}
