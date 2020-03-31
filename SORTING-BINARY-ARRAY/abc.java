import java.util.*;
class abc
{
    static void binSort(int arr[], int n)
    {
       int l=0,r=n-1;
       while(l<r)
       {
           while(arr[l]==0 && l<r)
           l++;
           while(arr[r]==1 && l<r)
           r--;
           if(l<r)
           {
               arr[l]=0;
               arr[r]=1;
               l++;
               r--;
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
        binSort(a, n);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
