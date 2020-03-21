import java.util.*;
class abc
{
    static int rotatedsearch(int arr[],int n,int target)
    {
        if(arr==null || arr.length==0) return -1;
        int left=0,right=n-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right])
            left=mid+1;
            else
            right=mid;
        }
        int start=left;
        left=0;
        right=n-1;
        if(target>=arr[start] && target<=arr[right])
        left=start;
        else
        right=start;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            return mid;
            else if(target>arr[mid])
            left=mid+1;
            else
            right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n,target;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        n=sc.nextInt();
        System.out.println("Enetr the target element");
        target=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(rotatedsearch(a,n,target));
        sc.close();
    }
}