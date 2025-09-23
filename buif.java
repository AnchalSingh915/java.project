import java.util.*;
class buif
{
    public static void main(String ar[])
    {
       int x=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no.");
       x=sc.nextInt();
       if(x%7==0||x%10==7)
       System.out.println("buzz"+x);
       else
       System.out.println("nonbuzz"+x);
    }  
}