import java.util.*;
class abc
{
    static int subArraySum(int arr[], int n, int sum)
    {
        int c=0,s=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr)
        {
            s+=i;
            if(s==sum) c++;
            if(hm.containsKey(s-sum)) c+=hm.get(s-sum);
            if(hm.containsKey(s)) 
            hm.put(s,hm.get(s)+1);
            else
            hm.put(s,1);
        }
        return c;
    }
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            int sum=sc.nextInt();
            System.out.println(subArraySum(a,n,sum));
        }
        sc.close();
    }
}