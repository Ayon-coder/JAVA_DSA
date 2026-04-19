import java.util.*;

public class duplicate_bracket
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        Stack<Character> st = new Stack<>();
        System.out.println(scan(st));
    }

    public static boolean scan(Stack<Character> st)
    {
        System.out.println("Enter your expression: ");
        StringBuilder exp = new StringBuilder(scn.next());

        for(int i = 0; i < exp.length(); i++)
        {
            if(exp.charAt(i) != ')')
            {
                st.push(exp.charAt(i));
            }
            else if(exp.charAt(i) == ')')
            {
                if(st.peek() == '(')
                {
                    return true;
                }
                else
                {
                    while(st.peek() != '(' && st.size() > 0)
                    {
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        return false;
    }
}