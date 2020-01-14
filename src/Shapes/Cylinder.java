package Shapes;

public class Cylinder {

    public double height;
    public double radius;

    /**
     * Default constructor for Cylinder class.
     * The length of height & radius is set to 1 by default.
     * */
    public Cylinder () {
        height = 1;
        radius = 1;
    }

    /**
     * Constructor for handling user-defined measurements.
     * Also checks to see if any of the supplied dimensions is negative.
     *
     * @param r Radius of the Cylinder.
     * @param h Height of the cylinder.
     * */
    public Cylinder (double r, double h) throws IllegalArgumentException {
        height = h;
        radius = r;
        if (h < 0 || r < 0) throw new IllegalArgumentException("Dimensions of Cylinder cannot be negative.");
    }

    /**
     * .volume() - calculates the volume of the Cylinder by doing pi*r^2*h.
     *
     * @return The Volume of the Cylinder.
     * */
    public double Volume () { return Math.PI*(radius*radius)*height; }

    /**
     * .lateralSurfaceArea() - calculates the lateral surface area of a cylinder, which
     *                         which is the SA of the curved outside.
     *                         The formula is 2*pi*r*h.
     *
     * @return The Lateral Surface Area of the Cylinder.
     * */
    public double lateralSurfaceArea () { return 2*Math.PI*radius*height; }

    /**
     * .BaseHeightSurfaceArea() - calculates the Base height surface area of a cylinder, which
     *                            which is the SA of the top and bottom circles.
     *                            The formula is 2*pi*r*h.
     *
     * @return The Lateral Surface Area of the Cylinder.
     * */
    public double BaseHeightSurfaceArea () { return 2 * (Math.PI*radius*radius); }

    /**
     * .totalSurfaceArea() - Calculates total surface area which is the sum of the
     *                       Lateral Surface Area and the SA of the Base and height circles.
     *
     * @return the Total Surface Area of the Cylinder
     * */
    public double totalSurfaceArea () { return lateralSurfaceArea() + BaseHeightSurfaceArea(); }

    /**
     * Get/Set Methods
     * */
    public void setHeight (double x) { this.height = x; }
    public void setRadius (double x) { this.radius = x; }

    public double getHeight () { return height; }
    public double getRadius () { return radius; }

}
