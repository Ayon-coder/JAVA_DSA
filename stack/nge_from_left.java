import java.util.*;

public class nge_from_left
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

    public static void nge(Stack<Integer> st, int[] arr)
    {
        int[] nge = new int[arr.length];
        st.push(0);
        for(int i = 0; i < arr.length; i++)
        {
            while(st.size() > 0 && arr[i] > arr[st.peek()])
            {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }

            st.push(i);
        }
        while(st.size() != 0)
        {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        output(nge);
    }

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter your size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        nge(st, arr);
    }

    
}