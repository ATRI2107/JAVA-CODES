import java.util.*;
public class abc {
public static void main(String[] args) {
    int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        int res=0;
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && a[st.peek()]>=a[i])
            {
                int x=st.pop();
                int area=a[x]*(st.isEmpty()?i:(i-st.peek()-1)); 
                res=Math.max(area,res);
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            int x=st.pop();
            int area=a[x]*(st.isEmpty()?n:n-st.peek()-1);
            res=Math.max(area,res);
        }
        System.out.println(res);
}
}