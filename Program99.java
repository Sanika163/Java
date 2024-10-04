// Row      4
// Columns  4

/*
        *   *   *   *
        *   *   *   *
        *   *   *   *
        *   *   *   *

*/


import java.util.*;

class Program99
{
    public static void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue1 = sc.nextInt();

        System.out.println("Enter Number : ");
        int iValue2 = sc.nextInt();

        Display(iValue1, iValue2);
    }
}