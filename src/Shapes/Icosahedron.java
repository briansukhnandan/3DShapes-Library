package Shapes;

public class Icosahedron {

    public double edge;

    /**
     * Default constructor for Icosahedron class.
     * The edge length is set to 1 by default.
     * */
    public Icosahedron () { edge = 1; }

    /**
     * Constructor for handling user-defined measurements.
     * Also checks to see if any of the supplied dimensions are negative.
     *
     * @param e Length of an edge of the Icosahedron.
     * */
    public Icosahedron (double e) throws IllegalArgumentException {
        edge = e;
        if (edge < 0) throw new IllegalArgumentException("Edge length cannot be negative.");
    }

    /**
     * .Volume() - calculates the Volume of a Icosahedron by doing 5×(3+√5)/12 × (Edge Length)^3.
     *
     * @return The Volume of the Icosahedron.
     * */
    public double Volume () { return (5*(3+Math.sqrt(5))/12) *(edge*edge*edge); }

    /**
     * .surfaceArea() - calculates the Surface Area of a Icosahedron by doing 5×√3 × (Edge Length)^2.
     *
     * @return The Surface Area of the Icosahedron.
     * */
    public double surfaceArea () { return (5*Math.sqrt(3))*(edge*edge); }

    /**
     * Get/Set Methods.
     * */
    public void setEdge (double x) { edge = x; }
    public double getEdge () { return edge; }

}