import java.util.*;

class Program33
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

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int i = sc.nextInt();

        int iRet = SumFactors(i);
        System.out.println("Sum of Factors of "+i+" is : " + iRet);
    }
}