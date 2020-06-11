class ListNode
{
    int val;
    ListNode next;
    ListNode(int v)
    {
        val=v;
    }
}
class List{
    ListNode head;
    void insertEnd(int x)
    {
        ListNode temp=new ListNode(x);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            ListNode curr=head;
            while(curr.next!=null) curr=curr.next;
            curr.next=temp;
        }
    }
    ListNode middle(ListNode head)
    {
        if(head==null) return head;
        ListNode slow=head,fast=head,prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null)
        {
            prev.next=null;
        }
        return slow;
    }
    ListNode merge(ListNode head1,ListNode head2)
    {
        if(head1==null) return head2;
        if(head2==null) return head1;
        
        if(head1.val<head2.val)
        {
            head1.next=merge(head1.next,head2);
            return head1;
        }
        else
        {
            head2.next=merge(head1,head2.next);
            return head2;
        }
    }
    
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null) return head;
         ListNode mid=middle(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        ListNode sorted_list=merge(left,right);
        return sorted_list;
    }
    void display(ListNode head)
    {
        for(ListNode curr=head;curr!=null;curr=curr.next)
        System.out.print(curr.val+" ");
        System.out.println();
    }
}
class abc
{
    public static void main(String[] args) {
        List l=new List();
        l.insertEnd(5);
        l.insertEnd(3);
        l.insertEnd(4);
        l.insertEnd(6);

        ListNode result_head=l.sortList(l.head);
        l.display(result_head);
    }
}