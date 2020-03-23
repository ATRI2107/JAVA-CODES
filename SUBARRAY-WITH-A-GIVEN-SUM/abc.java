import java.util.*;
class abc
{
    static void subarraysum(int arr[],int n,int s)
    {
        int i=0,start=0,end=0,curr_sum=0;
        while(i<n)
        {
            if(curr_sum<s)
            {
                curr_sum+=arr[i];
                end=i;
                i++;
            }
            if(curr_sum>s)
            {
                curr_sum-=arr[start++];
            }
            if(curr_sum==s)
            {
                System.out.println((start+1)+" "+(end+1));
                break;
            }
        }
        if(curr_sum!=s)
        {
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        int s,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        subarraysum(arr,n,s);
        sc.close();
    }
}