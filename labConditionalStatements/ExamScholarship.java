package labConditionalStatements;

import java.util.Scanner;

public class ExamScholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0;
        double gradeScholarship = 0;

        if (averageGrade >= 4.5) {
            System.out.println("You cannot get a scholarship!");
        }else if (averageGrade < 5.50) {
            if (income < minSalary) {
                socialScholarship = Math.floor(0.32 * minSalary);
                System.out.printf("You get a Social scholarship %.0fBGN", socialScholarship);
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        } else {
            gradeScholarship = Math.floor(averageGrade * 25);
            socialScholarship = Math.floor(0.35 * minSalary);
            if (socialScholarship > gradeScholarship) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", gradeScholarship);
            }
        }
    }
}
