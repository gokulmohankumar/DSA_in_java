package BTree;

import java.util.LinkedList;
import java.util.Queue;

class Nodet
{
    int data;
    Nodet left;
    Nodet right;
    public Nodet(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class BTree1
{
    Nodet root;

    public void build(int[]arr)
    {
        if(arr.length==0)return;
        root=new Nodet(arr[0]);
        Queue<Nodet> q=new LinkedList<>();
        q.offer(root);
        int i=1;
        while(!q.isEmpty() && i<arr.length)
        {
            Nodet cn=q.poll();
            if(i<arr.length)
            {
                cn.left=new Nodet(arr[i]);
                q.offer(cn.left);
                i++;
            }
            if(i<arr.length)
            {
                cn.right=new Nodet(arr[i]);
                q.offer(cn.right);
                i++;
            }
        }
    }
    public void levelOrderTraversal()
    {
        if(root==null)return;
        Queue<Nodet>que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
            Nodet cur=que.poll();
            System.out.print(cur.data+" ");
            if(cur.left!=null)que.offer(cur.left);
            if(cur.right!=null)que.offer(cur.right);
        }
    }
}
public class LevelOrderTraversal {
    public static void main(String[] args) {
        BTree1 bt=new BTree1();
        int[]arr={10,20,30,40,50};
        bt.build(arr);
        bt.levelOrderTraversal();
    }
}
