import java.util.*;

public class remove_prime_num 
{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println("Enter number of element: ");
        int n = scn.nextInt();

        for(int i = 0; i < n; i++)
        {
            int ele = scn.nextInt();
            list.add(ele);
        }
        removePrime(list);
    }

    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i = 2; i * i <= num; i++)
        {
            if((num % i) == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void removePrime(ArrayList <Integer> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(isPrime(list.get(i)))
            {
                list.remove(i);
            }
        }
        System.out.println("Your new array is: ");
        System.out.println(list);
    }
}