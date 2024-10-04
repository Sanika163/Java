import java.util.*;

class Program83
{
    public static int Minimum(int[] Arr, int iSize)
    {
        int iMin = Arr[0], iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;
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

        int iRet = Minimum(Arr,iLength);
        System.out.println("Minimum element of array is : "+iRet);
    }
}