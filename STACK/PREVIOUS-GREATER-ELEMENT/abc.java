import java.util.*;
class abc
{
    static void preGreat(int a[],int n)
    {
        Stack<Integer> st=new Stack<>();
        st.push(a[0]);
        System.out.print("-1 ");
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && st.peek()<=a[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                System.out.print("-1 ");
            }
            else
            {
                System.out.print(st.peek()+" ");
            }
            st.push(a[i]);
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
        preGreat(a,n);
    }
}