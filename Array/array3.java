import java.util.*;
class array3
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
        if(a[i]%7==0||a[i]%10==7)
        System.out.println("buzz"+a[i]);
        else
        System.out.println("non buzz"+a[i]);
    }
}


