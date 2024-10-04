import java.util.*;

class Program269
{
    public static void main(String Arr[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}