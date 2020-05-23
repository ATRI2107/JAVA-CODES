class Base
{
    int x;
    Base(int x)
    {
        this.x=x;
    }

    void display()
    {
        System.out.println("Super variable x= "+x);
    }
}
class Derived extends Base
{
    int y;

    Derived(int x,int y)
    {
        super(x);
        this.y=y;
    }

    void display()
    {
        super.display();
        System.out.println("Sub variable y= "+y);
    }
}
class abc
{
    public static void main(String[] args) {
        
        Derived obj=new Derived(10,20);
        obj.display();
    }
}