import java.util.*;
class abc
{
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.next();
        char a[]=s.toCharArray();
        String res="";
        int curr=0;
        for(char ch:a)
        {
            int x=ch-'0';
            while(curr<x)
            {
                res+="(";
                curr++;
            }
            while(curr>x)
            {
                res+=")";
                curr--;
            }
            res+=String.valueOf(ch);
        }
        while(curr>0)
        {
            res+=")";
            curr--;
        }
        System.out.println(res);
        sc.close();
    }
}