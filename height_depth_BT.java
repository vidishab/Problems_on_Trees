
public class height_depth_BT {
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
public int height(Node head)
{
    int lh,rh;
    Node current=head;
    if(head == null)
        return 0;
    else
    {
        lh=height(current.left);
        rh=height(current.right);
        if(lh > rh)
        {
            return (lh+1);
        }
        else
        {
            return (rh+1);
        }
    }

}
public static void main(String args[])
{
    height_depth_BT tree = new height_depth_BT();
    tree.head=new Node(1);
    tree.head.left=new Node(2);
    tree.head.right=new Node(3);
    tree.head.left.left=new Node(4);
    tree.head.left.right=new Node(5);
    tree.head.left.right.right=new Node(6);
    System.out.println(tree.height(tree.head));
}
}


