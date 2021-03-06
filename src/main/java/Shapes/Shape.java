package Shapes;

/**
 * Class that encloses all the posible shapes
 */

public abstract class Shape {
    private String color;

    /**
     * Default constructor.
     */
    public Shape(){

    }

    /**
     * Constructor for specifying the color
     * @param color
     */
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }



    /**
     * Verifies if the given number has decimal numbers.
     */
    public boolean isDecimal(double d) {
        return d - (int) d > 0;
    }

    /**
     *returns the class name and the color.
     */
    @Override
    public String toString() {
        return String.format("This is a %s with color %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);
    }
}
