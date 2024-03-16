package programiz_java_lessons;

public class FindLargestElementArray {

    public static void main(String[] args) {
        double[] numArray = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
        System.out.println(printLargestElementArr(numArray));
    }

    static double printLargestElementArr(double[] arr) {
        double largestElement = 0.0;

        for (double element : arr) {

            if (largestElement < element) {
                largestElement = element;
            }
        }

        System.out.print("The largest element is: ");
        return largestElement;
    }

}
