import java.util.*;

class Program51
{
    public static int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;

        if(iNo < 0) //filter
        {
            iNo = -iNo;
        }

        if(iNo == 0)  //updator
        {
            return 1;
        }

        while(iNo != 0)
        {
            iNo = iNo / 10;
            iCnt++;
        }
        return iCnt;
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