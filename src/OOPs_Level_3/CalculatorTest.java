package OOPs_Level_3;

abstract class Calculator {

    // Abstract methods for calculator operations
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract double divide(int a, int b);
}


class BasicCalculator extends Calculator
{
    @Override
    int add(int a, int b)
    {
        return a + b;
    }

    @Override
    int subtract(int a, int b)
    {
        return a - b;
    }

    @Override
    int multiply(int a, int b)
    {
        return a * b;
    }

    @Override
    double divide(int a, int b)
    {
        // Check to prevent division by zero
        if (b == 0)
        {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return "Not a Number"
        }
        return (double) a / b;
    }
}


public class CalculatorTest {
        public static void main(String[] args)
        {
            // Create an object of the child class
            BasicCalculator calculator = new BasicCalculator();

            // Test the calculator methods
            System.out.println("Addition: " + calculator.add(10, 5));
            System.out.println("Subtraction: " + calculator.subtract(10, 5));
            System.out.println("Multiplication: " + calculator.multiply(10, 5));
            System.out.println("Division: " + calculator.divide(10, 5));
            System.out.println("Division by zero: " + calculator.divide(10, 0));
        }
}
