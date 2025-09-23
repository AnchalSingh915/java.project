import java.util.*;
class while8
{
    public static void main(String arg[])
    {
      int x=0,y=1,z=0,l=0,m=2;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no.of terms");
      l=sc.nextInt();
      if(m<=l)
      {
          System.out.print(x+" "+y);
          z=x+y;
          while(m<=l)
          {
          if(m<l)
          System.out.print(" "+z);
          x=y;
          y=z;
          z=x+y;
          m++;
          }
      }  
   }
}