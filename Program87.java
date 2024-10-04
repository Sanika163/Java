import java.util.*;

class Program87
{
    public static int ChkLastOccurance(int[] Arr, int iSize, int iNo)
    {
        int iCnt = 0, iPos = -1;
        for(iCnt = iSize-1; iCnt>=0; iCnt--)
        {
            if(iNo == Arr[iCnt])
            {
                iPos = iCnt;
                break;
            }
        }
        return iPos;
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

        System.out.println("Enter Element to find its last occurance : ");
        int iNo = sc.nextInt();

        int iRet = ChkLastOccurance(Arr,iLength,iNo);
        if(iRet == -1)
        {
            System.out.println(iNo + " is not present in array");
        }
        else
        {
            System.out.println(iNo + " is present in array at last index : "+ iRet);
        }
    }
}