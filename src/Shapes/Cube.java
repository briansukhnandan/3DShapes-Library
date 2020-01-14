package Shapes;

public class Cube {

    public double side;

    /**
     * Default constructor for Cube class.
     * The length of a side is set to 1 by default.
     * */
    public Cube () { side = 1; }

    /**
     * If a user gives a specific measurement for length, use this constructor.
     * Also checks to see if the supplied length is negative, which will throw an IllegalArgumentException.
     *
     * @param s This is the user-supplied length of one side of the cube.
     * */
    public Cube (double s) throws IllegalArgumentException {
        side = s;
        if (side < 0) throw new IllegalArgumentException("The Length of a cube cannot be negative.");
    }

    /**
     * .areaOfFace() - Takes the length and gets the area by doing side^2.
     *
     * @return The area of one face of the cube.
     * */
    public double areaOfFace () {
        return side*side;
    }

    /**
     * .volume() - calculates the volume of a Cube by doing side^3.
     *
     * @return The Volume of the cube.
     * */
    public double Volume () { return side*side*side; }

    /**
     * .surfaceArea() - calculates the Surface Area of a cube by doing 6*(s^2).
     *
     * @return The Surface Area of the cube.
     * */
    public double surfaceArea () { return 6*areaOfFace(); }

    /**
     * .diagonalLength() - calculates the length of the diagonal of a cube
     *                     from one corner to the other by doing rad(3)*s.
     *
     * @return The length of the diagonal of the cube.
     * */
    public double diagonalLength () { return Math.sqrt(3)*side; }

    /**
     * .faceDiagonalLength() - calculates the length of the diagonal for one
     *                         face of the cube by doing rad(2)*s.
     *
     * @return The length of the diagonal for one face of the cube.
     * */
    public double faceDiagonalLength() { return Math.sqrt(2)*side; }

    /**
     * Get/Set methods for the length of the edge.
     * */
    public void setSide (double x) { this.side = x; }
    public double getSide () { return side; }

}
