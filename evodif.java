import java.util.*;
class evodif
{
    public static void main(String ar[])
    {
       int x=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no.");
       x=sc.nextInt();
       if(x%2==0)
       System.out.println("even"+x);
       else
       System.out.println("odd"+x);
    }  
}