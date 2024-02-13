package examsTasks;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int dayNeeded = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());


        double projectWork = 0.9 * dayNeeded * 8;
        double moreWork = employees * (2 * dayNeeded);
        double totalTimeprojectWork = projectWork + moreWork;


        if (totalTimeprojectWork > neededHours) {
            System.out.printf("Yes!%.0f hours left.", Math.floor(totalTimeprojectWork - neededHours));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.abs(Math.floor(totalTimeprojectWork - neededHours)));
        }

    }
}
