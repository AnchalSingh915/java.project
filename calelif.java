import java.util.*;
class calelif
{
    public static void main(String ar[])
    {
       int x=0,y=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("1. for even odd");
       System.out.println("2. for buzz nonbuzz");
       System.out.println("3. for leap year");
       System.out.println("4. for exit");
       System.out.println("enter the choice");
       x=sc.nextInt();
       if(x==1)
           {
               System.out.println("enter the no.");
               y=sc.nextInt();
               if(y%2==0) 
               System.out.println("even"+y);
               else
               System.out.println("odd"+y);
           }    
       else if(x==2)
           {
               System.out.println("enter the no.");
               y=sc.nextInt();
               if(y%7==0||y%10==0) 
               System.out.println("buzz"+y);
               else
               System.out.println("nonbuzz"+y);
           }    
       else if(x==3)
           {
               System.out.println("enter the year");
               y=sc.nextInt();
               if(y%4==0) 
               System.out.println("leap year"+y);
               else
               System.out.println("nonleap year"+y);
           }    
       else if(x==4)
           {
               System.exit(0);
           }    
    }   
}       
               
                     
