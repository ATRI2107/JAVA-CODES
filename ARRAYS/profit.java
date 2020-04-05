import java.util.*;
class profit
{
    static void stockBuySell(int price[], int n) {
        String s="",c="";
        for(int i=1;i<n;i++)
        {
            if(price[i]>price[i-1])
            {
                s+=String.valueOf(i);
            }
            
            else if(s.length()!=0)
            {
                c+="("+String.valueOf((int)(s.charAt(0))-48-1)+" "+String.valueOf((int)(s.charAt(s.length()-1))-48)+") ";
                s="";
            }
            
        }
        System.out.println(c.length()!=0?c:"No Profit");
        
    }
    public static void main(String[] args) {
        int price[]={100,180,260,310,40,535,695};
        stockBuySell(price, 7);
    }
}
 
