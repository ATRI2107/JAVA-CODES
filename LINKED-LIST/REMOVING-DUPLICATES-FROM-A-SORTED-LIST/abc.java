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
    void removeDup()
    {
        Node curr=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.data==curr.next.data)
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }
    }
    void display()
    {
        for(Node curr=head;curr!=null;curr=curr.next)
        {
            System.out.print(curr.data+" ");
        }
        System.out.println();
    }
}
class abc
{
    public static void main(String[] args) {
        List list=new List();
        list.insertEnd(1);
        list.insertEnd(1);
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(3);
        System.out.println("Without Removal");
        list.display();
        System.out.println("After Removal");
        list.removeDup();
        list.display();
    }
}