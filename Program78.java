import java.util.*;

class Program78
{
    public static int CountFrequency(int[] Arr, int iSize, int iNo)
    {
        int iCnt = 0, iFrequency = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iFrequency++;
            }
        }
        return iFrequency;
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

        System.out.println("Enter number to find its frequency : ");
        int iNo = sc.nextInt();

        System.out.println("Elements of Array are : ");
        for(iCnt = 0; iCnt <iLength; iCnt++)
        {
            System.out.println(Arr[iCnt]);    
        }

        int iRet = CountFrequency(Arr,iLength,iNo);
        System.out.println("Frequency of " + iNo + " is : "+ iRet);
    }
}