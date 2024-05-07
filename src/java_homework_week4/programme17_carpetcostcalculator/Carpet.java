package java_homework_week4.programme17_carpetcostcalculator;

/**
 * 2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double.
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getCost without any parameters, it needs to return the value of cost field
 */
public class Carpet {
    // instance variable
    double cost;

    // Constructor with parameter
    public Carpet(double cost) {
        this.cost = cost;
        if (cost < 0) {
            System.out.println(0);
        }
    }

    // Declared instance method
    public double getCost() {
        return cost;
    }
}
