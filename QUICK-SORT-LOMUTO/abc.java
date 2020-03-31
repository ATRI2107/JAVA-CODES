import java.util.*;
class abc
{
    static int partition(int[] arr,int l,int h)
    {
        int pivot=arr[h];
        int i=l-1,t;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        t=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=t;
        return (i+1);
    }
    static void quickSort(int[] arr,int l,int h)
    {
        if(l<h)
        {
            int pivot=partition(arr, l, h);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, h);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}