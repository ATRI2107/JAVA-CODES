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
      for(int i=0;i<n;i++)
      {
          arr[i]+=(arr[arr[i]]%n)*n;
      }
      for(int i=0;i<n;i++)
      {
          arr[i]=(int)(arr[i]/n);
      }
      for(int i: arr)
      {
          System.out.print(i+" ");
      }
      sc.close();
    }
}