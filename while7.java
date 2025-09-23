import java.util.*;
class while7
{
    public static void main(String arg[])
    {
      int a=0,y=0,min=0,max=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no.");
      a=sc.nextInt();
      max=a;
      min=a;
      while(y<9)
      {
          System.out.println("enter any no.");
          a=sc.nextInt();
          y=y+1;
          if(max<a)
          max=a;
          if(min>a)
          min=a;
      }    
      System.out.println("maximum"+max+"minimum"+min);
    }
}  
