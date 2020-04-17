import java.util.*;
class abc
{
    static boolean isValid(String S)
    {
        if(S.equals("abc")) return true;
        Stack<Character> st=new Stack<>();
        int check=0;
        for(char ch:S.toCharArray())
        {
            String test="";
            if(!st.isEmpty() && ((ch=='a' || ch=='b' || ch=='c') && st.peek()=='c'))
            {
                
                for(int i=0;i<3 && !st.isEmpty();i++)
                {
                    test=st.pop()+test;
                }
                if(test.equals("abc")) check=1;
                else
                {
                    check=0;
                    break;
                }
            }
            st.push(ch);
        }
        if(check!=0)
        {
            String test="";
            while(!st.isEmpty())
            {
                test=st.pop()+test;
            }
            return (test.equals("abc"));    
        }
        else
            return false;
      
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(isValid(s));
        sc.close();
    }
}