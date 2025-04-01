package BTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class BT
{
    TreeNode root;

    public void buildtree(String[]str)
    {
        if(str.length==0)return;
        root=new TreeNode(Integer.parseInt(str[0]));
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int i=1;
        while(!q.isEmpty() && i<str.length)
        {
            TreeNode cn=q.poll();
            if(i<str.length)
            {
                int val=Integer.parseInt(str[i]);
                if(val!=-1)
                {
                    cn.left=new TreeNode(val);
                    q.offer(cn.left);
                }
                i++;
            }
            if(i<str.length)
            {
                int val=Integer.parseInt(str[i]);
                if(val!=-1){
                    cn.right=new TreeNode(val);
                    q.offer(cn.right);
                }
                i++;
            }
        }
    }
    public void leftView()
    {
        if(root==null)return;
        Queue<TreeNode>que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
            int s=que.size();
            for(int i=0;i<s;i++)
            {
                TreeNode cur=que.poll();
                if(i==0)
                {
                    System.out.print(cur.data+" ");
                }
                if(cur.left!=null)que.offer(cur.left);
                if(cur.right!=null)que.offer(cur.right);
            }
        }
    }
}
public class LeftView {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[]str=s.split(" ");
        BT bt=new BT();
        bt.buildtree(str);
        bt.leftView();
    }
}