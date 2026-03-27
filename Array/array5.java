import java.util.*;
class array5
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0,s=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the no.");
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
        s=s+a[i];
        }
        System.out.print("sum of all the element"+s);
    }
}


