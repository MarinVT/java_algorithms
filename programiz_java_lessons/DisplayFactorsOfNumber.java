package programiz_java_lessons;

public class DisplayFactorsOfNumber {

    public static void main(String[] args) {
        displayFactorsOfNumber(60);
    }

    static void displayFactorsOfNumber(int num) {

        for (int i = 1; i <= num; ++i) {

            if (num % i == 0) {
                System.out.print(i+ ", ");
            }

        }

    }

}
