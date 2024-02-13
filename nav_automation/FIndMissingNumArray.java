package nav_automation;

import java.util.ArrayList;
import java.util.List;

public class FIndMissingNumArray {

    // Using List
    public static List<Integer> findMissingNumArr(int[] arrNums) {

        for (int i = 0; i < arrNums.length; i++) {
            int index = Math.abs(arrNums[i]);

            if (arrNums[index - 1] > 0){
                arrNums[index - 1] *= -1;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrNums.length; i++) {

            if (arrNums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    static int getMissingNumFromArr(int[] arr, int num) {
        int total = 1;

        for (int i = 2; i <= (num + 1); i++) {
            total += i;
            total -= arr[i - 2];
        }
        return total;
    }


    public static void main(String[] args) {

        int[] myArr = {1,2,4,6};
//        System.out.println(findMissingNumArr(myArr));
        System.out.println(getMissingNumFromArr(myArr, myArr.length));
    }

}
