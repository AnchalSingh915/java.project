import java.util.*;
class  array11
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0,j=0,k=0,mi=0,ma=0,sv=0,mid=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
          for(j=i+1;j<10;j++)
          {
            if(a[i]>a[j])
            {
             k=a[i];
             a[i]=a[j];
             a[j]=k;
            }
          }
        }
        System.out.println("output is");
        for(i=0;i<10;i++)
        System.out.print(" "+a[i]);
        System.out.println("enter the search value");
        sv=sc.nextInt();
        mi=0;
        ma=9;
        while(mi<ma)
        {
            mid=(mi+ma)/2;
            if(a[mid]==sv)
            {
             System.out.println("value has been found and position is :"+mid);
             break;
            }
            if(a[mid]>sv)
            ma=mid-1;
            if(a[mid]<sv)
            mi=mid+1;
        }
    }
}    
     
  
