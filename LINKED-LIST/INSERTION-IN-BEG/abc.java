class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
    }
}
class List
{
    Node head;
    void insertBeg(int x)
    {
        Node temp=new Node(x);
        temp.next=head;
        head=temp;        
    }
    void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
public class abc
{
    public static void main(String[] args) {
        List list=new List();
        list.insertBeg(10);
        list.insertBeg(20);
        list.insertBeg(30);
        list.display();
    }
}