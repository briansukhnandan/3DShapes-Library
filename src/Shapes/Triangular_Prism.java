package Shapes;

public class Triangular_Prism {

    public double base, height, length;

    /**
     * Member rightTriangle:
     * When set to true, calculations will be done assuming a right triangle.
     * If false, assumes an isosceles Triangular_Prism.
     * */
    public Boolean rightTriangle;

    /**
     * Default constructor for Triangular Prism class.
     * The length of all side is set to 1 by default.
     * */
    public Triangular_Prism () {
        base = 1;
        height = 1;
        length = 1;
        rightTriangle = false;
    }

    /**
     * Constructor for handling user-defined measurements.
     * Also checks to see if any of the supplied dimensions is negative.
     *
     * @param l Length of the prism.
     * @param b Base of the prism.
     * @param h Height of the prism.
     * */
    public Triangular_Prism (double b, double h, double l, Boolean rT) throws IllegalArgumentException {
        length = l;
        base = b;
        height = h;
        rightTriangle = rT;
        if (length < 0 || base < 0 || height < 0) throw new IllegalArgumentException("One or more of the dimensions cannot be negative.");
    }

    /**
     * .volume() - calculates the volume of the Prism by doing (1/2)*length*base*height.
     *
     * @return The Volume of the Prism.
     * */
    public double Volume () { return (0.5)*length*base*height; }

    /**
     * .areaOfFace() - calculates the area of the face of the prism.
     *
     * @return the Area of the face of the prism (Area of the triangle).
     * */
    public double areaOfFace () { return (0.5)*base*height; }

    /**
     * .permiterOfFace() - Takes the face of the triangle and splits it in half,
     *                     which allows us to find the length of the missing side
     *                     by doing the Pythagorean Theorem, then we can find the
     *                     perimeter of the triangle.
     *
     *                     If we have a right Triangular prism, we will return
     *                     the base + height + the hypotenuse, which is just
     *                     sqrt(base*base + height*height) (Pythagorean Theorem).
     *
     *                     If we don't have a right triangular prism, we will assume
     *                     we have an isosceles Triangular prism, in which case
     *                     the Triangle has 2 equivalent sides, which is the hypotenuse
     *                     formed by half of the base squared + the height squared, and of
     *                     course that sum sqrt() (Pythagorean Theorem again). We then
     *                     take the sum of base + 2*hypotenuse.
     *
     * @return The perimeter of the face of the Prism.
     * */
    public double perimeterOfFace() {
        if (this.rightTriangle) return (Math.sqrt(base*base + height*height) + base + height);
        return (2*(Math.sqrt(((base/2)*(base/2)) + (height*height)))) + base;
    }

    /**
     * .surfaceArea() - If the Triangular Prism is a Right-triangular prism, this
     *                  algorithm takes the area of each face separately and sums it.
     *
     *                  If it is not a right triangular prism, it follows the formula
     *                  (b*h) + (perimeter of face * height)).
     *
     * @return The surface Area of the prism, which will differ whether or not it is
     *         a right triangular prism.
     * */
    public double surfaceArea () {
        if (this.rightTriangle) return (2*areaOfFace()) + (height*length) + (length*base) + (Math.sqrt(base*base + height*height) * length);
        else return (base*height) + (perimeterOfFace() * length);
    }

    /**
     * Get/Set Methods.
     * */
    public void setBase (double x) { base = x; }
    public void setHeight (double x) { height = x; }
    public void setLength (double x) { length = x; }

    public double getBase (double x) { return base; }
    public double getHeight (double x) { return height; }
    public double getLength (double x) { return length; }

}
