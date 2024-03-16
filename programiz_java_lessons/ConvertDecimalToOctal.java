package programiz_java_lessons;

public class ConvertDecimalToOctal {

    public static void main(String[] args) {

        int num = 78;
        int octal = convertDecimalToOctal(num);
        System.out.printf("%d in decimal = %d in octal ", num, octal);

    }

    static int convertDecimalToOctal(int num) {
        int octalNum = 0;
        int i = 1;

        while (num != 0) {
            octalNum += (num % 8) * i;
            num /= 8;
            i *= 10;
        }

        return octalNum;
    }

}
