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
    boolean cycleDetect()
    {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
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
        System.out.println(list.cycleDetect()); 
    }
}