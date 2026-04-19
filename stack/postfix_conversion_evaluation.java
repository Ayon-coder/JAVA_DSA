import java.util.*;

public class postfix_conversion_evaluation
{
    static Scanner scn = new Scanner(System.in);

    public static StringBuilder concat(StringBuilder op1, StringBuilder op2, StringBuilder op3)
    {
        StringBuilder exp = new StringBuilder(op1.append(op2).append(op3));
        return exp;
    }

    public static int calculate(int op2, int op1, char sign)
    {
        int res = 0;
        switch(sign)
        {
            case '+':
                res = op2+ op1;
                break;
            case '-':
                res = op2 - op1;
                break;
            case '*':
                res = op2 * op1;
                break;
            case '/':
                res = op2 / op1;
        }
        return res;
    }

    public static void evaluation(StringBuilder exp)
    {
        Stack<StringBuilder> prefix = new Stack<>();
        Stack<StringBuilder> infix = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch >= 48 && ch <=57)
            {
                temp.push(ch - '0');
                prefix.push(new StringBuilder(String.valueOf(ch)));
                infix.push(new StringBuilder(String.valueOf(ch)));
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                int op1 = temp.pop();
                int op2 = temp.pop();
                int res = calculate(op2, op1, ch);
                temp.push(res);

                StringBuilder val1_in = new StringBuilder(String.valueOf(infix.pop()));
                StringBuilder val2_in = new StringBuilder(String.valueOf(infix.pop()));;
                infix.push(new StringBuilder("(" + val2_in + ch + val1_in + ")"));

                StringBuilder val1_pre = new StringBuilder(String.valueOf(prefix.pop()));
                StringBuilder val2_pre = new StringBuilder(String.valueOf(prefix.pop()));
                prefix.push(concat(new StringBuilder(String.valueOf(ch)), val2_pre, val1_pre));
            }
        }

        System.out.println("The answer of postfix is: " + temp.peek());
        System.out.println("The infix answer is: " + infix.peek());
        System.out.println("The prefix answer is: " + prefix.peek());
    }

    public static void main(String[] args)
    {
        StringBuilder exp = new StringBuilder(scn.nextLine());
        evaluation(exp);
    }
}