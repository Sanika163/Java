import java.util.*;

class Program55
{
    public static int CountEvenDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenCnt = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if((iDigit % 2) == 0)
            {
                iEvenCnt++;
            }
            iNo = iNo / 10;
        }
        return iEvenCnt;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        int iRet = CountEvenDigits(iValue);
        System.out.println("Number of even digits are : "+iRet);
    }
}