import java.util.*;
class redparent{
    static boolean redundant(String s)
    {
        char top;
        boolean flag;
        Stack<Character> st=new Stack<>();
        char ch[]=s.toCharArray();
        for(char c:ch)
        {
            if(c==')')
            {
                top=st.peek();
                st.pop();
                flag=true;
                while(top!='(')
                {
                    if(top=='+' || top=='-' || top=='*' || top=='/')
                    {
                        flag=false;
                    }
                    top=st.peek();
                    st.pop();
                }
                if(flag) return flag;
            }
            else
            st.push(c);
        }
        return false;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the expression");
        s=sc.next();
        System.out.print(redundant(s)?"Yes":"No");
    }
}