package arraysExercises;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nTh = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<Double>> studentsGrades = new LinkedHashMap<>();

        while (nTh-- > 0) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());


            if (!studentsGrades.containsKey(name)) {
                studentsGrades.put(name, new ArrayList<>());
                studentsGrades.get(name).add(grade);
            } else {
                studentsGrades.get(name).add(grade);
            }
        }

        LinkedHashMap<String, Double> averageStudentsGrade = new LinkedHashMap<>();

        for (String name : studentsGrades.keySet()) {
            double sum = 0;

            for (int i = 0; i < studentsGrades.get(name).size(); i++) {
                sum += studentsGrades.get(name).get(i);
            }

            double averageGrade = sum / studentsGrades.get(name).size();

            if (averageGrade >= 4.50) {
                averageStudentsGrade.put(name, averageGrade);
            }
        }

        averageStudentsGrade.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry -> {
                    System.out.println(String.format("%s -> %.2f", entry.getKey(), entry.getValue()
                    ));
                });

    }
}
