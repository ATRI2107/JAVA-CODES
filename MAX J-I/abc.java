import java.util.*;
class abc
{
    public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the elements of the array");
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      int lmin[]=new int[n];
      int rmax[]=new int[n];
      lmin[0]=arr[0];
      for(int i=1;i<n;i++)
      {
          lmin[i]=Math.min(lmin[i-1],arr[i]);
      }
      rmax[n-1]=arr[n-1];
      for(int i=n-2;i>=0;i--)
      {
          rmax[i]=Math.max(rmax[i+1],arr[i]);
      }
      int maxDiff=Integer.MIN_VALUE;
      int i=0,j=0;
      while(i<n && j<n)
      {
          if(rmax[j]>lmin[i])
          {
              maxDiff=Math.max(maxDiff,j-i);
              j++;
          }
          else
          i++;
      }
      System.out.println(maxDiff);
      sc.close();  
    }
}