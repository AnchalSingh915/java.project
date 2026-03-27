import java.util.*;
class array1
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the no.");
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        System.out.println(a[i]);
    }
}


