import java.util.*;
class abc
{
    static String longestPalindrome(String s) {
        int best_len=0;
        String best_s="";
        for(int mid=0;mid<s.length();mid++)
        {
            for(int x=0;mid-x>=0 && mid+x<s.length();x++)
            {
                if(s.charAt(mid-x)!=s.charAt(mid+x))
                    break;
                int l=2*x+1;
                if(l>best_len)
                {
                    best_len=l;
                    best_s=s.substring(mid-x,mid-x+l);
                }
            }
        }
        for(int mid=0;mid<s.length()-1;mid++)
        {
            for(int x=1;mid-x+1>=0 && mid+x<s.length();x++)
            {
                if(s.charAt(mid-x+1)!=s.charAt(mid+x))
                    break;
                int l=2*x;
                if(l>best_len)
                {
                    best_len=l;
                    best_s=s.substring(mid-x+1,mid-x+1+l);
                }
            }
        }
        return best_s;
        
    }
    public static void main(String[] args) {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input String");
        input=sc.next();
        System.out.println(longestPalindrome(input));
        sc.close();
    }
}