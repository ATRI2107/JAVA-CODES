import java.util.*;
class abc
{
    static String minumber(String n,int k)
    {
        if(n.length()==k)
        return "0";
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<n.length())
        {
            while(k>0 && !st.isEmpty() && st.peek()>n.charAt(i))
            {
                st.pop();
                k--;
            }
            st.push(n.charAt(i));
            i++;
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
        StringBuilder bl=new StringBuilder();
        while(!st.isEmpty())
        {
            bl.append(String.valueOf(st.pop()));
        }
        return String.valueOf(bl.reverse());
    }
    public static void main(String[] args) {
        String n;
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number and the no. of digits to be removed");
        n=sc.next();
        k=sc.nextInt();
        System.out.println(minumber(n,k));
        sc.close();
    }
}