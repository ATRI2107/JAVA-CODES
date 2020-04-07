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
            if(slow==fast) return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}