import java.util.*;
class arr2D8
{
    public static void main(String ar[])
    {
     int a[][]=new int[3][3];
     int i=0,j=0,k=2;
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
             if(j>=k)
             System.out.print(a[i][j]);
             else
             System.out.print(" ");
         }
         k=k-1;
         System.out.println();
     }
    }
}