import java.util.*;
class abc
{
    static void swap(int[] a,int i,int j)
    {
        int t;
        t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    static void dutch(int[] a,int n)
    {
        int l=0,mid=0,h=n-1;
        while(mid<=h)
        {
            switch(a[mid])
            {
                case 0:
                    swap(a, l, mid);
                    l++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(a, mid, h);
                    h--;
                    break;
            }
        }
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
        dutch(a,n);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}