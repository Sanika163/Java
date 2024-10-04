import java.util.*;

class Program46
{
    public static int CountDigits(int iNo)
    {

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        int iRet = CountDigits(iValue);
        System.out.println("Number of digits are : "+iRet);
    }
}