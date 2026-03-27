import java.util.*;
class arrar7
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0,sv=0,c=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the no.");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the search value");
        sv=sc.nextInt();
        for(i=0;i<10;i++)
        {
          if(a[i]==sv)
          {
              c=c+1;
          System.out.println("value has been found and position is:"+i);
          }
        }
        System.out.println("no.of occurance is:"+c);
    }
}



