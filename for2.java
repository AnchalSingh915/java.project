import java.util.*;
class for2
{
    public static void main(String ar[])
    {
       int x=0;
       Scanner sc=new Scanner(System.in);
       for(;x<=100;x++)
       {
           if(x%2==0)
             System.out.println("even"+x);
           else
             System.out.println("odd"+x);
       }
    }   
}