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
    void add(Node head2)
    {
        List result=new List();
        Node i=this.head,j=head2;
        int carry=0;
        while(i!=null || j!=null)
        {
            int sum=carry+(i!=null?i.data:0)+(j!=null?j.data:0);
            carry=(sum>9)?1:0;
            sum%=10;
            result.insertEnd(sum);
            
            if(i!=null) i=i.next;
            if(j!=null) j=j.next;
        }
        if(carry>0)
        {
            result.insertEnd(carry);
        }
       result.display(); 
    }
    void display()
    {
        for(Node curr=this.head;curr!=null;curr=curr.next)
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
        list1.insertEnd(5);
        list1.insertEnd(4);

        list2.insertEnd(5);
        list2.insertEnd(4);
        list2.insertEnd(3);

        list1.add(list2.head);

    }
}