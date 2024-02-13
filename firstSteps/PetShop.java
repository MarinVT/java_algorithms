package firstSteps;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCountDogs = Integer.parseInt(scanner.nextLine());
        int restTotalCountAnimals = Integer.parseInt(scanner.nextLine());

        double dogs = totalCountDogs * 2.50;
        double otherAnimals = restTotalCountAnimals * 4;

        double result = dogs + otherAnimals;
        System.out.printf("%.2f", result);
    }
}
