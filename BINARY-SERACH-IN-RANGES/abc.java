import java.util.*;
public class abc
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
        int q=sc.nextInt();
        int b[]=new int[q];
        for(int i=0;i<q;i++)
        {
            b[i]=sc.nextInt();
        }
        int c1[]=new int[n];
        int c2[]=new int[n];
        c1[0]=a[0];
        c2[0]=1;
        for(int i=1;i<n;i++)
        {
            c1[i]=c1[i-1]+a[i];
            c2[i]=c2[i-1]+a[i-1];
        }
        for(int i=0;i<q;i++)
        {
            int low=0,high=n-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(b[i]>=c2[mid] && b[i]<=c1[mid])
                {
                    System.out.println(mid+1);
                    break;
                }
                else if(b[i]>c1[mid])
                low=mid+1;
                else if(b[i]<c2[mid])
                high=mid-1;
            }
        }
        
        sc.close();
    }
}