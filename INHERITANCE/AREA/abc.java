class Rectangle
{
    private int width;
    protected int depth;
    
    int getWidth() // a default method of the class accessing the private memeber width of class
    {
        return width;
    } 

    protected void setWidth(int w) // a protected method of the class accessing the private memeber width of class
    {
        width=w;
    }
}

class Box extends Rectangle{
    private int height;

    public void setHeight(int h) // using public method to access the private height member
    {
        height=h;
    }

    int boxArea()
    {
        int ar,w;
        // ar= width * height Error: width has private access
        
        w=getWidth(); //inherited the default method to access the private field width
        
        ar=w*depth; // depth is protected member of the Rectangle class hence accessible
        
        return ar;
    }

    int boxVol()
    {
        int v=boxArea()*height;
        return v;
    }
}
class abc // main class
{
 public static void main(String[] args) {
      Box obj=new Box(); // Object of sub class
      
      obj.setWidth(15); //invoking protected inherited method to access the private field
      obj.depth=10;     // accessing inherited protected field
      obj.setHeight(12);

      System.out.println("Area= "+obj.boxArea());
      System.out.println("Volume= "+obj.boxVol());
 }
}