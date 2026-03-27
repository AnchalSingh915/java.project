import java.util.*;
class array2
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
        if(a[i]%2==0)
        System.out.println("even"+a[i]);
        else
        System.out.println("odd"+a[i]);
    }
}


