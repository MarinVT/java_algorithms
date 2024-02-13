package listsArraysAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckExistNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split(" ");
            String cmd = tokens[0];

            switch (cmd) {
                case "Contains":
                    int element = Integer.parseInt(tokens[1]);
                    if (nums.contains(element)) {
                        System.out.print("Yes");
                    } else {
                        System.out.print("No such number");
                    }
                    break;
                case "Print":
                    String parity = tokens[1];
                    if (parity.equals("even")) {
                        nums.stream().filter(n -> n % 2 == 0).forEach(e -> System.out.print(e + " "));
                    } else {
                        nums.stream().filter(n -> n % 2 == 1).forEach(e -> System.out.print(e + " "));
                    }
                    break;
                case "Get":
                    nums.stream().reduce((el1, el2) -> el1 + el2).ifPresent(System.out::print);
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int number = Integer.parseInt(tokens[2]);

                    if (condition.equals("<")) {
                        nums.stream().filter((el1) -> el1 < number).forEach(e -> System.out.print(e + " "));
                    } else if (condition.equals(">")) {
                        nums.stream().filter((el1) -> el1 > number).forEach(e -> System.out.print(e + " "));
                    } else if (condition.equals(">=")) {
                        nums.stream().filter((el1) -> el1 >= number).forEach(e -> System.out.print(e + " "));
                    } else {
                        nums.stream().filter((el1) -> el1 <= number).forEach(e -> System.out.print(e + " "));
                        break;
                    }
                default:
                    break;
            }
            System.out.println();
            line = scanner.nextLine();
        }
    }
}
