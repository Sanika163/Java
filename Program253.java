import java.util.*;

class Numbers
{
    public void EvenFactorsDisplay(int iNo)
    {
        int iCnt = 0;
        System.out.println("Even Factor is : ");

        for(iCnt = 2; iCnt <= (iNo/2); iCnt+=2)
        {
            if(((iNo % iCnt) == 0) && ((iCnt % 2) == 0))
            {
                System.out.println(iCnt +"\t");
            }
        }
    }
}

class Program253
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Number : ");
        int iNo = sc.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactorsDisplay(iNo);
    }
}