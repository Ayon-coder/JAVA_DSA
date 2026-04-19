import java.util.*;

public class infix_conversion
{
    static Scanner scn = new Scanner(System.in);

    public static int precedence(char op)
    {
        if(op == '+' || op == '-') return 1;
        else if(op == '*' || op == '/') return 0;
        else return -1;
    }
    public static StringBuilder concat(StringBuilder op1,  StringBuilder op2, StringBuilder op3)
    {
        // op1 is the sign for prefix and op3 is the sign for postfix
        
        StringBuilder exp = new StringBuilder(op1.append(op2).append(op3));
        return exp;
    }

    public static void conversion(StringBuilder exp)
    {
        Stack<Character> operators = new Stack<>();
        Stack<StringBuilder> postfix = new Stack<>();
        Stack<StringBuilder> pretfix = new Stack<>();

        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch >= 48 && ch <= 57)
            {
                pretfix.push(new StringBuilder().append(ch));
                postfix.push(new StringBuilder().append(ch));
            }
            else if(ch == '(')
            {
                operators.push(ch);
            }
            else if(ch == '+' || ch == '-' || ch == '/' || ch == '*')
            {
                while (operators.size() > 0 && precedence(ch) >= precedence(operators.peek()) && operators.peek() != '(')
                {
                    char op = operators.pop();
                    StringBuilder val1_post = postfix.pop();
                    StringBuilder val2_post = postfix.pop();
                    StringBuilder val1_pre = pretfix.pop();
                    StringBuilder val2_pre = pretfix.pop();

                    StringBuilder con_pre = concat(new StringBuilder().append(op), val2_pre, val1_pre);
                    StringBuilder con_post = concat(val2_post, val1_post, new StringBuilder().append(op));

                    postfix.push(con_post);
                    pretfix.push(con_pre);
                }
                operators.push(ch);
            }

            else if(ch == ')')
            {
                while (operators.size() > 0 && operators.peek() != '(')
                {
                    char op = operators.pop();
                    StringBuilder val1_post = postfix.pop();
                    StringBuilder val2_post = postfix.pop();
                    StringBuilder val1_pre = pretfix.pop();
                    StringBuilder val2_pre = pretfix.pop();

                    StringBuilder con_pre = concat(new StringBuilder().append(op), val2_pre, val1_pre);
                    StringBuilder con_post = concat(val2_post, val1_post, new StringBuilder().append(op));

                    postfix.push(con_post);
                    pretfix.push(con_pre);
                }
                operators.pop();
            }
        }

        while(operators.size() > 0)
        {
            char op = operators.pop();
            StringBuilder val1_post = postfix.pop();
            StringBuilder val2_post = postfix.pop();
            StringBuilder val1_pre = pretfix.pop();
            StringBuilder val2_pre = pretfix.pop();

            StringBuilder con_pre = concat(new StringBuilder().append(op), val2_pre, val1_pre);
            StringBuilder con_post = concat(val2_post, val1_post, new StringBuilder().append(op));

            postfix.push(con_post);
            pretfix.push(con_pre);
        }

        System.out.println("The postfix is: " + postfix.peek());
        System.out.println("The prefix is: " + pretfix.peek());
    }

    public static void main(String[] args)
    {
        StringBuilder exp = new StringBuilder(scn.nextLine());
        conversion(exp);
    }
}