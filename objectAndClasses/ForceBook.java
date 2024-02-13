package objectAndClasses;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Map<String, List<String>> usersBySide = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Lumpawaroo")) {

            if (inputLine.equals(" | ")) {
                String[] elements = inputLine.split(" \\| ");
                String user = elements[1];
                String side = elements[0];

                usersBySide.putIfAbsent(side, new ArrayList<>());

                boolean exists = false;

                for (Map.Entry<String, List<String>> entry : usersBySide.entrySet()) {
                    List<String> users = entry.getValue();

                    if (users.contains(user)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    usersBySide.get(user).add(user);
                }

            } else if (inputLine.equals("->")) {
                String[] elements = inputLine.split(" -> ");
                String user = elements[0];
                String side = elements[1];
            }

            inputLine = scanner.nextLine();
        }

//        LinkedHashMap<String, List<String>> newMapLoop = new LinkedHashMap<>();

        usersBySide.entrySet().stream().sorted((es1, es2) -> {
            int count2 = es2.getValue().size();
            int count1 = es1.getValue().size();

            if (count1 == count2) {
                return es1.getKey().compareTo(es2.getKey());
            }

            return Integer.compare(count2, count1);
        }).forEach(es -> {
            if (es.getValue().size() == 0) {
                return;
            }
            System.out.printf("Side: %s, Members: %d%n ", es.getKey(), es.getValue().size());
            Collections.sort(es.getValue());
            es.getValue().forEach(user1 -> System.out.println("! " + user1));
//            newMapLoop.put(m.getKey(), m.getValue());
        });
    }
}
