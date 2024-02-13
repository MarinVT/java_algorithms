package advanceLessons2.LoShuMagicSquare;

import java.util.Random;

public class LoShuMagicSquare {

    private static int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
    private static Random random = new Random();

    public static void main(String[] args) {
        int counter = 0;
        do {
            counter++;
            System.out.println(counter);
            switchCells();
        } while (!isMagicSquare());
        displayBoard();
        System.out.println("It took " + counter + " tries.");
    }

    private static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(numbers[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static boolean isMagicSquare() {
        int tempSum = numbers[0][0] + numbers[0][1] + numbers[0][2];
        //compare rows, start from row 1 because stepSum already holds the sum for row 0
        for (int i = 1; i < 3; i++) {
            if (numbers[i][0] + numbers[i][1] + numbers[i][2] != tempSum) {
                return false;
            }
        }

        //compare columns
        for (int i = 0; i < 3; i++) {
            if (numbers[0][i] + numbers[1][i] + numbers[2][i] != tempSum) {
                return false;
            }
        }

        return numbers[0][0] + numbers[1][1] + numbers[2][2] == tempSum &&
                numbers[0][2] + numbers[1][1] + numbers[2][0] == tempSum;
    }

    private static void switchCells() {
        int[] number1 = new int[2];
        int[] number2 = new int[2];

        number1[0] = random.nextInt(3);
        number1[1] = random.nextInt(3);
        number2[0] = random.nextInt(3);
        number2[1] = random.nextInt(3);

        int temp = numbers[number1[0]][number1[1]];
        numbers[number1[0]][number1[1]] = numbers[number2[0]][number2[1]];
        numbers[number2[0]][number2[1]] = temp;

    }
}
