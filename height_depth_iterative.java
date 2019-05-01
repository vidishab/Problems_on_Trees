
import java.util.LinkedList;
import java.util.Queue;

public class height_depth_iterative {
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
    public int height_dp(Node head)
    {
        int level=0;
        Queue<Node> queue=new LinkedList<>();
        if(head==null)
            return 0;
        queue.add(head);
        queue.add(null);
        while (!queue.isEmpty())
        {
            Node temp=queue.remove();
            if(temp == null)
            {
                if(queue.isEmpty()!= true)
                    queue.add(null);
                level++;
            }
            else
            {
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
        }
        return level;

    }
    public static void main(String args[])
    {
        height_depth_iterative tree = new height_depth_iterative();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        System.out.println(tree.height_dp(tree.head));
    }
}

