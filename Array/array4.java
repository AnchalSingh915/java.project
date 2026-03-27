import java.util.*;
class array4
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0,c=0,n=0,o=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the no.");
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
         c=0;
         for(n=1;n<=a[i];n++)
         {
             if(a[i]%n==0)
             c=c+1;
         }
         if(c==2)
         {
             o=o+1;
             System.out.println("prime no."+a[i]);
         }
         else
         System.out.println("non prime no."+a[i]);
        }
        System.out.print("number of prime number"+o);
    }
}



