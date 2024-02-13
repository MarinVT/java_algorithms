package stringAndTextProcessing.StudentNameHoldingHighestMarks;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Marin", 1, 90, 15);
        Student student2 = new Student("Marin1", 2, 88, 14);
        Student student3 = new Student("Marin2", 3, 92, 12);
        Student student4 = new Student("Marin3", 4, 95, 13);
        Student student5 = new Student("Marin4", 5, 99, 16);

        // add all the students objects to the ArrayList
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println("Total students size is: " + studentList.size());

//        for (Student student : studentList) {
//            System.out.println(student);
//        }

        // Streams
        studentList.stream().forEach(e -> System.out.println(e));

        // name where marks > 90
        studentList.stream().filter(e -> e.getMarks() > 90)
                .forEach(e -> System.out.println(e.getName() + " " + e.getMarks()));

        // name who got a highest mark
        int highestMark = studentList.stream().map(e -> e.getMarks()).max(Integer::compare).get();
        System.out.println(highestMark);
        studentList.stream().filter(e -> e.getMarks() == highestMark).forEach(e -> System.out.println(e));
    }

}
