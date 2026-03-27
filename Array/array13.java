import java.util.*;
class  array13
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0,k=0,pos=0,uv=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the value");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the updated position");
        pos=sc.nextInt();
        System.out.println("enter the updated value");
        uv=sc.nextInt();
        a[pos]=uv;
        for(i=0;i<=9;i++)
        System.out.print(" "+a[i]);
    }
}
        
        
