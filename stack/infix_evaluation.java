import java.util.*;

public class infix_evaluation
{
    static Scanner scn = new Scanner(System.in);

    public static int precedence(char oparetor)
    {
        if(oparetor == '+' || oparetor == '-') return 0;
        else if(oparetor == '*' || oparetor == '/') return 1;
        else return -1;
    }

    public static int operation(int op1, int op2, char operators)
    {
        int res = 0;
        switch (operators)
        {
            case '+':
                res = op2 + op1;
                break;
            case '-':
                res = op2 - op1;
                break;
            case '*':
                res = op2 * op1;
                break;
            case '/':
                res = op2 / op1;
                break;
            default:
                break;
        }
        return res;
    }

    public static void evaluation(StringBuilder exp)
    {
        Stack<Integer> oprnd = new Stack<>();
        Stack<Character> oprtr = new Stack<>();

        for(int i = 0; i < exp.length(); i++)
        {
            char lol = exp.charAt(i);
            if(lol >= 48 && lol <= 57)
            {
                oprnd.push(lol - '0');
            }
            else if(lol == '+' || lol == '-' || lol == '*' || lol == '/')
            {
                while (oprtr.size() > 0 && oprnd.size() > 0 && oprtr.peek() != '(' && precedence(lol) <= precedence(oprtr.peek()))
                {
                   int op1 = oprnd.pop();
                   int op2 = oprnd.pop();
                   char operators = oprtr.pop();

                   int res = operation(op1, op2, operators);
                   oprnd.push(res);
                }
                oprtr.push(lol);
            }

            else if(lol == '(')
            {
                oprtr.push(lol);
            }
            else if(lol == ')')
            {
                while (oprtr.size() > 0 && oprnd.size() > 0 && oprtr.peek() != '(')
                {
                    int op1 = oprnd.pop();
                    int op2 = oprnd.pop();
                    char operators = oprtr.pop();

                    int res = operation(op1, op2, operators);
                    oprnd.push(res);
                }
                oprtr.pop();
            }
        }

        while(oprtr.size() > 0)
        {
            int op1 = oprnd.pop();
            int op2 = oprnd.pop();
            char operators = oprtr.pop();  
            int res = operation(op1, op2, operators);
            oprnd.push(res);
        }

        System.out.println(oprnd.peek());
    }
    public static void main(String args[])
    {
        StringBuilder exp = new StringBuilder(scn.nextLine());
        evaluation(exp);
    }
}