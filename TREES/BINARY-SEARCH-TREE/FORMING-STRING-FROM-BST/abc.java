/*
Input: Binary tree: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

Output: "1(2(4))(3)"
Explanation: Originallay it needs to be "1(2(4)())(3()())", 
but you need to omit all the unnecessary empty parenthesis pairs. 
And it will be "1(2(4))(3)".
*/
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
    String tree2str(Node t)
    {
        if(t==null) return "";
        String s=String.valueOf(t.data);
        String lh=tree2str(t.left);
        String rh=tree2str(t.right);
        
        if(!lh.equals("") && !rh.equals(""))
        {
            lh="("+lh+")";
            rh="("+rh+")";
        }
        else if(lh.equals("") && !rh.equals(""))
        {
            lh="("+lh+")";
            rh="("+rh+")";
        }
        else if(!lh.equals("") && rh.equals(""))
        {
            lh="("+lh+")";
        }
        
        return s+lh+rh;
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(4);
        System.out.println(new Tree().tree2str(root));
    }
}