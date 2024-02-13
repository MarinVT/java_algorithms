package listsArraysAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        List<Integer> drums = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        List<Double> prices = drums.stream().map(e -> e * 3d).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(line);

            for (int i = 0; i < drums.size(); i++) {

                if (drums.get(i) == Integer.MIN_VALUE) {
                    continue;
                }

                drums.set(i, drums.get(i) - power);

                if (drums.get(i) <= 0) {
                    double price = prices.get(i);

                    if (money >= price) {
                        money -= price;
                        drums.set(i, (int) price / 3);
                    } else {
                        drums.set(i, Integer.MIN_VALUE);
                    }
                }
            }

            line = scanner.nextLine();
        }

        drums.stream().filter(e -> e != Integer.MIN_VALUE).forEach(d -> System.out.print(d + " "));
        System.out.printf("%nGabsy has %.2flv.", money);
    }
}
