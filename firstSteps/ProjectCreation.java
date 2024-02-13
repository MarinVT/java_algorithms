package firstSteps;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfCreator = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());
        int timeForOneProject = 3 * countProjects;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nameOfCreator, timeForOneProject, countProjects);
    }
}
