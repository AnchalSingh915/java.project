import java.util.*;
class arr2D3
{
    public static void main(String ar[])
    {
     int a[][]=new int[3][3];
     int b[][]=new int[3][3];
     int c[][]=new int[3][3];
     int i=0,j=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the first array");
     for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {
             System.out.println("enter the no.");
             a[i][j]=sc.nextInt();
         }
     }
     System.out.println("enter the second array");
     for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {
             System.out.println("enter the no.");
             b[i][j]=sc.nextInt();
         }
     }
     for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {
             c[i][j]=a[i][j]+b[i][j];
         }
     }
     System.out.println("output is");
     for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {
             System.out.print(" "+c[i][j]);
         }
         System.out.println();
     }
    }
}
            