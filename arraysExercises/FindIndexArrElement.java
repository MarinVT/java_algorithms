package arraysExercises;

public class FindIndexArrElement {
    public static void main(String[] args) {
        int[] myArr = {1,2,3, 4, 5, 6};
        System.out.println(findIndex(myArr, 1));
    }

    public static int findIndex(int[] arr1, int itemIndexPosition) {

        if (arr1 == null) {
            return -1;
        }

        int lengthArr = arr1.length;
        int i = 0;
        while (i < lengthArr) {
            if (arr1[i] == itemIndexPosition){
                return i;
            } else {
                i+=1;
            }
        }
        return -1;
    }
}
