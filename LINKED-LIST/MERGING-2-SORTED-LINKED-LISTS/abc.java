class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
    }
}
class LinkedList
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
    static Node merge(Node head1,Node head2)
    {
        if(head1==null)
        return head2;
        if(head2==null)
        return head1;
        if(head1.data<head2.data)
        {
            head1.next=merge(head1.next, head2);
            return head1;
        }
        else
        {
            head2.next=merge(head1, head2.next);
            return head2;
        }
    }
    static void display(Node start)
    {
        for(Node curr=start;curr!=null;curr=curr.next)
        {
            System.out.print(curr.data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList A=new LinkedList();
        LinkedList B=new LinkedList();
        
        A.insertEnd(10);
        A.insertEnd(20);
        A.insertEnd(30);

        B.insertEnd(2);
        B.insertEnd(3);
        B.insertEnd(4);
        
        display(merge(A.head,B.head));
    }
}

    
