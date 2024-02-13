package mathematicalAlgorithms;

public class AverageOfStreamNumbers {

    static float getAverage(float prevAverage, float x, int n) {
        return (prevAverage * n + x) / (n + 1);
    }

    static void streamAverage(float arr[], int n) {
        float avrg = 0;

        for (int i = 0; i < n; i++) {
            avrg = getAverage(avrg, arr[i], i);
            System.out.printf("Average of %d numbers is %f \n", i + 1, avrg);
        }
        return;
    }

    public static void main(String[] args) {
        float arr[] = { 10, 20, 30, 40, 50, 60 };
        int n = arr.length;
        streamAverage(arr, n);
    }
}
