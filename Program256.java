import java.util.*;

class Digits
{
    public int CountDigits(int iNo)
    {
        int iCnt = 0;
        while(iNo != 0)
        {
            iCnt++;
            iNo = iNo/10;
        }
        return iCnt;
    }

    public int Power(int Base, int index)
    {
        int iAns = 1;

        for(int iCnt = 1; iCnt <= index; iCnt++)
        {
            iAns = iAns * Base;
        }
        return iAns;
    }

    public boolean CheckArmstrong(int iNo)
    {
        int iTemp = iNo, iSum = 0, iDigit = 0, iRet = 0;

        int iCount = CountDigits(iNo);

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iRet = Power(iDigit, iCount);
            iSum = iSum + iRet;

            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program256
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        boolean bRet = dobj.CheckArmstrong(iNo);
        if(bRet == true)
        {
            System.out.println(iNo+ " is a Armstrong number.");
        }
        else
        {
            System.out.println(iNo+ " is not a Armstrong number.");
        }
    }       
}