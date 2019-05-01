
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class levelorderreverse_BT {
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
    public void levelorder(Node head)
    {
        Node temp;
        Queue<Node> queue = new LinkedList<>();
        Stack<Node> s = new Stack<>();
        Node current=head;
        queue.add(current);
        while (current!=null && !queue.isEmpty())
        {
            temp=queue.remove();
            //System.out.println(temp.data);
            if(temp.right!=null)
                queue.add(temp.right);
            if(temp.left!=null)
                queue.add(temp.left);
            s.push(temp);
        }
        while(!s.empty())
        {
            System.out.println(s.pop().data);
        }
    }
    public void print(Node head)
    {
        Node current=head;
        if(current!=null)
        {
            System.out.println(current.data);
            print(head.left);
            print(head.right);
        }
    }
    public static void main(String args[])
    {
        levelorderreverse_BT tree = new levelorderreverse_BT();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        //tree.print(tree.head);
        tree.levelorder(tree.head);
    }
}

