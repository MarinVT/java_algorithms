package mathematicalAlgorithms;

public class FindLCMOfTwoNumbers {

    // Recursion
    static void lcm(int a, int b)
    {
       int g = 0;

        for (int i = 1; i <= a && b <= b; ++i) {
            if (a % i == 0 && b % i == 0) {
                g = i;
            }
        }
        int result = (a * b) / g;
        System.out.printf("LCM of %d and %d is %d", a, b, result);
    }
    public static void main(String[] args) {
        lcm(120, 140);
    }
}
