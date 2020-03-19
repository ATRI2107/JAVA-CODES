import java.util.*;
class majorarray
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
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        System.out.println();
        int major=Collections.max(hm.entrySet(),(entry1,entry2)->entry1.getValue()-entry2.getValue()).getKey();
        System.out.println(Collections.max(hm.values())>(int)(n/2)?major:-1);
    }
}