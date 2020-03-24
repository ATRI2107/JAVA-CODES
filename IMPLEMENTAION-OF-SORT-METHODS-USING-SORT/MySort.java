import java.awt.Point;
import java.util.Comparator;

class MySort implements Comparator<Point>
{
    public int compare(Point a,Point b)
    {
        return a.x-b.x;
    }
}