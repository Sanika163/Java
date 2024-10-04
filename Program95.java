// 4

// 1    2   3   4   *   *   *   *      


import java.util.*;

class Program95
{
    public static void Display(int iNo)
    {
        int i = 0;
        for(i = 1; i <= iNo; i++)
        {
            System.out.print(i + "\t");
        }
        for(i = 1; i <= iNo; i++)
        {
            System.out.print( "*\t");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        Display(iValue);
    }
}