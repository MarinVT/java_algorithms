package practiceLessons.arrayOperations;

public class PrintDayOfWeakArr {

    static void printNumDayOfWeak(int num) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (num > 0 && num < 8) {
            System.out.println(weekdays[num - 1]);
        } else {
            System.out.println("invalid number!");
        }

    }

    public static void main(String[] args) {
        printNumDayOfWeak(3);
    }
}
