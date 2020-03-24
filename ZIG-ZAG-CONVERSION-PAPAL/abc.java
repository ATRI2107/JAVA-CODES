import java.util.*;
class abc
{
    static String zigzag(String s,int numRows)
    {
        if(numRows==1)
            {
                return s;
            }
            ArrayList<String> al=new ArrayList<>();
            int i=0,k;
            String t;
            while(i<s.length())
            {
                if(i%(numRows-1)==0)
                {
                    al.add(s.substring(i,Math.min(s.length(),i+numRows)));
                    i+=numRows;
                }
                else
                {
                    k=i%(numRows-1);
                    t=String.valueOf(s.charAt(i));
                    for(int a=0;a<k;a++)
                    {
                      t+="*";  
                    }
                    for(int a=0;a<numRows-k-1;a++)
                    {
                        t="*"+t;
                    }
                    al.add(t);
                    i++;
                }
            }
            
            int y=al.get(al.size()-1).length();
            if(numRows>y)
            {
                String x=String.valueOf(al.get(al.size()-1));
                for(int a=0;a<numRows-y;a++)
                {
                    x+="*";
                }
                al.set(al.size()-1,x);
                
            }
        String result="";
        for(int j=0;j<numRows;j++)
        {
            for(int q=0;q<al.size();q++)
            {
                result+=(al.get(q).charAt(j)!='*')?String.valueOf(al.get(q).charAt(j)):"";
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        String s;
        int numRows;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.next();
        System.out.println("Enter the number of rows");
        numRows=sc.nextInt();
        System.out.println("Zig Zag Conversion is: "+zigzag(s,numRows));
        sc.close();
    }
}