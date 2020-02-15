import java.util.*;
class digiroot
{
    static int droot(int n)
    {
        if(n<10) return n;
        return droot(n-9);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.println("Digital Root of "+n+" is:"+droot(n));
        sc.close();
    }
}