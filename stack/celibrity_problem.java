import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class celibrity_problem
{

    public static void celibrity(int arr[][])
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++)
        {
            st.push(i);
        }

        while(st.size() >= 2)
        {
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1)
            {
                // i is not celibrity
                st.push(j);
            }
            else
            {
                // j is not celibrity
                st.push(i);
            }
        }
        int pot = st.pop();
        for(int i = 0; i < arr.length; i++)
        {
            if(pot != i)
            {
                if(arr[i][pot] == 0 || arr[pot][i] == 1)
                {
                    System.out.println("None");
                    return;
                }
            }
        }
        System.out.println(pot);
    }

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            String line = br.readLine();
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        celibrity(arr);
    }
}