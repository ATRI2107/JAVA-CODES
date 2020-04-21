import java.util.*;
class LRUCache
{
    class Node
    {
        int key,val;
        Node next;
        Node prev;
        Node(int k,int v)
        {
            key=k;
            val=v;
        }
    }
    int cap;
    HashMap<Integer,Node> hm;
    final Node head;
    final Node tail;
    LRUCache(int capacity)
    {
        cap=capacity;
        hm=new HashMap<>(cap);
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    public int get(int key)
    {
        int res=-1;
        Node node=hm.get(key);
        if(node!=null)
        {
            res=node.val;
            remTail(node);
            addHead(node);
        }
        return res;
    }
    public void put(int key,int value)
    {
        Node node=hm.get(key);
        if(node!=null)
        {
            remTail(node);
            node.val=value;
            addHead(node);            
        }
        else
        {
            if(hm.size()==cap)
            {
                hm.remove(tail.prev.key);
                remTail(tail.prev);                
            }
            Node new_node=new Node(key,value);
            hm.put(key,new_node);
            addHead(new_node);
        }
    }
    public void addHead(Node node)
    {
        Node head_next=head.next;
        head.next=node;
        node.next=head_next;
        node.prev=head;
        head_next.prev=node;
    }
    public void remTail(Node node)
    {
        Node next=node.next;
        Node prev=node.prev;
        next.prev=prev;
        prev.next=next;
    }
}