
import java.util.LinkedList;
import java.util.Queue;

public class mirrorof_BT {
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
    public void mirrors(Node head)
    {
        Node temp;
        Node current=head;
        if(current!=null) {
            mirrors(current.left);
            mirrors(current.right);
            temp = current.left;
            current.left = current.right;
            current.right = temp;
        }
        //print(head);
    }
    public void print(Node head)
    {
        Queue<Node> queue=new LinkedList<>();
        Node current=head;
        queue.add(current);
        while(current!=null && !queue.isEmpty())
        {
            Node temp=queue.remove();
            System.out.println(temp.data);
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }

    }
    public static void main(String args[])
    {
        mirrorof_BT tree = new mirrorof_BT();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.mirrors(tree.head);
        tree.print(tree.head);
    }
}

