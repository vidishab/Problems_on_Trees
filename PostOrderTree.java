
import java.util.Stack;

public class PostOrderTree {
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
    public void postorder() {
        Stack<Node> s = new Stack<>();
        s.push(head);
        //Node current = head;
        //s.push(head);
        Node prev = null;
        while (!s.empty()) {
            Node current=s.peek();
            if (prev == null || prev.left == current || prev.right == current) {
                if (current.left != null) {
                    s.push(current.left);
                } else if (current.right != null) {
                    s.push(current.right);
                }
            } else if (current.left == prev) {
                if (current.right != null) {
                    s.push(current.right);
                }
            } else {
                System.out.println(current.data);
                s.pop();
            }

            prev=current;
        }
    }
    public static void main(String args[])
    {
        PostOrderTree tree = new PostOrderTree();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.postorder();

    }
}

