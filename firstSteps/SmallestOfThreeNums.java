package firstSteps;

import java.util.Scanner;

public class SmallestOfThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Add number 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Add number 3: ");
        double num3 = scanner.nextDouble();

        double[] arrNumbers = {num1, num2, num3};

        System.out.print("The smallest number is: " + smallestNum(arrNumbers) + "\n");
    }

    // approach 1
//    public static double smallestNumOfThree(double num1, double num2, double num3) {
//        return Math.min(Math.min(num1, num2), num3);
//    }

    // approach 2
//    public static double smallestNum(double num1, double num2, double num3) {
//
//        if (num1 <= num2 && num1 <= num3) {
//            return num1;
//        } else if (num2 <=num1 && num2 <= num3) {
//            return num2;
//        } else if (num3 <= num1 && num3 <= num2){
//            return num3;
//        }
//        return num1;
//    }

    // approach 3
    public static double smallestNum(double...arrNums) {
        double smallestNum = Double.MAX_VALUE;

        for (int i = 0; i < arrNums.length; i++) {
            if (arrNums[i] < smallestNum) {
                smallestNum = arrNums[i];
            }
        }
        return  smallestNum;
    }
}

