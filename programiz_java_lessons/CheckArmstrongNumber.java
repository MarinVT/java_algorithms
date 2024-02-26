package programiz_java_lessons;

import java.util.ArrayList;
import java.util.List;

public class CheckArmstrongNumber {

    public static void main(String[] args) {
//        isNumberArmstrong(153);
        System.out.println(isArmstrong2(153));
    }

    static void isNumberArmstrong(int num) {

        int remainder;
        int result = 0;
        int mainNum = num;

        if (num <= 0) {
            System.out.println("Enter number greater than 0");
        } else {

            while (mainNum != 0) {
                remainder = mainNum % 10;
                result += Math.pow(remainder, 3);
                mainNum /= 10;
            }

            if (result == num) {
                System.out.println(num + " is armstrong number!");
            } else {
                System.out.println(num + " is not armstrong number!");
            }
        }




    }

    static List<Integer> digitList(int n) {
        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        return list;
    }

    static boolean isArmstrong2(int num) {
        if (num < 0) {
            return false;
        }

        List<Integer> digitsList = digitList(num);
        int len = digitsList.size();
        int sum = digitsList.stream().
                mapToInt(d -> (int) Math.pow(d, len))
                .sum();
        return num == sum;
    }


}
