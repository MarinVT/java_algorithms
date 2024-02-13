package mathematicalAlgorithms;

import java.util.Scanner;

public class BabylonianForSquareRoot {

    static float squareRoot(float num) {
        float x = num;
        float y = 1;

        double e = 0.000001;
        while (x - y > e) {
            x = (x + y) / 2;
            y = num / x;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println("Square roof of " + n + " is " + squareRoot(n));
    }
}
