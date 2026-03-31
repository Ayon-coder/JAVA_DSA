import java.util.*;

public class str_with_ascii
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        String s = new String(scn.next());
        String ans = strWithAscii(s);
        System.out.print(ans);
    }

    public static String strWithAscii(String s)
    {
        StringBuilder new_s = new StringBuilder();
        int i = 0, j = 0;

        for(i = 0, j = 1; j < s.length(); i++, j++)
        {
            new_s.append(s.charAt(i));
            new_s.append(s.charAt(j) - s.charAt(i));
        }
        new_s.append(s.charAt(i));
        return new_s.toString();
    }
}