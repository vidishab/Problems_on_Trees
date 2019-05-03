
import java.util.Stack;

public class NumofLeaves_BT {
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
    public void findnum(Node first)
    {
        Node current=first;
        int count=0;
        Stack<Node> s = new Stack<>();
        s.push(current);
        //System.out.println(current.data);
        while(current!=null && s.size()>0)
        {
            //while(current != null) {
                Node temp = s.pop();
                //System.out.println(temp.data);
                if (temp.left == null && temp.right == null)
                    count++;
                else {
                    if (temp.left != null)
                        s.push(temp.left);
                    if (temp.right != null)
                        s.push(temp.right);
                }
            }
       // }
        System.out.println(count);
    }
    public static void main(String args[])
    {
        NumofLeaves_BT tree = new NumofLeaves_BT();
        tree.head = new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.head.right.left=new Node(6);
        tree.head.right.right=new Node(7);
        tree.findnum(tree.head);
    }
}

