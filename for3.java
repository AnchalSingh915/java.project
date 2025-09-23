import java.util.*;
class for3
{
    public static void main(String ar[])
    {
       int x=0;
       Scanner sc=new Scanner(System.in);
       for(;x<=100;x++)
       {
           if(x%7==0||x%10==7)
             System.out.println("buzz"+x);
           else
             System.out.println("nonbuzz"+x);
       }
    }   
}
