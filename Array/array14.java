import java.util.*;
class  array14
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the value");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the deleted position");
        j=sc.nextInt();
        for(i=j;i<9;i++)
        a[i]=a[i+1];
        for(i=0;i<9;i++)
        System.out.print(a[i]+"\t");
    }
}
        
        
