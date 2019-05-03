
import java.util.Stack;

public class fullnodes_BT {
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
    public void fullnode(Node head)
    {
        Node current=head;
        Stack<Node> s = new Stack<>();
        s.push(current);
        int count = 0;
        while(current!=null && s.size()>0)
        {
            Node temp=s.pop();
            if(temp.left!=null && temp.right!=null)
            {
                count++;
            }
            if(temp.left!=null)
            {
                s.push(temp.left);
            }
            if(temp.right!=null)
            {
                s.push(temp.right);
            }
        }
        System.out.println(count);
    }
    public void halfnode(Node head)
    {
        Node current=head;
        int count=0;
        Stack<Node> s = new Stack<>();
        s.push(current);
        while (current!=null && s.size()>0)
        {
           Node temp=s.pop();
           if(temp.left!=null && temp.right==null)
               count++;
           else if(temp.left==null && temp.right!=null)
                count++;
           else
           {
               if(temp.left!=null)
                   s.push(temp.left);
               if(temp.right!=null)
                   s.push(temp.right);
           }

        }
        System.out.println(count);
    }
    public static void main(String args[])
    {
        fullnodes_BT tree = new fullnodes_BT();
        tree.head = new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.head.right.left=new Node(6);
        tree.head.right.right=new Node(7);
        tree.head.left.left.left=new Node(8);
        //tree.head.left.left.right=new Node(9);
        tree.fullnode(tree.head);
        tree.halfnode(tree.head);
    }
}

