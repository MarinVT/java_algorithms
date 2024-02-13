package nestedLoops;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int currentNum = i;
            boolean isSpecialNum = true;
            while (currentNum > 0) {
                int lastDig = currentNum % 10;
                currentNum = currentNum / 10;
                if (lastDig != 0 && n % lastDig != 0) {
                    isSpecialNum = false;
                    break;
                }
                if (lastDig == 0) {
                    isSpecialNum = false;
                }
            }
            if (isSpecialNum) {
                System.out.printf("%d ", i);
            }
        }
    }
}
