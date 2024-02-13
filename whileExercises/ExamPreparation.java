package whileExercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gradesLow = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counterLowGrades = 0;
        int sumAllGrades = 0;
        int counterAllProblems = 0;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            lastProblem = input;
            int currentGrade = Integer.parseInt(scanner.nextLine());
            sumAllGrades += currentGrade;
            counterAllProblems++;
            if (currentGrade <= 4) {
                counterLowGrades++;
                if (counterLowGrades == gradesLow) {
                    break;
                }
            }

            input = scanner.nextLine();
        }

        double averageScoreGrade = sumAllGrades * 1.0 / counterAllProblems;

        if (counterLowGrades == gradesLow) {
            System.out.printf("You need a break, %d poor grades.", counterLowGrades);
        } else {
            System.out.println(String.format("Average score: %.2f", averageScoreGrade));
            System.out.printf("Number of problems: %d%n", counterAllProblems);
            System.out.println("Last problem: " + lastProblem);
        }
    }
}
