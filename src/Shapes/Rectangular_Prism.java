package Shapes;

public class Rectangular_Prism {

    public double length, width, height;

    /**
     * Default constructor for Cube class.
     * The length of all side is set to 1 by default.
     * */
    public Rectangular_Prism () {
        length = 1;
        width = 1;
        height = 1;
    }

    /**
     * Constructor for handling user-defined measurements.
     * Also checks to see if any of the supplied dimensions is negative.
     *
     * @param l Length of the prism.
     * @param w Width of the prism.
     * @param h Height of the prism.
     * */
    public Rectangular_Prism (double l, double w, double h) throws IllegalArgumentException {
        length = l;
        width = w;
        height = h;
        if (length < 0 || width < 0 || height < 0) throw new IllegalArgumentException("One or more of the dimensions cannot be negative.");
    }

    /**
     * .volume() - calculates the volume of the Prism by doing length*width*height.
     *
     * @return The Volume of the Prism.
     * */
    public double Volume () { return length*width*height; }

    /**
     * .surfaceArea() - calculates the Surface Area of a Prism by doing 2(lw+wh+hl).
     *
     * @return The Surface Area of the Prism.
     * */
    public double surfaceArea() { return 2*((length*width) + (height*length) + (height*width)); }

    /**
     * .diagonalLength() - calculates the length of the diagonal of a Prism
     *                     from one corner to the other by doing the Distance Formula:
     *                     d^2 = x^2 + y^2 + z^2, where (x,y,z) are the dimensions of the Prism.
     *
     * @return The length of the diagonal of the Prism.
     * */
    public double diagonalLength () { return Math.sqrt((length*length) + (width*width) + (height*height)); }

    /**
     * .faceDiagonalLength() - The face diagonals of a Rectangular prism can vary,
     *                         so instead this function will project the specified
     *                         two dimensions on the x-axis, and y-axis, and then
     *                         calculates the Pythagorean theorem for those supplied
     *                         dimensions.
     *
     *                         For example, specifying the Prism's length and width
     *                         for those two parameters will locate the face of the
     *                         prism in which the length and width are the edges to
     *                         be counted, and then returns the length of the diagonal
     *                         of that face.
     *
     * @param xaxis The specified dimension of the prism which will be projected onto the
     *              x-axis for measurement.
     * @param yaxis The specified dimension of the prism which will be projected onto the
     *              y-axis for measurement.
     *
     * @return The length of the diagonal for one face of the Prism.
     * */
    public double faceDiagonalLength(double xaxis, double yaxis) { return Math.sqrt((xaxis*xaxis)+(yaxis*yaxis)); }

    /**
     * Get/Set methods for the dimensions of the Prism.
     * */
    public void setHeight (double x) { this.height = x; }
    public void setWidth (double x) { this.width = x; }
    public void setLength (double x) { this.length = x; }

    public double getHeight () { return height; }
    public double getWidth () { return width; }
    public double getLength () { return length; }

}
