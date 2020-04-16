import java.util.*;
class abc
{
    static int scoreOfParent(String S)
    {
        Stack<Integer> st=new Stack<>();
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
            {
                st.push(count);
                count=0;
            }
            else
            {
                count=st.pop()+Math.max(2*count,1);
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(scoreOfParent(s));
    }
}
/*
Input: "()"
Output: 1
Input: "(()(()))"
Output: 6
*/