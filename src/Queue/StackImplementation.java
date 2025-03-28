package Queue;

import java.util.Stack;

class SQueue
{
    Stack<Integer>in=new Stack<>();
    Stack<Integer>out=new Stack<>();
    int size;
    public void enqueue(int val)
    {
        in.push(val);
    }
    public int dequeue()
    {
        if(in.empty())
        {
            System.out.println("Queue is empty");
        }
        if(out.empty())
        {
            while (in.empty())
            {
                out.push(in.pop());
            }
        }
        size--;
        return out.pop();
    }
    public void display()
    {

    }
}
public class StackImplementation {
}
