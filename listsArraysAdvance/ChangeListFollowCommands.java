package listsArraysAdvance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeListFollowCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toCollection(ArrayList::new));


        String lineStr = scanner.nextLine();

        while (!lineStr.equals("end")) {
            String[] tokens = lineStr.split("\\s+");
            String command = tokens[0];

            if (command.equals("Delete")) {
                int element = Integer.parseInt(tokens[1]);

                while (numbers.contains(element)) {
                    numbers.remove(Integer.valueOf(element));
                }
            } else {
                int element = Integer.parseInt(tokens[1]);
                int indexPosition = Integer.parseInt(tokens[2]);

                if (indexPosition < numbers.size()) {
                    numbers.add(indexPosition, element);
                }
            }

            lineStr = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
