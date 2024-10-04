import java.util.*;

class Program31
{

    public static void DisplayFactors(int iNo)
    {
        for(int iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int i = sc.nextInt();

        System.out.println("Factors of "+i+" are : ");
        DisplayFactors(i);

    }
}