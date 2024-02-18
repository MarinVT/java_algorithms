package programiz_java_lessons;

public class CountNumberOfDigits {

    public static void main(String[] args) {
        countNumberDigits(10);
    }

    static void countNumberDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
}
