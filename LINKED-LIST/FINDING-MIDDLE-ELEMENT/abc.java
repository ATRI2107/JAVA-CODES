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
    void insertEnd(int x)
    {
        Node temp=new Node(x);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            Node curr=head;
            while(curr.next!=null) curr=curr.next;
            curr.next=temp;
        }
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
    void displayMidlle()
    {
        if(head==null)
        {
            System.out.println();
        }
        else
        {
            Node fast=head,slow=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.print(slow.data);
        
        }
        
    }
}
class abc
{
    public static void main(String[] args) {
        List list=new List();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        
        list.display();
        list.displayMidlle();
    }
}