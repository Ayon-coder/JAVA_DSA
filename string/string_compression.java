import java.util.*;

public class string_compression
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String args[])
    {
        StringBuilder s = new StringBuilder(scn.next());
        StringBuilder com_1 = compression_1(s);
        System.out.println(com_1);

        compression_2(s);
    }

    public static StringBuilder compression_1(StringBuilder s)
    {
        int j = 1;
        StringBuilder com_1 = new StringBuilder();

        com_1.append(s.charAt(0));
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                com_1.append(s.charAt(j));
            }
            j++;
        }
        return com_1;
    }

    public static void compression_2(StringBuilder s)
    {
        StringBuilder com_3 = new StringBuilder();
        int count = 1, j = 1;

        for(int i = 0; j <= s.length(); i++, j++)
        {
            if (j < s.length() && s.charAt(i) == s.charAt(j)) {
                count++;
            } else {
                com_3.append(s.charAt(i));
                if(count != 1)
                {
                    com_3.append(count);
                }
                count = 1;
            }
        }
        System.out.println(com_3);
    }
}