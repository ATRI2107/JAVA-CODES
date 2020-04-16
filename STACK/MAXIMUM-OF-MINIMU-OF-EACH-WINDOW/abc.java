import java.util.*;
class abc
{
    static void maxmin(int arr[],int n)
    {
        Stack<Integer> st=new Stack<>();
        int left[]=new int[n+1];
        int right[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            left[i]=-1;
            right[i]=n;
        }
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            left[i]=st.peek();
            st.push(i);
        }
        while(!st.isEmpty())
            {
                st.pop();
            }
        for(int i=n-1;i>-1;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            right[i]=st.peek();
            st.push(i);
        }
        int ans[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            ans[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            int len=right[i]-left[i]-1;
            ans[len]=Math.max(arr[i],ans[len]);
        }
        for(int i=n-1;i>0;i--)
        {
            ans[i]=Math.max(ans[i],ans[i+1]);
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(ans[i]+" ");
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
        maxmin(a,n);
    }
}