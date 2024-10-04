import java.util.*;

class Program84
{
    public static void DisplayReverse(int[] Arr, int iSize)
    {
        int iCnt = 0;
        System.out.println("Elements of array in reverse: ");
        for(iCnt = iSize-1; iCnt >= 0; iCnt--)
        {
            System.out.println(Arr[iCnt]);
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

        DisplayReverse(Arr,iLength);
        
    }
}