package Shapes;

public class Sphere {

    public double radius;

    /**
     * Default constructor for Sphere class.
     * The length of radius is set to 1 by default.
     * */
    public Sphere() {
        radius = 1;
    }

    /**
     * Constructor for handling user-defined measurements.
     * Also checks to see if any of the supplied dimensions is negative.
     *
     * @param r Radius of the sphere.
     * */
    public Sphere(double r) throws IllegalArgumentException {
        radius = r;
        if (r < 0) throw new IllegalArgumentException("Radius cannot be negative.");
    }

    /**
     * .Volume() - calculates the volume of the Sphere by doing (4/3)*pi*r^3.
     *
     * @return The Volume of the Sphere.
     * */
    public double Volume () { return (4/3)*Math.PI*(radius*radius*radius); }

    /**
     * .Circumference() - Calculates the circumference of a top-down
     *  cross-section of the sphere by doing 2*(pi)*r.
     *
     * @return The circumference of a cross-section the sphere.
     * */
    public double Circumference () { return 2*Math.PI*radius; }

    /**
     * .surfaceArea() - Calculates the Surface Area of a sphere by doing 4*pi*r^2.
     *
     * @return The Surface Area of the Sphere.
     * */
    public double surfaceArea () { return 4*Math.PI*(radius*radius); }

    /**
     * Get/Set methods.
     */
    public double getRadius () { return radius; }
    public void setRadius (double x) { radius = x; }

}
