import java.util.*;
class abc
{
    static long smallest_numberk(int n)
    {
        if(n>=0 && n<=9) return n;
        Stack<Integer> st=new Stack<>(); //This stack stores the digits
        for(int i=9;n>1 && i>1;i--)
        {
            while(n%i==0)
            {
                st.push(i);
                n/=i;
            }
            

        }
        if(n!=1) return -1;
        long prod=0;
        while(!st.empty())
        {
            prod=prod*10+st.peek();
            st.pop();
        }
        return prod;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n");
        n=sc.nextInt();
        System.out.println(smallest_numberk(n));
        sc.close();
    }
}