package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Softing1 {
    public static void main(String[] args) {
        Map<String, List<String>> coursesByStudent = new HashMap<>();
        Map<String, Double> averageGradeStudent = new HashMap<>();

        coursesByStudent.putIfAbsent("marin1", new ArrayList<>());
        coursesByStudent.putIfAbsent("gosho", new ArrayList<>());
        coursesByStudent.putIfAbsent("johny", new ArrayList<>());

        coursesByStudent.get("marin1").add("java");
        coursesByStudent.get("gosho").add("PY");
        coursesByStudent.get("johny").add("PHP");
        coursesByStudent.get("marin1").add("java 1.8");
        coursesByStudent.get("johny").add("JS");

        averageGradeStudent.putIfAbsent("marin1", 4.6);
        averageGradeStudent.putIfAbsent("gosho", 6.00);
        averageGradeStudent.putIfAbsent("johny", 3.9);

        averageGradeStudent.entrySet().stream().sorted(
                (es1, es2) -> Double.compare(es2.getValue(), es1.getValue())
        ).forEach(es -> {
            String key = es.getKey();
            Double avrGrade = es.getValue();
            List<String> courses = coursesByStudent.get(key);
            System.out.printf("%s has avr grade of %.2f and courses: ", key, avrGrade);
            System.out.println(String.join(", ", courses));
        });
    }
}
