import java.util.*;

class Arithmatic
{
    public int iValue1;
    public int iValue2;

    public Arithmatic(int i, int j)
    {
        iValue1 = i;
        iValue2 = j;
    }

    public int Addition()
    {
        return iValue1+iValue2;
    }
}

class Program249
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iNo1,iNo2);
        iAns = aobj.Addition();

        System.out.println("Addition is : "+iAns);
    } 
}