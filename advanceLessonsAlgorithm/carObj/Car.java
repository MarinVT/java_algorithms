package advanceLessonsAlgorithm.carObj;

import java.util.Scanner;

public class Car {

    Scanner scanner = new Scanner(System.in);

    //private fields
    private String _model;
    private String _make;
    private int _year;


    //constructor
    public Car(String make, String model, int year) {
        _model = model;
        _make = make;
        setYear(year);
    }

    //getter
    public String getModel() {
        return _model;
    }

    public String getMake() {
        return _make;
    }

    public int getYear() {
        return _year;
    }

    //setters
    public void setModel(String model) {
        _model = model;
    }

    public void setMake(String make) {
        _make = make;
    }

    public void setYear(int year) {

        while (year < 1900 || year > 2015) {
            System.out.println("Please enter valid year");
            year = scanner.nextInt();
        }
        _year = year;
    }


    public String toString() {
        return _make + " " + _model + " " + Integer.toString(_year);
    }
}

