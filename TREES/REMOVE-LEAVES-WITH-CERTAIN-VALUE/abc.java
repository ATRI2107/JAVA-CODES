class Node
{
    int val;
    Node left,right;
    Node(int v)
    {
        val=v;
    }
}
class Tree {
    void removeLeaves(Node root,Node parent,int target,int check)
    {
        if(root==null) return;
        
        removeLeaves(root.left,root,target,0);
        removeLeaves(root.right,root,target,1);
        if(root.left==null && root.right==null && root.val==target)
        {
            if(check==0 && parent!=null)
            {
                parent.left=null;
            }
            if(check==1 && parent!=null)
            {
                parent.right=null;
            }
        }
    }
    public Node removeLeafNodes(Node root, int target) {
        removeLeaves(root,null,target,0);
        if(root.val==target && root.left==null && root.right==null) return null;
        return root;
    }
    void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
}
class abc
{
public static void main(String[] args) {
    Node root=new Node(1);
    root.left=new Node(2);
    root.left.left=new Node(2);
    root.right=new Node(3);
    root.right.left=new Node(2);
    root.right.right=new Node(4);
    Tree obj=new Tree();
    obj.inorder(obj.removeLeafNodes(root,2));
    System.out.println();
}
}