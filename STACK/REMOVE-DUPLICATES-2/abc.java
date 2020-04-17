import java.util.*;
class Pair{
    char ch;
    int freq;
    Pair(char c,int f)
    {
        ch=c;
        freq=f;
    }
}
class abc
{
    static String remDupli(String s,int k)
    {
        Stack<Pair> st=new Stack<>();
        for(char x:s.toCharArray())
        {
            if(!st.isEmpty() && st.peek().ch==x)
            {
                st.peek().freq++;
            }
            else
            st.push(new Pair(x, 1));
            if(st.peek().freq==k)
            {
                st.pop();
            }
        }
        String res="";
        while(!st.isEmpty())
        {
            Pair x=st.pop();
            for(int i=0;i<x.freq;i++)
            {
                res=x.ch+res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s;
        int k;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        k=sc.nextInt();
        System.out.println(remDupli(s,k));
        sc.close();
    }
}