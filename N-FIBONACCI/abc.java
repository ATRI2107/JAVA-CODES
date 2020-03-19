import java.util.*;
class abc
{
public static void main(String[] args) {
    int n,m,s=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n and m");
    n=sc.nextInt();
    m=sc.nextInt();
    int a[]=new int[m];
    for(int i=0;i<m;i++)
    {
        a[i]=0;
    }
    a[n-1]=1;
    a[n]=1;
    s=2;
    for(int i=n+1;i<m;i++)
    {
        a[i]=s-a[i-n-1];
        s+=a[i]-a[i-n-1];
    }
    for(int i=0;i<m;i++)
    {
        System.out.print(a[i]+" ");
    }
    sc.close();
}
}