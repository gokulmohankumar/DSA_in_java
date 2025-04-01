package Stack;
import java.util.Stack;
public class PostfixEvaluation {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        String[]arr={"100","200","+","2","/","5","*","7","+"};
        for(String str:arr)
        {
            if(Character.isDigit(str.charAt(0)))
            {
                st.push(Integer.parseInt(str));
            }
            else
            {
                int b=st.pop();
                int a=st.pop();
                switch (str)
                {
                    case "+"->st.push(a+b);
                    case "-"->st.push(a-b);
                    case "*"->st.push(a*b);
                    case "/"->st.push(a/b);
                    case "^"->st.push((int)Math.pow(a,b));
                }
            }
        }
        System.out.println(st.peek());
    }
}
