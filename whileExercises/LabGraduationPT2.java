package whileExercises;

import java.util.Scanner;

public class LabGraduationPT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int counter = 0;
        double sum = 0;
        boolean numberOfFailedYears = false, hasGraduated = true;

        while (counter < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                sum += grade;
                counter++;
            } else {
                if (!numberOfFailedYears) {
                    numberOfFailedYears = true;
                } else {
                    hasGraduated = false;
                    break;
                }
            }
        }

        if (hasGraduated) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, ++counter);
        }
    }
}
