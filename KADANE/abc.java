import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<>();//To store the max ending sum
        al.add(arr[0]);
        for(int i=1;i<n;i++)
        {
            al.add(Math.max(al.get(i-1)+arr[i],arr[i]));
        }
        System.out.println(Collections.max(al));
    }
}