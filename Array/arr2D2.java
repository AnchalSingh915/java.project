import java.util.*;
class arr2D2
{
    public static void main(String ar[])
    {
     int a[][]=new int[3][3];
     int i=0,j=0;
     Scanner sc=new Scanner(System.in);
     for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {
             System.out.println("enter the no.");
             a[i][j]=sc.nextInt();
         }
     }
     for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {
             if(a[i][j]%2==0)
             System.out.print(" "+a[i][j]+"even");
             else
             System.out.print(" "+a[i][j]+"odd");
         }
         System.out.println();
     }
    }
}    
