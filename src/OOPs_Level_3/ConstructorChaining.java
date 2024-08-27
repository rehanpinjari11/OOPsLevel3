package OOPs_Level_3;

public class ConstructorChaining {

    int x;
    int y ;

    // Default constructor
    public ConstructorChaining()
    {
        this(20); // Calling the second constructor with argument 20
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor with one argument
    public ConstructorChaining(int x)
    {
        this.x = x;// Calling the third constructor with x and 0
        System.out.println("Parameterized constructor with one argument called.");

    }

    // Parameterized constructor with two arguments
    public ConstructorChaining(int x, int y)
    {
        this(); // Calling the default constructor
        this.x = x;
        this.y = y;

        System.out.println("Parameterized Constructor with two argument called.");

        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println("Sum of X and Y: " + (this.x + this.y));
    }

    public static void main(String[] args)
    {
        // Creating an instance of ConstructorChaining with arguments 11 and 12
        ConstructorChaining chain = new ConstructorChaining(11, 12);
    }

}


