import java.util.*;

public class bar_chart
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter your size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        barPrint(arr);
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
        System.out.print("The array is: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
    public static void barPrint(int arr[])
    {
       int max = arr[0];
       for(int i = 0; i < arr.length; i++)
       {
            if(arr[i] > max)
            {
                max = arr[i];
            }
       }
       for(int floor = max; floor >= 1; floor--)
       {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] >= floor)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
       }
    }
}