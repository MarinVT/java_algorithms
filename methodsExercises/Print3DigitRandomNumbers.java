package methodsExercises;

public class Print3DigitRandomNumbers {

    public static void main(String[] args) {

        print3DigitRandomNum();

    }

    static void print3DigitRandomNum() {
        int amount = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    amount++;
                    System.out.println(i + "" + j + "" + k);
                }
            }
        }

        System.out.println(amount + " is the total generated three digit numbers");
    }

}
