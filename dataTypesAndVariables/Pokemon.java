package dataTypesAndVariables;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginPower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int pokeCounter = 0;

        int power = beginPower;

        while (power >= distance) {
            pokeCounter++;

            power -= distance;

            if (power == beginPower / 2.00 && factor != 0) {
                power /= factor;
            }
        }

        System.out.println(power);
        System.out.println(pokeCounter);
    }
}
