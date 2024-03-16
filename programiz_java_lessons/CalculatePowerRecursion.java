package programiz_java_lessons;

public class CalculatePowerRecursion {

    public static void main(String[] args) {

        System.out.println(powerRecursion(2, 2));

    }

    static int powerRecursion(int base, int powerRaised) {

        if (powerRaised != 0) {
            return (base * powerRecursion(base, powerRaised - 1));
        } else {
            return 1;
        }
    }

}
