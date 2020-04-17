import java.util.*;
class abc
{
    static String entityParser(String text) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("quot","\"");
        hm.put("apos","\'");
        hm.put("amp","&");
        hm.put("gt",">");
        hm.put("lt","<");
        hm.put("frasl","/");
        String res="";
        Stack<Character> st=new Stack<>();
        for(char ch:text.toCharArray())
        {
            
            if(ch==';')
            {
                String temp="",temp1="";
                while(!st.isEmpty() && st.peek()!='&')
                {
                    temp=st.pop()+temp;
                }
                if(!st.isEmpty() && st.peek()=='&')
                {
                    st.pop();
                    temp=(hm.containsKey(temp))?hm.get(temp):("&"+temp+";");
                }
                else
                {
                    temp+=";";
                }
                
                while(!st.isEmpty())
                {
                    temp1=st.pop()+temp1;
                }
                res+=temp1+temp;
        
            }
            else
            st.push(ch);
            
        }
        String temp="";
        while(!st.isEmpty())
        {
            temp=st.pop()+temp;
        }
        return res+temp;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        System.out.println(entityParser(s));
        sc.close();
    }
}