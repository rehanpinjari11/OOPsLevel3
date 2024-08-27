package OOPs_Level_3;

public class OuterClass {

    // Static inner class
    static class InnerClass
    {
        // Non-static method in the static inner class
        void show()
        {
            System.out.println("Inside the static inner class's show() method.");
        }
    }

    public static void main(String[] args)
    {
        // Creating an object of the static inner class
        OuterClass.InnerClass innerObject = new OuterClass.InnerClass();

        // Calling the non-static method using the inner class object
        innerObject.show();

        // Trying to call the method using an outer class object is not possible directly
        // as the method belongs to the inner class and is not static.
        // OuterClass outerObject = new OuterClass();
        // outerObject.show(); // This would give a compilation error

        // The correct way is to use the inner class object as shown above.
    }
}
