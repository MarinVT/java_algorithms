package arraysExercises;

public class SumElementsMultiDimentionalArr {
    public static void main(String[] args) {

        int[][] multiArr = {{1,2,3},{2,2,4}};


        for (int i = 0; i < multiArr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= multiArr.length; j++) {
                sum += multiArr[i][j];

            }
//            System.out.println(sum);
        }

        int sum = 0;
        for (int[] arr1 : multiArr) {
            for (int arr2 : arr1) {
                sum+=arr2;
            }
        }
        System.out.println(sum);
    }
}
