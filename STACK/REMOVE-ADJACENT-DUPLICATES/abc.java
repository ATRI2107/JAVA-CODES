import java.util.*;
class abc
{
    static void adjDupli(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.isEmpty() && st.peek()==s.charAt(i))
            st.pop();
            else
            st.push(s.charAt(i));
        }
        String res="";
        while(!st.isEmpty())
        {
            res=st.pop()+res;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        adjDupli(s);
        sc.close();
    }
}