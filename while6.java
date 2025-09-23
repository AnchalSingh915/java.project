import java.util.*;
class while6
{
    public static void main(String arg[])
    {
      int x=0,y=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no.");
      x=sc.nextInt();
      while(x>1)
      {
          y=y*x;
          x=x-1;
      }
      System.out.println(y);
    }  
}