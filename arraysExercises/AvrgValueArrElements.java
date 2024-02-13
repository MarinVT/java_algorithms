package arraysExercises;

public class AvrgValueArrElements {
    public static void main(String[] args) {
        int[] myArr = new int[] {1,2,3,4,5,6};

        int sum = 0;

        for (int i = 0; i < myArr.length; i++) {
            sum+=myArr[i];
        }

        System.out.println((float) sum / myArr.length);
    }
}
