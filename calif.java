import java.util.*;
class calif
{
    public static void main(String ar[])
    {
       int x=0,y=0,z=0,l=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("1. for +");
       System.out.println("2. for -");
       System.out.println("3. for *");
       System.out.println("4. for /");
       System.out.println("5. for exit");
       System.out.println("enter the choice");
       x=sc.nextInt();
           if(x==1)
           {
               System.out.println("enter the first no.");
               y=sc.nextInt();
               System.out.println("enter the second no.");
               z=sc.nextInt();
               l=y+z;
               System.out.println("output is"+l);
            }
           if(x==2)
           {
               System.out.println("enter the first no.");
               y=sc.nextInt();
               System.out.println("enter the second no.");
               z=sc.nextInt();
               l=y-z;
               System.out.println("output is"+l);
            }
           if(x==3)
           {
               System.out.println("enter the first no.");
               y=sc.nextInt();
               System.out.println("enter the second no.");
               z=sc.nextInt();
               l=y*z;
               System.out.println("output is"+l);
            }
           if(x==4)
           {
               System.out.println("enter the first no.");
               y=sc.nextInt();
               System.out.println("enter the second no.");
               z=sc.nextInt();
               l=y/z;
               System.out.println("output is"+l);
            }
           if(x==5)
           {
               System.exit(0);
            }
           if(x>5)               
               System.out.println("Invalid value");
            }
        }
    