//4
//4 3 2 1 

import java.util.*;

class Program91
{
    public static void Display(int iNo)
    {
        int i = 0;
        for(i = iNo; i >0; i--)
        {
            System.out.print(i+ "\t");
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