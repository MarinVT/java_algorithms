package arraysExercises;

public class SumArrValues {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4};

        int sum = 0;
//        for (int i = 0; i < myArr.length; i++) {
//            sum += myArr[i];
//        }

        for (int i : myArr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
