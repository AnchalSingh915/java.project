import java.util.*;
class for5
{
    public static void main(String ar[])
    {
       int x=0,y=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no.");
       x=sc.nextInt();
       for(;y<=x;y++)
       {
           if(x%y==0)
             System.out.println(y);
       }
    }   
}
