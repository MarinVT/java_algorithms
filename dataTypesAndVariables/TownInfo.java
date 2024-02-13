package dataTypesAndVariables;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
        int squareKM = Integer.parseInt(scanner.nextLine());

        System.out.println("Town " + town + " has population of " + population + " and area " + squareKM + " square km");

    }
}
