
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Level_maxsum {
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
    public void level(Node head)
    {
        int maxlevel=0, level=0, currsum=0, maxsum=0;
        Queue<Node> queue = new LinkedList<>();
        Node current=head;
        queue.add(current);
        queue.add(null);
        while(current!=null && !queue.isEmpty()) {
            Node temp = queue.remove();
            //System.out.println(temp.data);
            if (temp == null) {
                if (currsum > maxsum) {
                    maxsum = currsum;
                    maxlevel = level;
                }
                if (!queue.isEmpty())
                    queue.add(null);
                currsum = 0;
                level++;
            }
            if (temp != null) {
                currsum += temp.data;
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }

        }
        System.out.println("Level "+ maxlevel+ " Maximum sum "+ maxsum);
    }
    public static void main(String args[])
    {
        Level_maxsum tree = new Level_maxsum();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(11);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(15);
        tree.level(tree.head);

    }
}

