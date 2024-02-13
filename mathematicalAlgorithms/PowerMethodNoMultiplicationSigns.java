package mathematicalAlgorithms;

public class PowerMethodNoMultiplicationSigns {


    static int customPOW(int a, int b) {

        if (b==0) {
            return 1;
        }

        int answer = a;
        int increment = a;

        for (int i = 1; i < b; i++) {
            for (int j = 1; j < a; j++) {
                answer+=increment;
            }
            increment = answer;
        }

        return answer;
    }

    // Recursion method

    static int myCustomPow2Edition(int a, int b) {
        if (b > 0) {
            return multiply(a, myCustomPow2Edition(a, b-1));
        } else {
            return 1;
        }
    }

    static int multiply(int x, int y) {
        if (y > 0) {
            return (x + multiply(x, y - 1));
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
//        System.out.println(customPOW(5, 3));

        System.out.println(myCustomPow2Edition(5,3));
    }
}
