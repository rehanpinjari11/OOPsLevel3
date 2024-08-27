package OOPs_Level_3;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        calculateArea(length, breadth);
    }

    public static void calculateArea(int length, int breadth)
    {
        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
}

