package mathematicalAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class FindSumAllOddNumbersBetween0ToN {

    private static int sumAllOddNums(int num) {
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                sum+=i;
            }
        }
        System.out.println("The sum of odd numbers between 0 and " + num + " is: ");
        return sum;
    }

    // 2nd approach
    private static int sumOddNums(List<Integer> list) {
        System.out.println("The sum of odd numbers is: ");
        return list.stream().filter(i -> i % 2 == 1).mapToInt(i -> i).sum();
    }

    public static void main(String[] args) {
//        System.out.println(sumAllOddNums(10));

        List<Integer> list = new ArrayList<Integer>();

        // add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(sumOddNums(list));
    }
}
