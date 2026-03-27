import java.util.*;
class arr2D7
{
    public static void main(String ar[])
    {
     int a[][]=new int[4][4];
     int i=0,j=0,s=0;
     Scanner sc=new Scanner(System.in);
     for(i=1;i<=3;i++)
     {
         for(j=1;j<=3;j++)
         {
             System.out.println("enter the no.");
             a[i][j]=sc.nextInt();
         }
     }
     for(i=1;i<=3;i++)
     {
         for(j=1;j<=i;j++)
         {
             
             System.out.print(a[i][j]);
         }    
         System.out.println();
     }
     }
}
