import java.util.*;
class abc
{
    static void nextGreat(int a[],int n)
    {
        Stack<Integer> st=new Stack<>();
        st.push(a[n-1]);
        int res[]=new int[n];
        res[n-1]=-1;
        for(int i=n-2;i>-1;i--)
        {
            while(!st.isEmpty() && a[i]>=st.peek())
            {
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(a[i]);
        }
        for(int i:res)
        {
            System.out.print(i+" ");
        }
        System.out.println();
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
        nextGreat(a,n);
    }
}