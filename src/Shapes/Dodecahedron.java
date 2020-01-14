package Shapes;

public class Dodecahedron {

    public double edge;

    /**
     * Default constructor for Dodecahedron class.
     * The edge length is set to 1 by default.
     * */
    public Dodecahedron () { edge = 1; }

    /**
     * Constructor for handling user-defined measurements.
     * Also checks to see if any of the supplied dimensions are negative.
     *
     * @param e Length of an edge of the Tetrahedron.
     * */
    public Dodecahedron (double e) throws IllegalArgumentException {
        edge = e;
        if (edge < 0) throw new IllegalArgumentException("Edge length cannot be negative.");
    }

    /**
     * .Volume() - calculates the Volume of a Dodecahedron by doing (15+7×√5)/4 × (Edge Length)^3.
     *
     * @return The Volume of the Dodecahedron.
     * */
    public double Volume () { return ((15+(7*Math.sqrt(5)))/4)*(edge*edge*edge); }

    /**
     * .surfaceArea() - calculates the Surface Area of a Dodecahedron by doing 3×√(25+10×√5) × (Edge Length)^2.
     *
     * @return The Surface Area of the Dodecahedron.
     * */
    public double surfaceArea () { return 3*Math.sqrt(25+(10*Math.sqrt(5)))*(edge*edge); }

    /**
     * Get/Set Methods.
     * */
    public void setEdge (double x) { edge = x; }
    public double getEdge () { return edge; }

}