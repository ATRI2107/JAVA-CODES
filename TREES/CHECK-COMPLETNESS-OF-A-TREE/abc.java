import java.util.*;
class TreeNode
{
    int val;
    TreeNode left,right;
    TreeNode(int v)
    {
        val=v;
    }
}
class Tree
{
    class ANodes
    {
        TreeNode node;
        int pos;
        ANodes(TreeNode node,int pos)
        {
            this.node=node;
            this.pos=pos;
        }
    }
    public boolean isCompleteTree(TreeNode root) {
        ArrayList<ANodes> res=new ArrayList<>();
        res.add(new ANodes(root,1));
        int i=0;
        while(i<res.size())
        {
            ANodes curr=res.get(i++);
            if(curr.node!=null)
            {
                res.add(new ANodes(curr.node.left,curr.pos*2));
                res.add(new ANodes(curr.node.right,curr.pos*2+1));
            }
        }
        return res.get(i-1).pos==res.size();
    }
}
class abc
{
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(6);
        System.out.println(new Tree().isCompleteTree(root));
    }
}