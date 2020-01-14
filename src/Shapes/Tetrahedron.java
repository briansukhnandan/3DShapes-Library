package Shapes;

public class Tetrahedron {

    public double edge;

    /**
     * Default constructor for Tetrahedron class.
     * The edge length is set to 1 by default.
     * */
    public Tetrahedron () { edge = 1; }

    /**
     * Constructor for handling user-defined measurements.
     * Also checks to see if any of the supplied dimensions are negative.
     *
     * @param e Length of an edge of the Tetrahedron.
     * */
    public Tetrahedron (double e) throws IllegalArgumentException {
        edge = e;
        if (edge < 0) throw new IllegalArgumentException("Edge length cannot be negative.");
    }

    /**
     * .surfaceArea() - calculates the Surface Area of a Tetrahedron by doing sqrt(3)*(edge^2).
     *
     * @return The Surface Area of the Tetrahedron.
     * */
    public double surfaceArea () { return Math.sqrt(3)*(edge*edge); }

    /**
     * .volume() - calculates the volume of the Tetrahedron by doing sqrt(2)/12 * (edge^3).
     *
     * @return The Volume of the Tetrahedron.
     * */
    public double Volume () { return (0.1178511301)*(edge*edge*edge); }

    /**
     * Get/Set methods.
     * */
    public void setEdge (double x) { edge = x; }
    public double getEdge () { return edge; }

}