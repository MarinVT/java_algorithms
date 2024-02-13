package advanceLessonsAlgorithm.SphereCreation;

import java.text.NumberFormat;

public class Sphere {
    private double _diameter;

    public Sphere(double diameter) {
        _diameter = diameter;
    }

    public double getDiameter() {
        return _diameter;
    }

    public void setDiameter(int diameter) {
        _diameter = diameter;
    }

    public double getVolume() {
        double v = 0.0;

        v = (4.00 / 3) * Math.PI * Math.pow(getDiameter() / 2, 3);
        return v;
    }

    public double getArea() {
        double area = 0;

        area = 4 * Math.PI * Math.pow(getDiameter(), 2);
        return area;
    }

    public String toString() {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        return numberFormat.format(getDiameter());
    }
}
