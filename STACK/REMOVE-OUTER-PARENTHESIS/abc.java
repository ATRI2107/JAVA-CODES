import java.util.*;
class abc
{
    static String removeOuterParentheses(String S) {
        if(S.length()==0) return S;
        String res="";
        Stack<Character> st=new Stack<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
            {
                if(st.isEmpty())
                    al.add(i);
                st.push(S.charAt(i));
                continue;
            }
            if(S.charAt(i)==')' && st.peek()=='(')
            {
                st.pop();
                if(st.isEmpty())
                    al.add(i);
                
            }
        }
        for(int i=0;i<al.size()-1;i++)
        {
            res+=S.substring(al.get(i)+1,al.get(i+1));
        }
        return res;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(removeOuterParentheses(s));
    }
}