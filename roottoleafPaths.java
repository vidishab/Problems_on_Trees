
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class roottoleafPaths {
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
    public void printpath(Node head,int path[],int len)
    {
        Node current=head;
        path[len]=current.data;
        len++;
        if(current.left==null && current.right==null)
        {
            printarr(path,len);
        }
        else
        {
            printpath(current.left,path,len);
            printpath(current.right,path,len);
        }
    }
    public void printarr(int arr[],int k)
    {
        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public void find(Node head)
    {
        //Node current=head;
        if (head==null)
            return;
        int path[]=new int[1000];
        printpath(head,path,0);
    }
    public static void main(String args[])
    {
        roottoleafPaths tree = new roottoleafPaths();
        tree.head=new Node(1);
        tree.head.left=new Node(2);
        tree.head.right=new Node(3);
        tree.head.left.left=new Node(4);
        tree.head.left.right=new Node(5);
        tree.find(tree.head);

    }
}

