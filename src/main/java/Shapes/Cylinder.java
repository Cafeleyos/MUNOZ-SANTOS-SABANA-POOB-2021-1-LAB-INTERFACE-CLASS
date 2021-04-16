package Shapes;

public class Cylinder extends Circle implements GeometricShape3D {

    private double height;

    /**
     *  Constructor without parameters that specifies 1 in all attributes
     */
    public Cylinder() {
        super();
        this.height = 1;
    }

    /**
     *  Constructor for specifying the radius and height of the cylinder
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     *  Constructor for specifying the color, radius and height of the cylinder
     */
    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }


    public double getVolume() {
        return super.getArea()*height;
    }

    /**
     *  Calculates the superficial area of a cylinder
     */
    public double getSuperficialArea() {
        return (2* PI *getRadius()*this.height)+(2* PI *getRadius()*getRadius());
    }
}
