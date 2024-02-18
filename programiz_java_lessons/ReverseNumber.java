package programiz_java_lessons;

public class ReverseNumber {

    public static void main(String[] args) {
        reverseNumber(253);
    }

    static void reverseNumber(int num) {
        System.out.println("Origin number is: " + num);
        int reversNum = 0;
        while (num != 0) {
            // I am taking the first number
            int lastDigit = num % 10;
            reversNum = reversNum * 10 + lastDigit;
            // I have to remove the last digit from the number
            num /= 10;
        }

        System.out.println("Reversed number is: " + reversNum);
    }

}
