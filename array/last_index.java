import java.util.*;

public class last_index
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        
        System.out.println("\nEnter the key: ");
        int key = scn.nextInt();
        System.out.print("The last index is: " +  lastIndex(arr, key));
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

    public static int lastIndex(int arr[], int key)
    {
        int low = 0;
        int high = arr.length - 1;
        int last_idx = 0;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] == key)
            {
                last_idx = mid;
                low = mid + 1;
            }
            else if(arr[mid] < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return last_idx;
    }
}