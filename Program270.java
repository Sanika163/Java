import java.util.*;

class MarvellousX
{
    public void Display(String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}

class Program270
{
    public static void main(String Arr[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String str = sc.nextLine();

        MarvellousX obj = new MarvellousX();
        obj.Display(str);

    }
}