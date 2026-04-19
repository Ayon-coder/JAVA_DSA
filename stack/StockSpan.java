import java.util.Scanner;
import java.util.Stack;

public class StockSpan
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

    public static void pge(Stack<Integer> st, int[] arr)
    {
        int[] list = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--)
        {
            while(st.size() > 0 &&  arr[st.peek()] < arr[i])
            {
                int idx = st.pop();
                list[idx] = idx - i;
            }
            st.push(i);
        }
        while(st.size() > 0)
        {
            int idx = st.pop();
            list[idx] = idx + 1;
        }
        output(list);
    }
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter your size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        pge(st, arr);
    }
}
