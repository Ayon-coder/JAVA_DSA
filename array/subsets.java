import java.util.*;

public class subsets
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        subsets_calculation(arr);
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

    public static void subsets_calculation(int arr[])
    {
        int limit = Math.powExact(2, arr.length);
        for(int i = 0; i < limit; i++)
        {
            int temp = i;
            String set = "";
            for(int j = arr.length - 1; j >= 0; j--)
            {
                int r  =temp % 2;
                temp = temp / 2;

                if(r == 0)
                {
                    set = "-" + set;
                }
                else
                {
                    set = arr[j] + set;
                }
            }
            System.err.println(set);
        }
    }
}