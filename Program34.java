//Check perfect

import java.util.*;
class Program34
{
    public static int SumFactors(int iNo)
    {
        int iSum = 0;
        for(int iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }

    public static boolean ChkPerfect(int iNo)
    {
        int iAns = SumFactors(iNo);

        if(iAns == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int i = sc.nextInt();

        boolean bRet = ChkPerfect(i);
        
        if(bRet == true)
        {
            System.out.println(i + " is Perfect Number");
        }
        else
        {
            System.out.println(i + " is not Perfect Number");
        }
    }
}