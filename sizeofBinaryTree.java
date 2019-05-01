
import java.util.LinkedList;
import java.util.Queue;

public class sizeofBinaryTree {
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
    public int size(Node head)
    {
        if(head==null)
            return 0;
        else
            return (size(head.left)+1+size(head.right));
    }
    public int size_recur(Node head)
    {
        int count=0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        while(!queue.isEmpty())
        {
            Node res=queue.remove();
            count++;
            if(res.left!=null)
            queue.add(res.left);
            if(res.right!=null)
            queue.add(res.right);
        }
        return count;
    }
    public static void main(String args[])
    {
        sizeofBinaryTree tree = new sizeofBinaryTree();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.head.left.left.left=new Node(6);
        tree.head.left.left.right=new Node(7);
        tree.head.left.right.right=new Node(7);
        System.out.println(tree.size(tree.head));
        System.out.println(tree.size_recur(tree.head));
    }
}

