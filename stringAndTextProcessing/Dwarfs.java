package stringAndTextProcessing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Dwarfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> physicsNameAndColor = new LinkedHashMap<>();
        Map<String, Integer> countByColor = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Once upon a time")) {
            String[] tokens = inputLine.split(" <:> ");
            String name = tokens[0];
            String color = tokens[1];
            int physics = Integer.parseInt(tokens[2]);

            countByColor.putIfAbsent(color, 0);

            String nameAndColor = color + ":"+name;
            if (physicsNameAndColor.containsKey(nameAndColor)) {
                if (physicsNameAndColor.get(nameAndColor) < physics) {
                    physicsNameAndColor.put(nameAndColor, physics);
                }
            } else {
                physicsNameAndColor.put(nameAndColor, physics);
                countByColor.put(color, countByColor.get(color) + 1);
            }

            inputLine = scanner.nextLine();
        }

        physicsNameAndColor.entrySet().stream().sorted(
                (es1, es2) -> {
                    Integer physics2 = es2.getValue();
                    Integer physics1 = es1.getValue();

                    if (physics1.equals(physics2)) {
                        String key1 = es1.getKey();
                        String key2 = es2.getKey();

                        String color1 = key1.split(":")[0];
                        String color2 = key2.split(":")[0];

                        Integer count1 = countByColor.get(color1);
                        Integer count2 = countByColor.get(color2);

                        return Integer.compare(count2, count1);
                    }

                    return Integer.compare(physics2, physics1);
                }
        ).forEach(
                es1 -> {
                    String[] colorAndName = es1.getKey().split(":");
                    Integer physics = es1.getValue();

                    System.out.printf("(%s) %s <-> %d%n",colorAndName[0], colorAndName[1], physics);
                }
        );

    }
}
