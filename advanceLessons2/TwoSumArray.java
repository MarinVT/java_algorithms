package advanceLessons2;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 3, 7, 4, 8};
        int target = 6;
        int[] result = getTwoSum(numbers, target);
        System.out.print(result[0] + " " + result[1]);
    }

    public static int[] getTwoSum(int[] nums, int target) {
        Map<Integer, Integer>visitedNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];

            if (visitedNumbers.containsKey(delta)) {
                return new int[] {i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(nums[i], i);
        }
        return new int[] {-1 , -1};
    }
}
