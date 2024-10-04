import java.util.*;

class Program59
{
    public static boolean CheckPallindrome(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iDigit + (iRev * 10);
            iNo = iNo / 10;
        }
        if(iTemp == iRev)
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
        int iValue = sc.nextInt();

        boolean bRet = CheckPallindrome(iValue);
        
        if(bRet == true)
        {
            System.out.println(iValue+" is a pallindrome number");
        }
        else
        {
            System.out.println(iValue+" is not a pallindrome number");
        }
    }
}