package arraysExercises;

public class MaxNum2DimenArr {
    public static void main(String[] args) {
        int[][] arr2Dim = {
                {1, 115, 4, 12},
                {0, 5, 2, 1112},
                {11, 22, 12, 25}
        };

        for (int i = 0; i < arr2Dim.length; i++) {
            int max = arr2Dim[i][0];

            System.out.println("Row " + (i + 1) + ": " + getMaxNumArr(arr2Dim[i]));
        }

    }

    private static int getMaxNumArr(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            max = (max < nums[i]) ? nums[i] : max;
        }
        return max;
    }
}
