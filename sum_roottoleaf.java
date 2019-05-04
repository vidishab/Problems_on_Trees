
import java.util.Scanner;

public class sum_roottoleaf {
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
    public void findsumpath(Node head,int s)
    {
        int arr[]=new int[1000];
        findsum(head,arr,0,s);
    }
    public void findsum(Node head,int path[],int len,int s)
    {
        Node current=head;
        path[len]=current.data;
        len++;
        if(current.left==null && current.right==null)
            findarray(path,len,s);
        else
        {
            findsum(current.left,path,len,s);
            findsum(current.right,path,len,s);
        }
    }
    public void findarray(int arr[],int k,int s)
    {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        //System.out.println(sum);
        if(sum==s)
        {
            System.out.println("Exists");
            for(int i=0;i<k;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[]) {
        sum_roottoleaf tree = new sum_roottoleaf();
        tree.head = new Node(1);
        tree.head.left = new Node(2);
        tree.head.right = new Node(3);
        tree.head.left.left = new Node(4);
        tree.head.left.right = new Node(5);
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        tree.findsumpath(tree.head,s);
    }
}

