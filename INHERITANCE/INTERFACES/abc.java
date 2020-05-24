interface Area
{
    double pi=3.14;
    double calArea(double r);
}

class Circle implements Area
{
    public double calArea(double r) //implementation of abstract method in the interface
    {
        return pi*r*r;
    }
}

class abc
{
    public static void main(String[] args) {
        
        Circle obj=new Circle();
        System.out.println("Circle Area= "+obj.calArea(2.0));
    }
}