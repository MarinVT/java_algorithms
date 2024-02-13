package stringAndTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int multiplicator = Integer.parseInt(scanner.nextLine());

        if (multiplicator == 0) {
            System.out.println(0);
        } else {
            int module = 0;
            List<Integer> listResult = new ArrayList<>();
            // starting -1 to take the last symbol
            for (int i = number.length() - 1; i >= 0; i--) {
                int currentResult = (number.charAt(i) - '0') * multiplicator;
                currentResult += module;
                module = currentResult / 10;
                listResult.add(currentResult % 10);
            }

            if (module != 0) {
                listResult.add(module);
            }

            for (int i = listResult.size() - 1; i >= 0; i--) {
                System.out.print(listResult.get(i));
            }
            System.out.println();
        }
    }
}
