import java.util.*;
class water
{
    static int trappingWater(int arr[], int n) { 
        
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        lmax[0]=arr[0];
        int r=0;
        for(int i=1;i<n;i++)
        {
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(rmax[i+1],arr[i]);
        }
        for(int i=1;i<n-1;i++)
        {
            r+=Math.min(lmax[i],rmax[i])-arr[i];
        }
        return r;
        
    } 
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the sizes of the walls");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(trappingWater(a, n));
        sc.close();
    }
}