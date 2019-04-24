import java.util.Stack;

public class InorderTree {
    Node head;
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    public void inorder() {
        Stack<Node> s = new Stack<>();
        Node current = head;
        Node prev;
        while (current != null || s.size() > 0)
         {
            while (current != null)
            {
                s.push(current);
                current = current.left;
            }
            current = s.pop();
            System.out.println(current.data);
            current = current.right;
        }
    }

    public static void main(String args[])
    {
        InorderTree tree = new InorderTree();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.inorder();
    }
}

