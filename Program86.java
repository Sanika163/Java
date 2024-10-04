import java.util.*;

class Program86
{
    public static int ChkLastOccurance(int[] Arr, int iSize, int iNo)
    {
        int iCnt = 0;
        for(iCnt = iSize-1; iCnt >= 0; iCnt--)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
        }
        return iCnt;
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

        System.out.println("Enter number to find its occurance position : ");
        int iNo = sc.nextInt();

        System.out.println("Elements of Array are : ");
        for(iCnt = 0; iCnt <iLength; iCnt++)
        {
            System.out.println(Arr[iCnt]);    
        }

        int iRet = ChkLastOccurance(Arr,iLength,iNo);
        if(iRet == -1)
        {
            System.out.println(iNo + " is not present in array");
        }
        else
        {
        System.out.println(iNo + " is occured at position : "+ iRet);
        }
    }
}