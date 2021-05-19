// @author L. Renee Davis Townsend
// I pledge my word of honor that I have abided
// by the CSN Academic Integrity Policy while completing
// this assignment.
// @file LatashaDavisTownsendcit130_pa8b.java
// @version The date as 2021-04-05
// @brief This is a program to practice with the basic concepts of OOP
// using the Class Pool: The class should have private instance fields
// to store the shape of a pool (oval, rectangular, etc.), length (in feet),
// width (in feet), depth (in feet), area (in square feet) and the volume
// (in cubic feet) of the pool. Also includes the following methods:
// display (displays output), (isNumeric/convertStringToInt)checks for valid int
// @note 4 hour 28 minutes taken to develop, write, test and debug
// solution.

public class latashaDavisTownsendPool {

    // purpose: creates Pool class with attributes
    // returns: none
    // parameters: one
    public static class Pool {
        // declare variables for shapes and dimensions
        private String shape;
        private double length;
        private double width;
        private double depth;
        private double area;
        private double volume;

        // purpose: no-arg constructor that sets all vals to 1 and shape to square
        // returns: none
        // parameters: none
        Pool() {
            shape = "Square";
            length = 1;
            width = 1;
            depth = 1;
            area = length * width;
            volume = length * width * depth;
        }

        // purpose: constructor that defines the dimensions and shapes
        // returns: none
        // parameters: String newShape; double newLength; double newWidth; double newDepth
        Pool(String newShape, double newLength, double newWidth, double newDepth) {
            shape = newShape;
            length = newLength;
            width = newWidth;
            depth = newDepth;
            setVolume();
            setArea();
        }

        // purpose: method that sets the shape
        // returns: void
        // parameters: String newShape
        public void setShape(String newShape) {

            shape = newShape;
        }

        // purpose: method that sets the length
        // returns: void
        // parameters: double newLength
        public void setLength(double newLength) {

            length = newLength;
        }

        // purpose: method that sets the width
        // returns: void
        // parameters: double newWidth
        public void setWidth(double newWidth) {

            width = newWidth;
        }

        // purpose: method that sets the depth
        // returns: void
        // parameters: double newDepth
        public void setDepth(double newDepth) {

            depth = newDepth;
        }

        // purpose: method that sets the area
        // returns: void
        // parameters: void
        public void setArea() {

            area = length * width;
        }

        // purpose: method that sets the volume
        // returns: void
        // parameters: void
        public void setVolume() {

            volume = length * width * depth;
        }

        // purpose: method that gets the shape
        // returns: String shape
        // parameters: void
        public String getShape() {

            return shape;
        }

        // purpose: method that gets the length
        // returns: double length
        // parameters: void
        public double getLength() {

            return length;
        }

        // purpose: method that gets the width
        // returns: double width
        // parameters: void
        public double getWidth() {

            return width;
        }

        // purpose: method that gets the depth
        // returns: double depth
        // parameters: void
        public double getDepth() {

            return depth;
        }

        // purpose: method that gets the area
        // returns: double area
        // parameters: void
        public double getArea() {

            return area;
        }

        // purpose: method that gets the volume
        // returns: double
        // parameters: void
        public double getVolume() {

            return volume;
        }

        // purpose: display the values of an object
        // parameters: void
        // returns: String
        public String toString() {
            return "The shape of the pool is a " + shape + "\n" +
                    "The length of the pool is " + length + " feet\n" +
                    "The width of the pool is " + width + " feet\n" +
                    "The depth of the pool is " + depth + " feet\n" +
                    "The area of the pool is " + area + " square feet\n" +
                    "The volume of the pool is " + volume +" cubic feet \n";
        }

        // purpose: displays the dimensions of the pool from an array
        // parameters: void
        // returns: void
        public void display(){
            System.out.println("The shape of the pool is a " + shape);
            System.out.println("The length of the pool is " + length + " feet");
            System.out.println("The width of the pool is " + width + " feet");
            System.out.println("The depth of the pool is " + depth + " feet");
            System.out.println("The area of the pool is " + area + " square feet");
            System.out.println("The volume of the pool is " + volume + " cubic feet");
        }
    }
}