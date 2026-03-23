import java.util.*;

public class inverse_of_array
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        inverse(arr);
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

    public static void inverse(int arr[])
    {
        int[] new_arr = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            new_arr[arr[i]] = i;
        }

        output(new_arr);
    }
}