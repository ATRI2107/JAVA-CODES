class Base
{
    int ctr;
    void factorial()
    {
        int fact=1;
        for(int i=ctr;i>0;i--)
        {
            fact*=i;
        }
        System.out.println("Factorial= "+fact);
    }
}
class Derived extends Base
{
    void setCtr(int n)
    {
        ctr=n;
    }
}
class abc // main class for execution
{
    public static void main(String[] args) {
        Derived obj=new Derived();
        obj.setCtr(5); // assigns 5 to ctr
        obj.factorial();
    }
}