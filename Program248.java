import java.util.*;

class Arithmatic
{
    public int Addition(int i, int j)
    {
        int Sum = 0;
        Sum = i + j;
        return Sum;
    }
}

class Program248
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter First Number : ");
        iNo1 = sc.nextInt();

        System.out.println("Enter First Number : ");
        iNo2 = sc.nextInt();

        Arithmatic aobj = new Arithmatic();
        iAns = aobj.Addition(iNo1, iNo2);

        System.out.println("Addition is : "+iAns);
    }
}