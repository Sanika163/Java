import java.util.*;

class Program56
{
    public static void DisplayEvenOddDigitCount(int iNo)
    {
        int iDigit = 0;
        int iEvenCnt = 0, iOddCnt = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if((iDigit % 2) == 0)
            {
                iEvenCnt++;
            }
            else
            {
                iOddCnt++;
            }
            iNo = iNo / 10;
        }
        System.out.println("Number of even digits are : "+ iEvenCnt);
        System.out.println("Number of odd digits are : "+ iOddCnt);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        DisplayEvenOddDigitCount(iValue);
    }
}