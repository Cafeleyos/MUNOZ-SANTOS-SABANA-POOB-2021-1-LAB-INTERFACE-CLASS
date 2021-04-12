package Shapes;

public class Cube extends RectangleSolid {
    public Cube() {
    }

    public Cube(String color) {
        super(color);
    }

    public Cube(double side) {
        super(side, side, side);
    }

    public Cube(double side, String color) {
        super(side, side, side, color);
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }

    @Override
    public double getSuperficialArea() {
        return super.getSuperficialArea();
    }
}



