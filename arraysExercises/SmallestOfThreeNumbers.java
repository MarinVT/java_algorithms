package arraysExercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        double n3 = Double.parseDouble(scanner.nextLine());

        double[] arrNumbers = {n1, n2, n3};

        System.out.println(smallestOfThreeNumbers(arrNumbers));
    }

    public static double smallestOfThreeNumbers(double... arrNumbers) {

        double smallest = Double.MAX_VALUE;
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] < smallest) {
                smallest = arrNumbers[i];
            }
        }
        return smallest;
    }
}
