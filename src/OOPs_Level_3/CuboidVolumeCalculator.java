package OOPs_Level_3;

import java.util.Scanner;

public class CuboidVolumeCalculator {

        // Method to calculate the volume of a cuboid
        public double calculateVolume() {

            Scanner scanner = new Scanner(System.in);

            // Taking input for length, breadth, and height
            System.out.print("Enter the length of the cuboid: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the breadth of the cuboid: ");
            double breadth = scanner.nextDouble();

            System.out.print("Enter the height of the cuboid: ");
            double height = scanner.nextDouble();

            // Calculating volume
            double volume = length * breadth * height;

            // Returning the calculated volume
            return volume;
        }

        public static void main(String[] args)
        {
            // Creating an instance of the class
            CuboidVolumeCalculator calculator = new CuboidVolumeCalculator();

            // Calling the method to calculate volume
            double volume = calculator.calculateVolume();

            // Printing the volume
            System.out.println("The volume of the cuboid is: " + volume);
        }
}
