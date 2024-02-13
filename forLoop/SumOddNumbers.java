package forLoop;

public class SumOddNumbers {
    public static void main(String[] args) {

        sumOddNumbers(5);

    }

    static void sumOddNumbers(int num) {

        int sum = 0;

        for (int i = 0; i <= num; i++) {

            if (i % 2 == 1) {
                sum+=i;
            }

        }

        System.out.println(sum);
    }

}
