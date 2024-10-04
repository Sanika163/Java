import java.util.*;

class Program72
{
    public static int Average(int[] Arr, int iSize)
    {
        int iSum = 0;
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum += Arr[iCnt];
        }
        return iSum/iSize;
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

        System.out.println("Elements of Array are : ");
        for(iCnt = 0; iCnt <iLength; iCnt++)
        {
            System.out.println(Arr[iCnt]);    
        }

        int iRet = Average(Arr,iLength);
        System.out.println("Average of array is : "+ iRet);
    }
}