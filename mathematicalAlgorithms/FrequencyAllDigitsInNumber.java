package mathematicalAlgorithms;

import java.util.HashMap;
import java.util.Set;

public class FrequencyAllDigitsInNumber {

    public static void getCountDigits(long number1) {

        if (String.valueOf(number1).length() == 1) {
            System.out.println(number1 + " : " + 1);
            return;
        }

        HashMap<Long, Integer> digitsMap = new HashMap<Long, Integer>();

        while (number1 != 0) {
            long lastDigit = number1 % 10;

            if (digitsMap.containsKey(lastDigit)) {
                digitsMap.put(lastDigit, digitsMap.get(lastDigit) + 1);
            } else {
                digitsMap.put(lastDigit, 1);
            }

            number1 /= 10;
        }
        System.out.println();
        Set<Long> keys = digitsMap.keySet();
        for (Long key : keys) {
            System.out.println("Number " + key + " -> appears " + digitsMap.get(key));
        }
    }

    public static void main(String[] args) {

        getCountDigits(1212);

    }
}
