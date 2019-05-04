
public class check_ifBT_aremirrors {
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
    public boolean check(Node tree, Node tree1 )
    {
        if(tree == null && tree1 == null)
            return true;
        if(tree == null && tree1 != null)
            return false;
        if(tree1 == null && tree != null)
            return false;
        return (tree.data==tree1.data && check(tree.left,tree1.right) && check(tree.right, tree1.left));
    }
    public static void main(String args[])
    {
        check_ifBT_aremirrors tree = new check_ifBT_aremirrors();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);

        check_ifBT_aremirrors tree1 = new check_ifBT_aremirrors();
        tree1.head=new Node(1);
        tree1.head.right=new Node(2);
        tree1.head.left=new Node(3);
        tree1.head.right.right=new Node(4);
        tree1.head.right.left=new Node(5);
        //tree.head.left.left=new Node(6);

        System.out.println(tree.check(tree.head,tree1.head));
    }
}

