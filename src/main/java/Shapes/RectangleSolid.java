package Shapes;

public class RectangleSolid extends Rectangle implements GeometricShape3D {
    private double depth = 1.0;

    public RectangleSolid() {
    }

    public RectangleSolid(String color) {
        super(color);
    }

    public RectangleSolid(double width, double length, double depth) {
        super(width, length);
        this.depth = depth;
    }

    public RectangleSolid(double width, double length, double depth, String color) {
        super(color, width, length);
            this.depth = depth;
    }

    @Override
    public double getVolume() {
        return getArea()*this.depth;
    }

    @Override
    public double getSuperficialArea() {
        return (2*getArea())+(2*getWidth()*this.depth)+(2*getLength()*this.depth);
    }
}
