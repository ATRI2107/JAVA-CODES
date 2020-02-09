import java.util.*;
class rod
{
    static int countMaxPieces(int n,int a,int b,int c)
    {
        if(n==0) return 0;
        if(n<0) return -1;
        int rec=Math.max(Math.max(countMaxPieces(n-a, a, b, c),countMaxPieces(n-b, a, b, c)),countMaxPieces(n-c, a, b, c));
        if(rec==-1) return -1;
        return 1+rec;
    }
    public static void main(String[] args) {
        int n,a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n, a, b and c");
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();;
        c=sc.nextInt();
        System.out.println(countMaxPieces(n,a,b,c));
    }
}