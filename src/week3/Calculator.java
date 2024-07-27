package week3;
/*Consider a class that models a simple (non-scientific) calculator that deals only with integers. 
 * Discuss with your colleagues what methods and variables this class might have. 
 * Then write a Java class that would implement it.
	One possible implementation is:
	Variable total
	Method add, subtract, multiply, divide, clear total, print total
*/

public class Calculator {
    // Variable to store the current total
    private int total;

    // Constructor
    public Calculator() {/*this 最常见的用途是引用当前对象的实例变量或方法。
    当方法或构造器的参数名与类的实例变量名相同时，this 可以用来区分它们*/
        this.total = 0;
    }

    // Method to add a value to the total
    public void add(int value) {
        this.total += value;
    }

    // Method to subtract a value from the total
    public void subtract(int value) {
        this.total -= value;
    }

    // Method to multiply the total by a value
    public void multiply(int value) {
        this.total *= value;
    }

    // Method to divide the total by a value
    public void divide(int value) {
        if (value != 0) {
            this.total /= value;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Method to clear the total
    public void clear() {
        this.total = 0;
    }

    // Method to print the current total
    public void printTotal() {
        System.out.println("Total: " + this.total);
    }

    // Main method for testing the Calculator class
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5);
        calc.printTotal(); // Total: 5
        calc.subtract(2);
        calc.printTotal(); // Total: 3
        calc.multiply(4);
        calc.printTotal(); // Total: 12
        calc.divide(3);
        calc.printTotal(); // Total: 4
        calc.clear();
        calc.printTotal(); // Total: 0
    }
}
