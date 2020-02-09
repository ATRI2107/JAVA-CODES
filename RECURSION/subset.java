import java.util.*;
class subset{
    static void printSub(String s,String c, int index)
    {
        if(index==s.length())
        {
            System.out.println(c+" ");
            return;
        }
        printSub(s, c+s.charAt(index), index+1);
        printSub(s, c, index+1);
    }

    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.next();
        printSub(s,"",0);
        sc.close();
    }
}