package programiz_java_lessons;

public class ConvertBinaryToDecimal {

    public static void main(String[] args) {
        int num = 110110111;

        int decimal = convertBinaryToDecimal(num);
        System.out.println("Binary to Decimal " + decimal);

    }

    static int convertBinaryToDecimal(long num) {

        int decimalNum = 0;
        int i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNum += remainder * Math.pow(2, i);
            ++i;
        }

        return decimalNum;
    }

}
