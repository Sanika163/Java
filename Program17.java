import java.util.*;

class Program17
{
    public static void Display(int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println("Jay Ganesh...");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of iterations : ");
        int i = sc.nextInt();

        Display(i);
        
    }
}