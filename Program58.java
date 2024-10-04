import java.util.*;

class Program58
{
    public static int Reverse(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iDigit + (iRev * 10);
            iNo = iNo / 10;
        }
        return iRev;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sc.nextInt();

        int iRet = Reverse(iValue);
        System.out.println("Reverse of "+iValue+" is : "+ iRet);
    }
}