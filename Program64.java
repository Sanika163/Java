import java.util.*;

class Program64
{
    public static int MaxDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            iNo = iNo / 10;
        }
        return iMax;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        int iRet = MaxDigit(iValue);
        System.out.println("Largest digit is : "+iRet);
    }
}