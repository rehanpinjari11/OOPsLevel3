package OOPs_Level_3;

    // Super class

class Super {

        String superString;

        // Constructor of the Super class
        Super(String superString)
        {
            this.superString = superString;
            System.out.println("Super class Constructor: " + this.superString);
        }
}

    // Sub class

class Sub extends Super {

    String subString;

        // Constructor of the Sub class

    Sub(String superString, String subString) {
        // Call the constructor of the Super class

        super(superString);
        this.subString = subString;
        System.out.println("Sub class Constructor: " + this.subString);
    }
}

    // Main class to test the program

public class StringConstructorDemo {

    public static void main(String[] args)
    {
        // Create an object of the Sub class
        Sub subObject = new Sub("Hello from Super", "Hello from Sub");
    }
}

