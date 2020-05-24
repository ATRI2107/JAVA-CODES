abstract class Shape // abstract super class
{
    double ar;
    abstract void area();
}

class Circle extends Shape
{
    double radius;

    Circle(double r)
    {
        radius=r;
    }

    public void area() // abstract method definition version 1
    {
        ar=3.14*radius*radius;
        System.out.println("Circle area= "+ar);
    }
}

class Triangle extends Shape
{
    double base, height;

    Triangle(double b,double h)
    {
        base=b;
        height=h;
    }
    public void area() // abstract method version 2
    {
        ar=0.5*base*height;
        System.out.println("Triangle area= "+ar);
    }
}

class abc
{
    public static void main(String[] args) {
        
        Shape s;

        s=new Circle(2.0); // s refers to Circle object 
        s.area(); // invokes area of Circle class

        s=new Triangle(2.0, 5.0); // s refers to Triangle object
        s.area(); // invokes area of Triangle class
    }
}