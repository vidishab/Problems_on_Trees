
public class findMaxinTree {
    Node head;
    static class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    public int findmax(Node node)
    {
        int rootval=0;
        int left=0,right=0;
        int max=0;
        if (node!=null)
        {
            rootval=node.data;
            left=findmax(node.left);
            right=findmax(node.right);
            //System.out.println(rootval+ left+right);
        }
        if(left > right)
        {
            max=left;
        }
        else
        {
            max=right;
        }
        if(rootval > max)
        {
            max=rootval;
        }
        return max;
    }
    public static void main(String args[])
    {
        findMaxinTree tree=new findMaxinTree();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(10);
        tree.head.left.right=new Node(8);
        int res= tree.findmax(tree.head);
        System.out.println(res);

    }
}

