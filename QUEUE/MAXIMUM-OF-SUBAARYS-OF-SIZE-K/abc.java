import java.util.*;
class abc
{
    static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<Integer>();
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=k;i<nums.length;i++)
        {
            al.add(nums[dq.peekFirst()]);
            while(!dq.isEmpty() && dq.peekFirst()<=i-k)
            {
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        al.add(nums[dq.peekFirst()]);
        int res[]=new int[al.size()];
        int j=0;
        for(Integer i:al)
        {
            res[j++]=(Integer)(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int res[]=maxSlidingWindow(a, k);
        for(int i:res)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
    }
}