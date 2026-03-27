import java.util.*;
class arr2D11
{
    public static void main(String args[])
    {
        int a[][]=new int[3][3];
        int i=0,j=0,k=0,l=0,m=0;
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
                     l=j+1;
                      if(l>2)
                      {
                        k=i+1;
                        l=0;
                      }
                
                      else
                      k=i;
                       for(;k<3;k++)
                       {
                        for(;l<3;l++)
                        {
                           if(a[i][j]>a[k][l])
                           {
                             m=a[i][j];
                             a[i][j]=a[k][l];
                             a[k][l]=m;
                           }
                        }
                        l=0;
                       }
                }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
              System.out.print(a[i][j]);
             System.out.println();
        }
    }
}

        
