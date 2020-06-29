import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int f[]=new int[n];
        int b[]=new int[n];
        f[0]=arr[0];
        int curr_max=arr[0],max_so_far=arr[0];
        for(int i=1;i<n;i++)
        {
            curr_max=Math.max(arr[i],curr_max+arr[i]);
            max_so_far=Math.max(max_so_far,curr_max);
            f[i]=curr_max;
        }
        b[n-1]=arr[n-1];
        curr_max=arr[n-1];
        max_so_far=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            curr_max=Math.max(arr[i],curr_max+arr[i]);
            max_so_far=Math.max(max_so_far,curr_max);
            b[i]=curr_max;
        }
        int res=max_so_far;
        for(int i=1;i<n-1;i++)
        {
            res=Math.max(res,f[i-1]+b[i+1]);
        }
        System.out.println(res);
    }
}