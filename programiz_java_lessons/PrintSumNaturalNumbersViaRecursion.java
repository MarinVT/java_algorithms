package programiz_java_lessons;

public class PrintSumNaturalNumbersViaRecursion {

    public static void main(String[] args) {

        int num = 20;
        int sum = sumNaturalNumsViaRecursion(num);
        System.out.println(sum);

    }

    static int sumNaturalNumsViaRecursion(int num) {

        if (num <= 0) {
            return num;
        }

        if (num != 0) {
            return num + sumNaturalNumsViaRecursion(num - 1);
        } else {
            return num;
        }
    }

}
