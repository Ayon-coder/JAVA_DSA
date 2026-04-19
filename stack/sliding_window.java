import java.util.*;

public class sliding_window
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
        System.out.print("\nThe array is: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
    
    public static int[] nge(Stack<Integer> st, int[] arr)
    {
        int[] nge = new int[arr.length];
        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;
        for(int i = arr.length - 2; i >= 0; i--)
        {
            while(st.size() > 0 && arr[i] >= arr[st.peek()])
            {
                st.pop();
            }
            if(st.size() == 0)
            {
                nge[i] = arr.length;
            }
            else
            {
                nge[i] = st.peek();
            }
            st.push(i);
        }
        return nge;
    }

    public static void sliding(Stack<Integer> st, int arr[])
    {
        int k = 3;
        int j = 0;
        int[] next_greater = nge(st, arr);
        for(int i = 0; i < arr.length - k + 1; i++)
        {
            if(j < i)
            {
                j = i;
            }
            while (next_greater[j] < i + k)
            {
                j = next_greater[j];
            }

            System.err.println(arr[j]);
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        Stack<Integer> st = new Stack<>();
        sliding(st, arr);
    }
}
