package listsArraysAdvance;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        String lineInput = scanner.nextLine();

        while (!lineInput.equals("end")) {

            String[] tokens = lineInput.split("\\s+");

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

            lineInput = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number);
        }
    }
}
