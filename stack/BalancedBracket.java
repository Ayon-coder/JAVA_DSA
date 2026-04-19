import java.util.*;

public class BalancedBracket
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter your expression: ");
        StringBuilder exp = new StringBuilder(scn.nextLine());
        System.out.println(checkBracket(exp));
    }

    public static boolean checkBracket(StringBuilder exp)
    {
        ArrayList<Character> list_open = new ArrayList<>(Arrays.asList('(', '{', '['));
        ArrayList<Character> list_close = new ArrayList<>(Arrays.asList(')', '}', ']'));
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < exp.length(); i++)
        {
            if(list_open.contains(exp.charAt(i)))
            {
                st.push(exp.charAt(i));
            }
            else if(list_close.contains(exp.charAt(i)))
            {
                if(st.size() == 0)
                {
                    return false;
                }
                char close = exp.charAt(i);
                char open = st.pop();
                int diff = close - open;
                if(diff != 1)
                {
                    if(diff != 2)
                    {
                        return false;
                    }
                }
            }
        }
        System.out.println(st);
        if(st.size() > 0)
        {
            return false;
        }
        return true;
    }
}