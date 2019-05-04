
import java.util.Stack;

public class zigzag_BT {
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
    public void zigzag(Node head)
    {
        Stack<Node> s = new Stack<>();
        Stack<Node> s1=new Stack<>();
        Node current=head;
        s.push(current);
        while ((!s.empty() || !s1.empty()) && current!=null )
        {
            while(!s.empty())
            {
                Node temp = s.pop();
                System.out.println(temp.data);
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }
            while (!s1.empty())
            {
                Node temp = s1.pop();
                System.out.println(temp.data);
                if (temp.right != null)
                    s.push(temp.right);
                if (temp.left != null)
                    s.push(temp.left);
            }

        }
    }
    public static void main(String args[])
    {
        zigzag_BT tree = new zigzag_BT();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.head.right.left=new Node(8);
        tree.head.right.right=new Node(9);
        tree.head.left.left.left=new Node(6);
        tree.head.left.left.right=new Node(7);
        tree.zigzag(tree.head);
    }
}

