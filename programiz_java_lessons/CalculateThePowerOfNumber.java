package programiz_java_lessons;

public class CalculateThePowerOfNumber {

    public static void main(String[] args) {

        double numPower = powerOfNum(2, 2);
        System.out.println((int) numPower);

    }

    // Java Math.pow
    static double powerOfNum(double base, double exponent) {
        return Math.pow(base, exponent);
    }



}
