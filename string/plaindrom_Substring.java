import java.util.*;

public class plaindrom_Substring {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        String s = scn.next();
        prinPalindrom(s);
    }

    public static boolean palindrom(String s)
    {
        String rev = new StringBuilder(s).reverse().toString();
        return (rev.equals(s));
    }
    public static void prinPalindrom(String s)
    {
        for(int i = 0; i <= s.length() - 1; i++)
        {
            for(int j = i + 1; j <= s.length(); j++)
            {
                String subS = s.substring(i, j);
                if(palindrom(subS))
                {
                    System.out.println(subS);
                }

            }
        }
    }
}
