import java.util.*;

class BinarySearchMethod // Method to sove it in O(nlogn)
{
    int ceil(int[] tail,int b,int e,int x)
    {
        int l=b;
        int r=e;
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(x<=tail[m])
            r=m;
            else
            l=m+1;
        }
        return r;
    }
    int lis(int[] a,int n)
    {
        int tail[]=new int[n];
        tail[0]=a[0];
        int len=1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>tail[len-1])
            {
                tail[len]=a[i];
                len++;
            }
            else
            {
                int c=ceil(tail, 0, len-1, a[i]);
                tail[c]=a[i];
            }
        }
        return len;
    }
}
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
        System.out.println(new BinarySearchMethod().lis(a, n));
        sc.close();
    }
}