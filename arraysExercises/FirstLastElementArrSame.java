package arraysExercises;

public class FirstLastElementArrSame {

    public static void main(String[] args) {

        int[] arr = {10, 2,3, 4, 10};
        System.out.println(firstLastElementTheSameArr(arr, 10));

    }

    static boolean firstLastElementTheSameArr(int[] arr, int element) {

        return (arr.length >= 2 && arr[0] == element && arr[arr.length - 1] == element);

    }

}
