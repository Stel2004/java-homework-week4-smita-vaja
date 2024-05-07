package java_homework_week4.programme20_poolarea;

/**
 * 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name
 * width and length both of type double.
 * The class needs to have one constructor with parameters width and length both of type double and it
 * needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 * In case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getWidth without any parameters, it needs to return the value of the width
 * field.
 * ● Method named getLength without any parameters, it needs to return the value of the length
 * field.
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (width * length).
 */
public class Rectangle {

    // Instance variable
    double width;
    double length;

    // Declared parameterised constructor
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // Declared instance method to get the width
    public double getWidth() {
        return width;
    }

    // Declared instance method to get the length
    public double getLength() {
        return length;
    }

    // Declared instance method to get the area
    public double getArea() {
        return width * length;
    }
}
