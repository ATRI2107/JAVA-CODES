import java.util.*;
class abc
{
    static int subarraylarge(int[] a,int n,int sum)
    {
        int s=0,res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            s+=a[i];
            if(s==sum) res=i+1;
            if(!hm.containsKey(s)) hm.put(s,i);
            if(hm.containsKey(s-sum)) res=Math.max(res, i-hm.get(s-sum));
        }
        return res;
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
            System.out.println(subarraylarge(a,n,sum));
        }
    }
}