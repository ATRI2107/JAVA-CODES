import java.util.*;
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
    ArrayList<Node> res=new ArrayList<>();
    HashMap<String,Integer> hm=new HashMap<>();
    String dfs(Node root)
    {
        if(root==null) return "";
        String s=root.data+","+dfs(root.left)+","+dfs(root.right);
        hm.put(s,hm.getOrDefault(s,0)+1);
        if(hm.get(s)==2)
        res.add(root);
        return s;
    }
    ArrayList<Node> duplicate(Node root)
    {
        dfs(root);
        return res;
    }
}