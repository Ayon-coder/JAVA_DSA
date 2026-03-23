import java.util.*;

public class rotate_array
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);

        System.out.print("Enter the k: ");
        int k = scn.nextInt();
        rotate(arr, k);

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

    public static void reverse(int arr[], int low, int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
    public static void rotate(int arr[], int k)
    {
        // 1st part
        reverse(arr, 0, arr.length - k - 1);
        // 2nd part
        reverse(arr, arr.length - k, arr.length - 1);
        // whole array
        reverse(arr, 0, arr.length - 1);     // p1 + p2 -> p1T + p2T -> p2TT + p1TT -> p2 + p1
    }
}