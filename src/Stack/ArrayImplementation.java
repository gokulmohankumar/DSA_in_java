package Stack;
class MyStack
{
    int[]arr;
    int size=0;
    int top=-1;
    int n;
    public MyStack(int n)
    {
        this.n=n;
        arr=new int[n];
    }
    public void push(int val)
    {
        if(top>=n-1)
        {
            System.out.println("stack overflow: cant push element: "+val);
        }
        else {
            top++;
            arr[top] = val;
            size++;
        }
    }
    public int pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
        }
        else {
            int val=arr[top];
            top--;
            size--;
            return val;
        }
        return -1;
    }
    public void display()
    {
        for (int i = top; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int peek()
    {
        return arr[top];
    }
    public int size()
    {
        return size;
    }
}
public class ArrayImplementation {
    public static void main(String[] args) {
        MyStack st=new MyStack(5);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.display();
        st.push(10);
        System.out.println("peek: "+st.peek());
        st.pop();
        System.out.println("peek: "+ st.peek());
        System.out.println("size: "+st.size());
    }
}
