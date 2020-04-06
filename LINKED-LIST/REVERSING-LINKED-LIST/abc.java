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
    void insert(int x)
    {
        Node temp=new Node(x);
        if(head==null)
        {
            head=temp;
        }
        else{
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=temp;
        }
    }
    void reverse()
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println(); 
    }
}
class abc
{
    public static void main(String[] args) {
        List list=new List();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Before Reversing");
        list.display();
        list.reverse();
        System.out.println("After Reversing");
        list.display();
    }
}