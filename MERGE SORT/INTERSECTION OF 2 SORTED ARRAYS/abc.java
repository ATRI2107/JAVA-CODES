import java.util.*;
class abc
{
    static void intersection(int arr1[], int arr2[], int n, int m) 
    {
        int i=0,j=0;
        boolean check=false;
        while(i<n && j<m)
        {
            if(i!=0 && arr1[i-1]==arr1[i])
            {
                i++;
                continue;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else if(arr2[j]>arr1[i])
            {
                i++;
            }
            else
            {
                check=true;
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
        if(!check)
        System.out.print(-1);
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
        intersection(a,b,n,m);
        sc.close();
    }
}