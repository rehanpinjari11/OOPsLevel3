package OOPs_Level_3;

import java.util.Scanner;

interface Shape{

    void input();
    void area();
}

class Circle implements Shape{
    double radius;

    @Override
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");
        radius = sc.nextDouble();
    }

    @Override
    public void area()
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}

class Rectangle implements Shape{

    double length;
    double breadth;

    @Override
    public void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Rectangle:");
        length = sc.nextDouble();

        System.out.println("Enter the breadth of the Rectangle:");
        breadth = sc.nextDouble();
    }

    @Override
    public void area()
    {
        double area = length * breadth;
        System.out.println("Area of the Rectangle: " + area);
    }
}


public class ShapeDemo {

    public static void main(String[] args)
    {
        Shape circle = new Circle();
        circle.input();
        circle.area();

        Shape rectangle = new Rectangle();
        rectangle.input();
        rectangle.area();

    }
}
