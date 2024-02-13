package arraysExercises;

public class MultiDimentionalArrLoopingForeach {
    public static void main(String[] args) {

        int[][] multiDimArr = {{2,3,1},{1,2,4}};

        // Foreach looping
        for (int[] arr1 : multiDimArr) {
            for (int arr2 : arr1) {
//                System.out.print(arr2);
            }
        }

        //For loop
        for (int i = 0; i < multiDimArr.length; i++) {
            for (int j = 0; j <= multiDimArr.length; j++) {
                System.out.print(multiDimArr[i][j] + " ");
            }
        }
    }
}
