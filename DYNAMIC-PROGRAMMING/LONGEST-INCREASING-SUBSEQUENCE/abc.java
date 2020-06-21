import java.util.*;
class abc
{
    static int lis(int[] a,int n) // Dynamic Programming solution
    {
        int longis[]=new int[n];
        longis[0]=1;
        for(int i=1;i<n;i++)
        {
            longis[i]=1;
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[i])
                longis[i]=Math.max(longis[i],longis[j]+1);
            }
        }
        int res=longis[0];
        for(int i=1;i<n;i++)
        {
            res=Math.max(res,longis[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(lis(a, n));
        sc.close();
    }
}