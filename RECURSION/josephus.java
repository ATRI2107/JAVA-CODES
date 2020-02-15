import java.util.*;
class josephus{
    static int jose(int n,int k)
    {
        if(n==1) return 0;
        return((jose(n-1, k)+k)%n);
    }
    public static void main(String[] args) {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        System.out.print(jose(n,k));
        sc.close();
    }
    
}