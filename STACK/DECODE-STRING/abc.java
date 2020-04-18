import java.util.*;
class abc
{
    static String decodeString(String s)
    {
        Stack<String> st=new Stack<>();
        String res="";
        for(char ch:s.toCharArray())
        {
            if(ch==']')
            {
                String temp="";
                String k="";
                while(!st.isEmpty() && !st.peek().equals("["))
                {
                    temp=st.pop()+temp;
                }
                if(!st.isEmpty() && st.peek().equals("["))
                {
                    st.pop();
                    while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0)))
                    {
                        k=st.pop()+k;
                    }
                }
                    for(int i=0;i<Integer.parseInt(k);i++)
                    {
                        st.push(temp);
                    }
              
            }
            else
                st.push(String.valueOf(ch));
        }
        while(!st.isEmpty())
        {
            res=st.pop()+res;
        }
        return res;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(decodeString(s));
        sc.close();
    }
}
/*
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef"
*/