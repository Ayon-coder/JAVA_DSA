import java.util.Scanner;
import java.util.Stack;

public class largest_area_hist
{
    static Scanner scn = new Scanner(System.in);

    public static void input(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter the " + (i + 1) + " th element: ");
            arr[i] = scn.nextInt();
        }
    }
    public static void output(int arr[])
    {
        System.out.print("The array is: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }

    public static int[] pse(Stack<Integer> st, int arr[])
    {
        int[] pse = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--)
        {
            while(st.size() > 0 &&  arr[st.peek()] > arr[i])
            {
                int idx = st.pop();
                pse[idx] = i;
            }
            st.push(i);
        }
        while(st.size() > 0)
        {
            int idx = st.pop();
            pse[idx] = -1;
        }
        return pse;
    }

    public static int[] nse(Stack<Integer> st, int arr[])
    {
        int[] nse = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            while(st.size() > 0 &&  arr[st.peek()] > arr[i])
            {
                int idx = st.pop();
                nse[idx] = i;
            }
            st.push(i);
        }
        while(st.size() > 0)
        {
            int idx = st.pop();
            nse[idx] = arr.length;
        }
        return nse;
    }

    public static void largeArea(Stack<Integer> st, int arr[])
    {
        int[] nex_idx = nse(st, arr);
        int[] prev_idx = pse(st, arr);

        int max = (nex_idx[0] - prev_idx[0] - 1) * 1;

        for(int i = 0; i < arr.length; i++)
        {
            if(max < ((nex_idx[i] - prev_idx[i]) * 1))
            {
                max = (nex_idx[i] - prev_idx[i] - 1) * 1;
            }
        }
        System.out.println("The max area is: " + max);
    }

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter your size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        System.err.println();
        pse(st, arr);
        System.err.println();
        nse(st, arr);
        largeArea(st, arr);
    }
}