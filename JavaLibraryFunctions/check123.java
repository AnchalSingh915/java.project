import java.util.*;
class check123
{
    public static void main(String ar[])
    {
        int a[]=new int[5];
        int i=0;
        Scanner sc=new Scanner(System.in);
        try
        {
              for(i=0;i<5;i++)
             {
               System.out.println("enter the no");
               a[i]=sc.nextInt();
              }
              for(i=0;i<=5;i++)
             {
               System.out.println(a[i]);
               }
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
        
            
    }
}