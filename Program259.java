import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize]; 
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter "+Arr.length+ " elements : ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter element no "+ (iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are : ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
        
    }
}

class Program259
{
    public static void main(String args[])
    {
        ArrayX obj = new ArrayX(5);

        obj.Accept();
        obj.Display();
    }
}