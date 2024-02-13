package associativeArrays;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isObtained = false;

        HashMap<String, Integer> keyRegants = new HashMap<>();
        TreeMap<String, Integer> junk = new TreeMap<>();

        keyRegants.put("motes", 0);
        keyRegants.put("shards", 0);
        keyRegants.put("fragments", 0);


        while (!isObtained) {
            String[] materials = scanner.nextLine().split("\\s+");

            for (int i = 0; i < materials.length - 1; i+=2) {
                int quantity = Integer.parseInt(materials[i]);
                String regant = materials[i + 1].toLowerCase();

                if (regant.equals("motes") || regant.equals("shards") || regant.equals("fragments")) {
                    keyRegants.put(regant, keyRegants.get(regant) + quantity);

                    if (keyRegants.get(regant) >= 250) {
                        keyRegants.put(regant, keyRegants.get(regant) - 250);

                        if (regant.equals("motes")) {
                            System.out.println("Dragonwrath obrained!");
                        } else if (regant.equals("shards")) {
                            System.out.println("Shadowmourne obrained!");
                        } else {
                            System.out.println("Valanyr obtained!");
                        }
                        isObtained = true;
                        break;
                    }

                } else {
                    if (!junk.containsKey(regant)) {
                        junk.put(regant, quantity);
                    } else {
                        junk.put(regant, junk.get(regant) + quantity);
                    }
                }
            }
        }

        keyRegants.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                .reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(stringIntEntry -> {
                    System.out.println(String.format("%s: %d", stringIntEntry.getKey(), stringIntEntry.getValue()));
                });

        junk.forEach((k,v) -> {
            System.out.println(String.format("%s: %d", k, v));
        });
    }
}
