package Shapes;

public class Cylinder extends Circle implements GeometricShape3D {

    private double height;

    public Cylinder() {
        super();
        this.height = 1;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }


    public double getVolume() {
        return super.getArea()*height;
    }

    public double getSuperficialArea() {
        return (2* PI *getRadius()*this.height)+(2* PI *getRadius()*getRadius());
    }
}
