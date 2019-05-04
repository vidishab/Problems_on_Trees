
public class ancestorsofanode {
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
    public boolean ancestors(Node head,Node one)
    {
        Node current=head;
        if(head==null)
            return false;
        if(head.data==one.data)
            return true;
        if(ancestors(head.left,one) || ancestors(head.right,one))
        {
            System.out.println(head.data);
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        ancestorsofanode tree = new ancestorsofanode();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.ancestors(tree.head,tree.head.left.left);
    }
}

