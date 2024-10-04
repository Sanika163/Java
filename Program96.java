// 4

// A B C D     


import java.util.*;

class Program96
{
    public static void Display(int iNo)
    {
        int i = 0;
        char ch = 'A';

        for(i = 1; i <= iNo; i++)
        {
            System.out.print(ch + "\t");
            ch++;
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