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
    boolean palin(Node head)
    {
        if(head==null) return true;
        if(head.next==null) return true;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null && fast.next==null)
        {
            int check=0;
            Node prev=null,curr=head;
            while(curr!=slow)
            {
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node h1=prev;
            Node h2=curr.next;
            while(h1!=null && h2!=null)
            {
                if(h1.data==h2.data) check=1;
                else
                {
                    check=0;
                    break;
                }
                h1=h1.next;
                h2=h2.next;
            }
            return check==1;
        }
        else
        {
            int check=0;
            Node prev=null,curr=head;
            while(curr!=slow)
            {
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node h1=prev;
            Node h2=curr;
            while(h1!=null && h2!=null)
            {
                if(h1.data==h2.data) check=1;
                else
                {
                    check=0;
                    break;
                }
                h1=h1.next;
                h2=h2.next;
            }
            return check==1;
        }
    }
}
class abc
{
    public static void main(String[] args) {
        List list=new List();
        list.insertEnd(1);
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(1);
        list.insertEnd(1);
        System.out.println(list.palin(list.head));
    }
}