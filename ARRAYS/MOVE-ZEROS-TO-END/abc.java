import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int last_zero=0;
        for(int i:a)
        {
            if(i!=0)
            a[last_zero++]=i;
        }
        for(int i=last_zero;i<n;i++)
        {
            a[i]=0;
        }
        for(int i:a)
        {
            System.out.println(i);
        }
    }
}