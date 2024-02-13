package arraysExercises;

public class SumArrMatrix {
    public static void main(String[] args) {

        int my2DArray[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int result = sumArrMatrix(my2DArray);

        System.out.println(result);

    }

    static int sumArrMatrix(int[][] arr) {

        int sumArrElements = 0;

        for (int[] mainArrElements : arr) {
            for (int element : mainArrElements) {
                sumArrElements+=element;
            }
        }

        return sumArrElements;
    }

}
