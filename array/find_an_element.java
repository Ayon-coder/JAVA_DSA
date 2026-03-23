import java.util.*;

public class find_an_element
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter your array size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        System.err.print("\nEnter key to search: ");
        int key = scn.nextInt();
        int idx = binarySearch(arr, 0, arr.length - 1, key);
        if(idx == -1)
        {
            System.out.print("The element does not exist");
        }
        else
        {
            System.out.print("The element found at index: " + (idx + 1));
        }
    }
    
    public static void input(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter the " + (i + 1) + "th element: ");
            arr[i] = scn.nextInt();
        }
    }

    public static void output(int arr[])
    {
        System.out.print("Your array is: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }

    public static int binarySearch(int arr[], int low, int high, int key)
    {
        if(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
            {
                return binarySearch(arr, mid + 1, high, key);
            }
            else
            {
                return binarySearch(arr, low, mid - 1, key);
            }
        }
        return -1;
    }
}
