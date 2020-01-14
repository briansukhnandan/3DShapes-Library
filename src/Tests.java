import Shapes.*;

public class Tests {

    public static void cubeTest() {
        //int x = 100;
        double y = 5.001;
        float z = 3.0f;
        int x = 1;
        Cube s = new Cube(x);
        Cube t = new Cube();
        System.out.println(s.diagonalLength());
        System.out.println(s.surfaceArea());
    }

    public static void rectangularPrismTest() {
        Rectangular_Prism s = new Rectangular_Prism(3.0f, 4.0f, 12);
        System.out.println(s.faceDiagonalLength(s.length, s.width));
        System.out.println(s.diagonalLength());
    }

    public static void cylinderTest() {
        Cylinder s = new Cylinder(5, 4);
        System.out.println();
        System.out.println("Cylinder test");
        System.out.println(s.Volume());
        System.out.println(s.lateralSurfaceArea());
        System.out.println(s.BaseHeightSurfaceArea());
        System.out.println(s.totalSurfaceArea());
    }

    public static void triangularPrismTest() {
        Triangular_Prism x = new Triangular_Prism(4, Math.sqrt(45), 12, false);
        System.out.println();
        System.out.println("Triangular Prism Test: ");
        System.out.println(x.areaOfFace());
        System.out.println(x.surfaceArea());
    }

    public static void sphereTest() {
        Sphere x = new Sphere(5);
        System.out.println();
        System.out.println("Sphere Test: ");
        System.out.println(x.Volume() + " - Volume");
        System.out.println(x.surfaceArea() + " - SA");
    }

    public static void squarePyramidTest() {
        Square_Pyramid x = new Square_Pyramid(6, 4);
        System.out.println();
        System.out.println(x.getSideLength()+" "+x.getHeight());
        System.out.println( (0.25) * (x.side_length*x.side_length) );
        System.out.println("Square_Pyramid Test: ");
        System.out.println(x.slantHeight() + " - Slant Height");
        System.out.println(x.lateralEdgeLength() + " - lateralEdgeLength");
    }


    public static void main(String[] args) {

        cubeTest();
        rectangularPrismTest();
        cylinderTest();
        triangularPrismTest();
        sphereTest();
        squarePyramidTest();

    }

}

