import java.util.*;

public class infix_postfix_conversion
{
    static Scanner scn = new Scanner(System.in);

    public static int precedence(char op)
    {
        if(op == '+' || op == '-') return 1;
        else if(op == '*' || op == '/') return 0;
        else return -1;
    }

    public static void postfix_conversion(StringBuilder exp)
    {
        Stack<Character> oprtrs = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch >= 48 && ch <= 57)
            {
                postfix.append(ch);
            }
            else if(ch == '(')
            {
                oprtrs.push(ch);
            }
            else if(ch == ')')
            {
                while(oprtrs.size() > 0 && oprtrs.peek() != '(')
                {
                    postfix.append(oprtrs.pop());
                }
                oprtrs.pop();
            }
            else if(ch == '+' || ch == '-' || ch == '/' || ch == '*')
            {
                while(oprtrs.size() > 0 && oprtrs.peek() != '(' && precedence(ch) >= precedence(oprtrs.peek()))
                {
                    postfix.append(oprtrs.pop());
                }
                oprtrs.push(ch);
            }
        }
        while(oprtrs.size() > 0)
        {
            postfix.append(oprtrs.pop());
        }

        System.out.println(postfix);
    }

    public static void main(String[] args)
    {
        StringBuilder exp = new StringBuilder(scn.nextLine());
        postfix_conversion(exp);
    }
}