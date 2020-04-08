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
	void oddeven()
	{
		Node es=null,ee=null,os=null,oe=null;
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			int x=curr.data;
			if(x%2==0)
			{
				if(es==null)
				{
					es=curr;
					ee=es;
				}
				else
				{
					ee.next=curr;
					ee=ee.next;
				}
			}
			else
			{
				if(os==null)
				{
					os=curr;
					oe=os;
				}
				else
				{
					oe.next=curr;
					oe=oe.next;
				}
			}
		}
		ee.next=os;
		oe.next=null;
		head=es;
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
		list.insertEnd(17);
		list.insertEnd(15);
		list.insertEnd(8);
		list.insertEnd(12);
		list.insertEnd(10);
		list.insertEnd(5);
		list.insertEnd(4);
		list.display();
		list.oddeven();
		list.display();
	}
}