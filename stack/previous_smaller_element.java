import java.util.Scanner;
import java.util.Stack;

public class previous_smaller_element
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
        for(int i = 0; i < arr.length; i++)
        {
            while(st.size() > 0 && st.peek() >= arr[i])
            {
                st.pop();
            }
            if(st.size() == 0)
            {
                list[i] = -1;
            }
            else
            {
                list[i] = st.peek();
            }
            st.push(arr[i]);
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
