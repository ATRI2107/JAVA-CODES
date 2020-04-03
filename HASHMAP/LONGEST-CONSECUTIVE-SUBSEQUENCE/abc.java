import java.util.*;
class abc
{
    static int findLongestConseqSubseq(int arr[], int n)
	{
	   HashSet<Integer> hs=new HashSet<>();
	   int res=0;
	   for(int i:arr)
	   {
	       hs.add(i);
	   }
	   for(int i=0;i<n;i++)
	   {
	       if(!hs.contains(arr[i]-1))
	       {
	           int j=arr[i];
	           while(hs.contains(j))
	           j++;
	           
	           res=Math.max(res,j-arr[i]);
	       }
	   }
	   return res;
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
        System.out.println(findLongestConseqSubseq(a, n));
        sc.close();
    }
}