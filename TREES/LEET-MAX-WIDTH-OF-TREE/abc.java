import java.util.HashMap;

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
    HashMap<Integer,Integer> hm;
    int max_width;
    int getMaxWidth(Node root)
    {
        hm=new HashMap<>();
        max_width=0;
        maxWidth(root,0,0);
        return max_width;
    }
    void maxWidth(Node root,int depth,int position)
    {
        if(root==null) return;
        hm.computeIfAbsent(depth,x->position); // Hash MAp is for storing the position and depth of the left most node of each level
        max_width=Math.max(max_width,position-hm.get(depth)+1);
        maxWidth(root.left, depth+1, position*2);
        maxWidth(root.right, depth+1, position*2+1);
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.left.left=new Node(5);
        root.left.left.left=new Node(7);
        root.right=new Node(4);
        root.right.right=new Node(6);
        root.right.right.right=new Node(8);
        Tree obj=new Tree();
        System.out.println(obj.getMaxWidth(root));
    }
}