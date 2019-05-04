
import java.util.LinkedList;
import java.util.Queue;

public class sumofele_BT {
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
    public int sum(Node head)
    {
        int s=0;
        Node current=head;
        if(current!=null)
            s+=current.data+ sum(current.left) + sum(current.right);
        return s;
    }
    public void sum_iter(Node head)
    {
        int sum=0;
        Node current=head;
        Queue<Node> queue=new LinkedList<>();
        queue.add(current);
        while (current!=null && !queue.isEmpty())
        {
            Node temp = queue.remove();
            sum += temp.data;
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);

        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        sumofele_BT tree = new sumofele_BT();
        int sum=0;
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.head.left.left.left=new Node(6);
        tree.head.left.left.right=new Node(7);
        tree.sum(tree.head);
        System.out.println(tree.sum(tree.head));
        tree.sum_iter(tree.head);
    }
}

