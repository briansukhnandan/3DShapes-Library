package Shapes;

public class Square_Pyramid {

    public double side_length;
    public double height;

    /**
     * Default constructor for Square_Pyramid class.
     * The length of side_length and height are set to 1 by default.
     * */
    public Square_Pyramid() {
        side_length = 1;
        height = 1;
    }

    /**
     * Constructor for handling user-defined measurements.
     * Also checks to see if any of the supplied dimensions is negative.
     *
     * @param a Side length of the Square_Pyramid.
     * @param h Height of the Square_Pyramid.
     * */
    public Square_Pyramid(double a, double h) throws IllegalArgumentException {
        side_length = a;
        height = h;
        if ((a < 0) || (h < 0)) throw new IllegalArgumentException("Side length and/or height cannot be negative.");
    }

    /**
     * .Volume() - calculates the volume of the Square Pyramid by doing (1/3)*a^2*h.
     *             In the special case where h = a/2, calculate (1/6)*a^3.
     *
     * @return The Volume of the Square Pyramid.
     * */
    public double Volume () {
        if (height == (side_length/2)) return (0.1666666667)*(side_length*side_length*side_length);
        return (0.3333333333) * (side_length*side_length) * height;
    }

    /**
     * .slantHeight() - calculates the slant height of a Square_Pyramid by doing
     *                  Math.sqrt(h^2 + (1/4)a^2). See https://www.calculatorsoup.com/calculators/geometry-solids/pyramid.php
     *                  for proof.
     *
     * @return The Slant height of the Square_Pyramid.
     * */
    public double slantHeight () { return Math.sqrt((height*height)+((0.25)*(side_length*side_length))); }

    /**
     * .lateralEdgeLength() - calculates the Lateral Edge Length of a Square_Pyramid by doing
     *                        Math.sqrt(h^2 + (1/2)a^2). See https://www.calculatorsoup.com/calculators/geometry-solids/pyramid.php
     *                        for proof.
     *
     * @return The Lateral Edge Length of the Square_Pyramid.
     * */
    public double lateralEdgeLength () { return Math.sqrt((height*height) +((0.5)*(side_length*side_length))); }

    /**
     * Get/Set Methods.
     * */
    public double getSideLength () { return side_length; }
    public double getHeight () { return height; }
    public void setSideLength (double x) { side_length = x; }
    public void setHeight (double x) { height = x; }

}