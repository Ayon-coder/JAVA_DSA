import java.util.*;

public class diff_of_two_array
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        System.out.print("Enter the size of 1st array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);

        System.out.print("\nEnter the size of 2nd array: ");
        n = scn.nextInt();
        int[] arr1 = new int[n];
        input(arr1);
        output(arr1);

        DiffOfArray(arr, arr1);
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

    public static void DiffOfArray(int big[], int small[])
    {
        int i = small.length - 1;
        int j = big.length - 1;
        int k = big.length - 1;
        int c = 0;
        int[] diff = new int[k + 1];
        while(k >= 0 && j >= 0)
        {
            int d = 0;
            int avl = i >= 0? small[i]: 0;
            if(big[j] + c >= avl)
            {
                d = big[j] + c - avl;
                c = 0;
            }
            else
            {
                d = big[j] + c + 10 -avl;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }
        int idx = 0;
        while(idx < diff.length)
        {
            if(diff[idx] == 0)
            {
                idx++;
            }
            else
            {
                break;
            }
        }
        System.out.println();
        while(idx < diff.length)
        {
            System.out.print(diff[idx]);
            idx++;
        }
    }

}