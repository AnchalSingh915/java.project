import java.util.*;
class while21
{
    public static void main(String args[])
    {
        int x=1,y=1;
        Scanner sc=new Scanner(System.in);
        while(x<=4)
        {
            y=1;
            while(y<=4-x)
            {
                System.out.print(" ");
                y=y+1;
            }
            y=1;
            while(y<=x)
            {
                System.out.print(y);
                y=y+1;
            }
            y=y-2;
            while(y>=1)
            {
            System.out.print(y);
            y=y-1;
            }
            System.out.println();
            x=x+1;
            }
        x=1;
        while(x<=3)
        {
         y=1;
         while(y<=x)
         {
            System.out.print(" ");
            y=y+1;
         }
         y=1;
         while(y<=4-x)
         {
            System.out.print(y);
            y=y+1;
         }
         y=y-2;
         while(y>=1)
         {
            System.out.print(y);
            y=y-1;
         }
         System.out.println();
         x=x+1;
        }
   }            
}
    

