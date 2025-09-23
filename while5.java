import java.util.*;
class while5
{
    public static void main(String arg[])
    {
      int x=0,y=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no.");
      x=sc.nextInt();
      while(y<x)
      {
          y=y+1;
          if(x%y==0)
          System.out.println(y);
      }
    }  
}      