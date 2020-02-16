import java.util.*;
class phonestring
{
    static void possibleWords(int a[], int N)
    {
        String c[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String cx[]=new String[N];
        for(int i=0;i<N;i++)
        {
            cx[i]=c[a[i]];
        }
        sent(cx,N,0,"");
    }
    static void sent(String cx[],int N,int i,String res)
    {
        if(i==N) 
        {
            System.out.print(res+" ");
            return;
        }
        for(int k=0;k<cx[i].length();k++)
        {
            sent(cx,N,i+1,res+cx[i].charAt(k));
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the phone digits");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        possibleWords(a, n);
    }
}