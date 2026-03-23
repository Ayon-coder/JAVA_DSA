import java.util.*;

public class sum_of_two_array
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

        sumOfArray(arr, arr1);
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

    // assume first array is bigger
    public static void sumOfArray(int big[], int small[])
    {
        int j = small.length - 1, i = 0;
        int carry = 0;
        int sum = 0;

        int[] new_arr = new int[big.length + 1];
        int k = new_arr.length - 1;

        for(i = big.length - 1; i >= 0 && j >= 0; i--)
        {
            sum = big[i] + small[j--] + carry;
            carry = sum / 10;
            new_arr[k--] = sum % 10;
        }

        while(i >= 0)
        {
            if(carry != 0)
            {
                sum = big[i] + carry;
                carry = sum / 10;
                new_arr[k] = sum % 10;
            }
            else
            {
                new_arr[k] = big[i];
            }
            k--;
            i--;
        }

        if(carry != 0)
        {
            new_arr[k] = carry;
        }

        // ✅ skip leading zero
        int start = 0;
        if(new_arr[0] == 0)
        {
            start = 1;
        }

        System.out.print("\nSum = ");
        for(int idx = start; idx < new_arr.length; idx++)
        {
            System.out.print(new_arr[idx] + " ");
        }
    }
}