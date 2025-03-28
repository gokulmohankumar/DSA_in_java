package Stack;
import java.util.Stack;
public class ReduntancyParanthesis {
    public static void main(String[] args) {
           String str="((a+b)*((c-d)/k))";
        System.out.println(checkReduntancy(str));
    }
    public static boolean checkReduntancy(String str)
    {
        Stack<Character>st=new Stack();
        for(char c: str.toCharArray())
        {
            if(c!=')')st.push(c);
            else {
                if(st.isEmpty())return true;
                char top=st.pop();
                boolean oper=false;
                while(top!='(')
                {
                    if(top=='+' || top=='-'|| top=='*'||top=='/')oper=true;
                    top=st.pop();
                }
                if(!oper)return true;
            }
        }
        return false;
    }
}
