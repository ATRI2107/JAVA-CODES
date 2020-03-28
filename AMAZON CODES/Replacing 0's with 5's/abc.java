import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int c=0,s=0;
        for(int i=n;i>0;i/=10)
        {
            if(i%10==0)
            {
                s+=5*(int)(Math.pow(10,c));
            }
            c++;
        }
        System.out.println(s+n);
        sc.close();
    }
}