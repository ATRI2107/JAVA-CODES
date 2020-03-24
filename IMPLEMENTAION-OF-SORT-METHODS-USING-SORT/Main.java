import java.util.*;
import java.awt.Point;
class Main
{
    public static void main(String[] args) {
        ArrayList<Point> al=new ArrayList<Point>();
        al.add(new Point(7,10));
        al.add(new Point(3,12));
        al.add(new Point(5,9));
        Collections.sort(al,new MySort());
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i).x+" "+al.get(i).y);
            System.out.println();
        }
    }
}