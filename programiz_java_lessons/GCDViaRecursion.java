package programiz_java_lessons;

public class GCDViaRecursion {

    public static void main(String[] args) {
        int gcdResult = gcd(366, 60);
        System.out.println("GCD of 366 and 60 is " + gcdResult);
    }

    public static int gcd(int num1, int num2) {
        if (num2 != 0) {
            return gcd(num2, num1 % num2);
        } else {
            return num1;
        }
    }

}
