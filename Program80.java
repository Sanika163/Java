import java.util.*;

class Program80
{
    public static boolean ChkOccurance(int[] Arr, int iSize, int iNo)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
        }
        if(iCnt==iSize)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter number of Elements you want to store in array : ");
        int iLength = sc.nextInt();

        int[] Arr = new int[iLength];

        System.out.println("Enter Elements in array : ");

        for(iCnt = 0; iCnt <iLength; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }

        System.out.println("Enter number to find its occurance: ");
        int iNo = sc.nextInt();

        System.out.println("Elements of Array are : ");
        for(iCnt = 0; iCnt <iLength; iCnt++)
        {
            System.out.println(Arr[iCnt]);    
        }

        boolean bRet = ChkOccurance(Arr,iLength,iNo);
        if(bRet == true)
        {
            System.out.println(iNo + "is present in array");
        }
        else
        {
            System.out.println(iNo + "is not present in array");
        }
    }
}