package examsTasks;

import java.util.Scanner;

public class SleepingCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());
        int norma = 30000;

        int workDays = 365 - restDays;
        int playTime = workDays * 63 + restDays * 127;

        int mins = Math.abs(norma - playTime) % 60;
        int hours = Math.abs(norma - playTime) / 60;

        if (playTime >= norma) {
            System.out.printf("Tom will run away%n");
            System.out.printf("%d hours and %d minutes more for play", hours, mins);
        } else {
            System.out.printf("Tom sleeps well%n");
            System.out.printf("%d hours and %d minutes less for play", hours, mins);
        }
    }
}
