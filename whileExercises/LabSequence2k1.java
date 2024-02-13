package whileExercises;

import java.util.Scanner;

public class LabSequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int calculation1 = 1;
        while (true) {
            if (calculation1 > num){
                break;
            }
            System.out.println(calculation1);
            calculation1 = calculation1 * 2 + 1;
        }

    }
}
