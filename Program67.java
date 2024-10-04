import java.util.*;

class Program67
{
    public static int MinDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 9;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            if(iMin == 0)
            {
                break;
            }
            iNo = iNo / 10;
        }
        return iMin;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        int iRet = MinDigit(iValue);
        System.out.println("Smallest digit is : "+iRet);
    }
}