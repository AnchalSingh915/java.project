import java.util.*;
class  array10
{
    public static void main(String args[])
    {
      int a[]=new int[5];
      int b[]=new int[5];
      int c[]=new int[10];
      Scanner sc=new Scanner(System.in);
      int i=0,j=0,k=0;
      System.out.println("for first array");
      for(i=0;i<5;i++)
      {
       System.out.println("enter the number");
       a[i]=sc.nextInt();
      }
      System.out.println("for second array");
      for(i=0;i<5;i++)
      {
       System.out.println("enter the number");
       b[i]=sc.nextInt();
      } 
      for(i=0;i<5;i++)
      {
         for(j=i+1;j<5;j++)
         {
             if(a[i]>a[j])
             {
                 k=a[i];
                 a[i]=a[j];
                 a[j]=k;
             }    
         }    
      }
      for(i=0;i<5;i++)
      {
         for(j=i+1;j<5;j++)
         {
             if(b[i]>b[j])
             {
                 k=b[i];
                 b[i]=b[j];
                 b[j]=k;
             }    
         }    
      }
      i=0;
      j=0;
      k=0;
      while(i<5 && j<5)
      {
         if(a[i]<b[j])
         c[k++]=a[i++];
         else
         c[k++]=b[j++];
      }
      for(;i<5;i++)
      c[k++]=a[i];
      for(;j<5;j++)
      c[k++]=b[j];
      for(i=0;i<k;i++)
      System.out.println(c[i]);
    }
} 
      
 