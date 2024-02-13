package advanceLessonsAlgorithm.potpie;

public class Potpie {
    private int month;
    private int day;
    private int year;

    public Potpie(int m, int d, int y) {
        month = m;
        day = d;
        year = y;

        System.out.printf("The constructor for this is %s\n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
