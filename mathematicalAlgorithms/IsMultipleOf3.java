package mathematicalAlgorithms;

import java.util.Scanner;

public class IsMultipleOf3 {

//    Algorithm: isMutlipleOf3(n)
//      1) Make n positive if n is negative.
//      2) If number is 0 then return 1
//      3) If number is 1 then return 0
//      4) Initialize: odd_count = 0, even_count = 0
//      5) Loop while n != 0
//            a) If rightmost bit is set then increment odd count.
//            b) Right-shift n by 1 bit
//            c) If rightmost bit is set then increment even count.
//            d) Right-shift n by 1 bit
//      6) return isMutlipleOf3(odd_count - even_count)

    static int isMultipleOf3 (int num) {
        int oddCount = 0;
        int evenCount = 0;

        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            return 1;
        }

        if (num == 1) {
            return 0;
        }

        while (num != 0) {

            if ((num & 1) != 0) {
                oddCount++;
            }

            if ((num & 2) != 0) {
                evenCount++;
            }

            num = num >> 2;
        }

        return isMultipleOf3(Math.abs(oddCount - evenCount));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (isMultipleOf3(num) != 0) {
            System.out.println(num + " is multiple of 3");
        } else {
            System.out.println(num + " is not multiple of 3");
        }
    }
}
