import java.util.*;

class Program247
{
    static int Addition(int i, int j)
    {
        int Sum = 0;
        Sum = i + j;
        return Sum;
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter First Number : ");
        iNo1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        iNo2 = sc.nextInt();

        iAns = Addition(iNo1, iNo2);

        System.out.println("Additio is : "+ iAns);
    }
}