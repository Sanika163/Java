import java.util.*;

class Program82
{
    public static int Maximum(int[] Arr, int iSize)
    {
        int iMax = Arr[0], iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
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

        int iRet = Maximum(Arr,iLength);
        System.out.println("Maximum element of array is : "+iRet);
    }
}