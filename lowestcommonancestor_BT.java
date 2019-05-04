
public class lowestcommonancestor_BT {
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
    public Node lca(Node head,int n1,int n2)
    {
        if(head==null)
            return null;
        if(head.data==n1 || head.data==n2)
            return head;
        Node left=lca(head.left,n1,n2);
        Node right=lca(head.right,n1,n2);
        if(left!=null && right!=null)
        {
            return head;
        }
        return (left != null) ? left : right;
    }

    public static void main(String args[])
    {
        lowestcommonancestor_BT tree=new lowestcommonancestor_BT();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.head.right.left=new Node(6);
        tree.head.right.right=new Node(7);
        Node pp=tree.lca(tree.head,1,3);
        System.out.println(pp.data);
    }
}

