import java.util.*;

class abc
{
    static int pre(char ch)
    {
        if(ch=='^') return 3;
        else if(ch=='*' || ch=='/') return 2;
        else if(ch=='+' || ch=='-') return 1;
        else return -1;
    }
    static String infixToPostfix(String s)
    {
        String res="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(Character.isLetterOrDigit(x)) 
                res+=x;
            else if(x=='(') 
                st.push(x);
            else if(x==')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                {
                    res+=st.pop();
                }
                if(!st.isEmpty() && st.peek()!='(')
                return "Invalid Expression";
                else
                st.pop();
            }
            else
            {
                while(!st.isEmpty() && pre(st.peek())>=pre(x))
                {
                    if(st.peek()=='(') return "Invalid Expression";
                    res+=st.pop();
                }
                st.push(x);
            }
        }
        while(!st.isEmpty())
        {
            if(st.peek()=='(') return "Invalid Expression";
            res+=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(infixToPostfix(s));
    }
}