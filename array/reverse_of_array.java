import java.util.*;

public class reverse_of_array
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        System.out.println("\nThe reverse is complete");
        output(arr);
    }

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

    public static void reverse(int arr[])
    {
        int j = arr.length - 1;
        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}