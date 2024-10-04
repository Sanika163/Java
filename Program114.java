/*
    Row = 4
    Col = 4

    &   $   $   $   
    *   &   $   $
    *   *   &   $
    *   *   *   &

*/

import java.util.*;

class Program114
{
    public static void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j)
                {
                    System.out.print("&\t");
                }
                else if(i>j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("$\t");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iValue1 = sc.nextInt();

        System.out.println("Enter number of columns : ");
        int iValue2 = sc.nextInt();

        Display(iValue1, iValue2);
    }
}