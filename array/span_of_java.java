import java.util.Scanner;

public class span_of_java
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter Range: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        output(arr);
        System.out.print("The span of the array is: " + span(arr));
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
            System.out.print(arr[i]);
        }
    }

    public static int span(int arr[])
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return max - min;
    }
}