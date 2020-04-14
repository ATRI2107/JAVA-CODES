import java.util.*;
class abc
{
    static void stockSpan(int[] a,int n)
    {
        Stack<Integer> st=new Stack<>();
        int count;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && a[st.peek()]<=a[i])
            {
                st.pop();
            }
            count=st.isEmpty()?i+1:i-st.peek();
            System.out.print(count+" ");
            st.push(i);
        }
        
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
        stockSpan(a,n);
    }
}