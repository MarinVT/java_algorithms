package mathematicalAlgorithms;

public class missingNumberIntegerArray {

    static int findMissingNumArr(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualResult = 0;

        for (int i : numbers) {
            actualResult+=i;
        }

        return expectedSum-actualResult;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};

        System.out.println(findMissingNumArr(arr, 5));
    }
}
