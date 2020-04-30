class Node
{
    int val;
    Node left,right;
    Node(int d)
    {
        val=d;
    }
}
class Tree
{
    int min;
    long ans=Long.MAX_VALUE;
    void dfs(Node root)
    {
        if(root!=null)
        {
            if(min<root.val && root.val<ans)
            {
                ans=root.val;
            }
            else if(min==root.val)
            {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
    int secSmallest(Node root)
    {
        int min=root.val;
        dfs(root);
        return ans!=Long.MAX_VALUE?(int)(ans):-1;
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(2);
        root.right=new Node(5);
        root.right.left=new Node(5);
        root.right.right=new Node(7);
        System.out.println(new Tree().secSmallest(root));
    }
}
/*
Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes. More formally, the property root.val = min(root.left.val, root.right.val) always holds.
Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
If no such second minimum value exists, output -1 instead.
*/