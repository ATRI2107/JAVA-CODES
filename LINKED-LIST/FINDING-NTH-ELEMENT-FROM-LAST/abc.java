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
    void displayNfromlast(int n)
    {
        if(head==null) return;
        Node second=head;
        Node first=head;
        for(int i=0;i<n;i++)
        {
            if(first==null) return;
            first=first.next;
        }
        while(first!=null)
        {
            second=second.next;
            first=first.next;
        }
        System.out.println(second.data);
    }
}
class abc
{
    public static void main(String[] args) {
        List list=new List();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(50);
        list.insertEnd(60);
        list.displayNfromlast(2);
        
    }
}