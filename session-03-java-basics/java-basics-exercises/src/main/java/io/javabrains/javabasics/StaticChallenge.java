package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */
class Rectangle {
    int width, height;
    static int numOfRectangles = 0;
    int v = 0;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        numOfRectangles++;
        v++;
    }

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return (2 * height) + (2 * width);
    }
}

class StaticChallenge {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(20, 20);
        Rectangle r3 = new Rectangle(30, 10);

        System.out
                .println("The Area of Rectangle r1 is " + r1.getArea() + " and the perimeter is " + r1.getPerimeter());
        System.out
                .println("The Area of Rectangle r2 is " + r2.getArea() + " and the perimeter is " + r2.getPerimeter());
        System.out
                .println("The Area of Rectangle r3 is " + r3.getArea() + " and the perimeter is " + r3.getPerimeter());

        System.out.println("No of Total Rectangles : " + Rectangle.numOfRectangles);
    }
}
