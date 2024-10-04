import java.util.*;

class Program52
{
    public static int SumDigits(int iNo)
    {
        int iSum = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum += iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        int iRet = SumDigits(iValue);
        System.out.println("Sum of digits is : "+iRet);
    }
}