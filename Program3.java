import java.util.*;

public class Program3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No1 : ");
        int iNo1 = sc.nextInt();

        System.out.println("Enter No2 : ");
        int iNo2 = sc.nextInt();

        int iMult = iNo1 * iNo2;
        System.out.println("Multiplication is : "+ iMult);

    }
}