import java.util.*;

class Program68
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Elements : ");

        int Arr[];
        int iCnt = 0;

        Arr = new int[5];

        for(iCnt = 0; iCnt < 5; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }

        System.out.println("Elements of Array are : ");
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }


    }
}