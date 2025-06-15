package arraysExercises;

public class ArrContains1stLastElementNum10 {

    public static void main(String[] args) {

        int[] arr = {10, 2, 3, 10};
        System.out.println(arrContains10As1stAndLastElement(arr));
    }

    static boolean arrContains10As1stAndLastElement(int[] arr) {
        return (arr[0] == 10 && arr[arr.length - 1] == 10);
    }

}
