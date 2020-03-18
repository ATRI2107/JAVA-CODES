import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(int i=5;n/i>=1;i*=5)
        {
            count+=Math.floor(n/i);
        }
        System.out.println("Number of trailing zeros= "+count);
        sc.close();
    }
}