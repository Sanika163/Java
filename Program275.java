import java.util.*;

class Program275
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();

        char Arr[] = str.toCharArray();
        
        for(int i=0; i< Arr.length; i++)
        {
            System.out.print(Arr[i]);
        }

    }
}