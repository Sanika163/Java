import java.util.*;

class Program70
{
    public static int Summation(int[] Arr)
    {
        int iSum = 0;
        for(int iCnt = 0; iCnt < 5; iCnt++)
        {
            iSum += Arr[iCnt];
        }
        return iSum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[5];
        int iCnt = 0;

        System.out.println("Enter 5 Elements : ");

        for(iCnt = 0; iCnt <5; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }

        System.out.println("Elements of Array are : ");
        for(iCnt = 0; iCnt <5; iCnt++)
        {
            System.out.println(Arr[iCnt]);    
        }

        int iRet = Summation(Arr);
        System.out.println("Summation of array is : "+ iRet);
    }
}