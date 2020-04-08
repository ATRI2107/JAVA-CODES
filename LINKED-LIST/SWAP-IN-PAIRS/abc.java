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
    void swapPair()
    {
        if(head==null || head.next==null) return;
        Node curr=head.next.next;
        Node prev=head;
        head=head.next;
        head.next=prev;
        while(curr!=null && curr.next!=null)
        {
            prev.next=curr.next;
            prev=curr;
            Node next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;

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
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
        list.swapPair();
        list.display();
    }
}