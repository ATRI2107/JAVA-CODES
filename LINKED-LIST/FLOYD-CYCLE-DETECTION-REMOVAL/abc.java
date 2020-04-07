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
    void cycleDetectRemove()
    {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(slow!=fast) return;
        slow=head;
        while(slow.next!=fast.next) 
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
class abc
{
    public static void main(String[] args) {
        List list=new List();
        list.head = new Node(50); 
        list.head.next = new Node(20); 
        list.head.next.next = new Node(15); 
        list.head.next.next.next = new Node(4); 
        list.head.next.next.next.next = new Node(10); 
        // Creating a loop for testing 
        list.head.next.next.next.next.next = list.head.next.next;
        list.cycleDetectRemove(); 
        list.display();
    }
}