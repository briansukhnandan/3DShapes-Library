package Shapes.tests;

import Shapes.Cube;
import Shapes.Cylinder;
import Shapes.Rectangular_Prism;
import Shapes.Triangular_Prism;

public class Main {

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
        System.out.println(s.Volume());
        System.out.println(s.lateralSurfaceArea());
        System.out.println(s.BaseHeightSurfaceArea());
        System.out.println(s.totalSurfaceArea());
    }

    public static void triangularPrismTest() {
        Triangular_Prism x = new Triangular_Prism(4, Math.sqrt(45), 12, false);
        System.out.println("Triangular Prism Test: ");
        System.out.println(x.areaOfFace());
        System.out.println(x.surfaceArea());
    }

    public static void sphereTest() {

    }

    public static void main(String[] args) {

        cubeTest();
        rectangularPrismTest();
        cylinderTest();
        triangularPrismTest();

    }

}

