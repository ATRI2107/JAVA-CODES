import java.util.*;
class abc
{
	public static void main(String args[])
	{
		String s;
		int n;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		n=sc.nextInt();
		int r=0;
		for(int i=0;i<s.length();i++)
		{
			r=(r*10+(int)(s.charAt(i))-48)%n;
		}
		System.out.println(r==0?"Divisible":"Not Divisible");
	}
}
