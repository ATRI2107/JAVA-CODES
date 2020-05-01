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
    int length(Node head)
    {
        if(head==null) return 0;
        return (1+length(head.next));
    }
    Node add(Node head1,Node head2,int d)
    {
        if(head1==null) return head1;
        if(d==0)
        {
            head1.data=head1.data+head2.data;
            head1.next=add(head1.next, head2.next, 0);
        }
        else
        head1.next=add(head1.next,head2,d-1);

        if(head1.next!=null && head1.next.data>9)
        {
            head1.data+=1;
            head1.next.data%=10;
        }
        return head1;
    }
     Node addList(Node head1,Node head2)
    {
        int l1=length(head1),l2=length(head2);
        Node res;
        if(l1>=l2) res=add(head1,head2,l1-l2);
        else res=add(head2,head1,l2-l1);
        if(res.data>9)
        {
            Node head=new Node(1);
            res.data%=10;
            head.next=res;
            return head;
        }
        return res;
    }
     void display(Node head)
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
        List list1=new List();
        List list2=new List();
        List res=new List();
        list1.insertEnd(7);
        list1.insertEnd(2);
        list1.insertEnd(4);
        list1.insertEnd(3);

        list2.insertEnd(9); 
        
        Node rest_head=res.addList(list1.head, list2.head);
        res.display(rest_head);
    }
}