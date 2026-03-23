import java.util.*;

public class ceil_floor
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);

        System.out.print("\nEnter the key: ");
        int key = scn.nextInt();
        int[] idx_arr = new int[2];
        idx_arr = ceillAndFloor(arr, key);
        System.out.print("The floor is: " + arr[idx_arr[0]] + " and the ceil is: " + arr[idx_arr[1]]);
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

    public static int[] ceillAndFloor(int arr[], int key)
    {
        int low = 0; 
        int high = arr.length - 1;
        int[] val_arr = new int[2];

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == key)
            {
                val_arr[0] = mid;
                val_arr[1] = mid;
                return val_arr;
            }
            else if(arr[mid] > key)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        val_arr[0] = high;
        val_arr[1] = low;
        return val_arr;
    }
}