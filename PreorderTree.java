
import java.util.Stack;

public class PreorderTree {
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
    public void preorder()
    {
        Stack<Node> s = new Stack<>();
        Node current=head;
        while(current!=null || s.size() > 0)
        {
            while (current != null)
            {
                System.out.println(current.data);
                s.push(current);
                current=current.left;
            }
            current=s.pop();
            //if(current.right != null)
            current=current.right;

        }
    }
    public static void main(String args[])
    {
        PreorderTree tree = new PreorderTree();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.preorder();
    }
}

