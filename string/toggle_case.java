import java.util.*;

public class toggle_case
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        String s = scn.next();
        String toggle = toggleCase(s);
        System.out.print(toggle);
    }

    public static String toggleCase(String s)
    {
        StringBuilder new_s = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                char uch = (char) ('A' + ch - 'a');
                new_s.append(uch);
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                char lch = (char) ('a' + ch - 'A');
                new_s.append(lch);
            }
        }
        return new_s.toString();
    }
}