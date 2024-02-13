package mathematicalAlgorithms;

public class FindAllFactorsOfNumber {

    public static void main(String[] args) {
        printAllFactorOfNumber(50);
    }

    static void printAllFactorOfNumber(int num) {

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        
    }

}
