import java.util.*;

public class Program8
{
    public static boolean DivisibleByFive(int i)
    {
        if(i % 5 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int iNo = sc.nextInt();
        boolean bRet = DivisibleByFive(iNo);

        if(bRet == false)
        {
            System.out.println(iNo+ " is not divisible by 5");
        }
        else
        {
            System.out.println(iNo+ " is divisible by 5");
        }
    }
}