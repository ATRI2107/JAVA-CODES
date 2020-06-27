import java.util.*;
class Test
{
    int bitonic(int[] a,int n)
    {
        int lis[]=new int[n];
        int lds[]=new int[n];
        for(int i=0;i<n;i++)
        {
            lis[i]=1;
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[i])
                lis[i]=Math.max(lis[i],lis[j]+1);
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            lds[i]=1;
            for(int j=n-1;j>i;j--)
            {
                if(a[j]<a[i])
                lds[i]=Math.max(lds[i],lds[j]+1);
            }
        }
        int res=lds[0]+lis[0]-1;
        for(int i=1;i<n;i++)
        {
            res=Math.max(res,lds[i]+lis[i]-1);
        }
        return res;
    }
}
class abc {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    System.out.println(new Test().bitonic(a,n));
		
	}
}