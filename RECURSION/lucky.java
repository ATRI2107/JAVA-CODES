import java.util.*;
class lucky
{
    static boolean isLucky(int n,int counter)
    {
        if(counter>n) return true;
        if(n%counter==0) return false;
        return isLucky(n-n/counter,counter+1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.println(isLucky(n,2)?"Yes":"No");
        sc.close();
    }
}