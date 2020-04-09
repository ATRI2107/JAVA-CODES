import java.util.*;
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
    public Node removeDuplicates() 
    {
        HashSet<Integer> hs=new HashSet<>();    
        Node prev=null,curr=head;
        while(curr!=null)
        {
            if(hs.contains(curr.data))
            {
                prev.next=curr.next;
            }
            else
            {
                hs.add(curr.data);
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
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
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertEnd(5);
        list.insertEnd(3);
        list.insertEnd(6);
        list.removeDuplicates();
        list.display();
    }
}