package techFundArraysExercises;

import java.util.Scanner;

public class TrainCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());

        int[] passengers = new int[wagonsCount];

        int sum = 0;
        for (int i = 0; i < passengers.length; i++) {
            passengers[i] = Integer.parseInt(scanner.nextLine());
            sum += passengers[i];
        }

//        for (int i = 0; i < passengers.length; i++) {
//            System.out.print(passengers[i] + " ");
//        }
        for (int passenger : passengers) {
            System.out.print(passenger + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
