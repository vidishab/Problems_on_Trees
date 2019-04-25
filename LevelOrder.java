
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    Queue<Node> queue=new LinkedList<>();
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
    public void levelorder()
    {
        Node current=head;
        queue.add(current);
        //System.out.println(current.data);
        while (!queue.isEmpty())
       {
         current=queue.remove();
         System.out.println(current.data);
         if (current.left != null)
             queue.add(current.left);
         if (current.right != null)
             queue.add(current.right);
       }
    }
    public static void main(String args[])
    {
        LevelOrder tree = new LevelOrder();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.levelorder();
    }
}
