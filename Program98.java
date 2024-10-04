// 4

// a b c d  


import java.util.*;

class Program98
{
    public static void Display(int iNo)
    {
        int i = 0;
        char ch = 'a';

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