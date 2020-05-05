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
    boolean helper(TreeNode root,Integer lower,Integer upper)
    {
        if(root==null) return true;
        if(lower!=null && root.val<=lower) return false;
        if(upper!=null && root.val>=upper) return false;
        if(!helper(root.left,lower,root.val)) return false;
        if(!helper(root.right,root.val,upper)) return false;
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);}
}
class abc
{
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(15);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(20);
        System.out.println(new Tree().isValidBST(root));
    }
}