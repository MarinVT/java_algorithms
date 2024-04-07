package programiz_java_lessons;

public class CalculateStandardDeviation {

    public static void main(String[] args) {

        double[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double SD = calculateSD(numArray);

        System.out.printf("Standard deviation = %.6f", SD);

    }

    public static double calculateSD(double[] numArr) {

        double sum = 0.0;
        double standardDeviation = 0.0;

        for (double num : numArr) {
            sum += num;
        }

        double mean = sum / numArr.length;

        for (double num : numArr) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation / numArr.length);

    }


}
