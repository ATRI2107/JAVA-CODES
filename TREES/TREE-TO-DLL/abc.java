class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
    }
}
class Tree
{
    Node head,prev=null;
    Node bToDll(Node root)
    {
        if(root==null) return root;
        bToDll(root.left);
        if(prev==null)
        {
            head=root;
        }
        else
        {
            prev.right=root;
            root.left=prev;
        }
        prev=root;
        bToDll(root.right);
        return head;
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(12);
        root.right=new Node(15);
        root.right.left=new Node(16);
        root.right.right=new Node(14);
        Node res=new Tree().bToDll(root);
        for(Node curr=res;curr!=null;curr=curr.right)
        {
            System.out.print(curr.data+" ");
        }
        System.out.println();
        for(Node curr=root.right.right;curr!=null;curr=curr.left) // printing in reverse to confirm the logic
        {
            System.out.print(curr.data+" ");
        }
        System.out.println();
    }
}