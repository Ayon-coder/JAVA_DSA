import java.util.*;

public class permutation_str
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        String s = new String(scn.next());
        permutationString(s);
    }

    public static int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void permutationString(String s)
    {
        ArrayList<String> strList = new ArrayList<>();
        int range = fact(s.length());

        for(int i = 0; i < range; i++)
        {
            int len = s.length();
            StringBuilder str = new StringBuilder(s);
            StringBuilder temp = new StringBuilder();
            while(len >= 1)
            {
                int idx = i % len;
                temp.append(str.charAt(idx));
                str.deleteCharAt(idx);
                len -= 1;
            }
            strList.add(temp.toString());
        }

        System.out.print(strList);
    }
}