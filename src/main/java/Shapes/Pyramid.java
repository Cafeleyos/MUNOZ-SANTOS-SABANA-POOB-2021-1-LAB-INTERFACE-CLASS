package Shapes;

public class Pyramid extends Triangle implements GeometricShape3D{
    private double height= 1;

    public Pyramid() {
        super();
    }

    public Pyramid(String color) {
        super(color);
    }

    public Pyramid(double side1, double side2, double side3, double height) {
        super(side1,side2,side3);
        this.height = height;
    }

    public Pyramid(double side1, double side2, double side3, double height, String color) {
        super(color, side1,side2,side3);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (1.0/3.0)*super.getArea()*this.height;
    }

    @Override
    public double getSuperficialArea() {
        double sides[] = getSides();
        double result = 0;
        for (int i = 0; i < 3; i++) {
            result += (sides[i]*height)/2;
        }
        return result+ getArea();
    }
}
