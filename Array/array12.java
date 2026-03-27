import java.util.*;
class  array12
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i=0,j=0,k=0,pos=0,iv=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("enter the number");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the inserted position");
        pos=sc.nextInt();
        System.out.println("enter the inserted value");
        iv=sc.nextInt();
        j=a[pos];
        a[pos]=iv;
        for(i=pos+1;i<10;i++)
        {
          k=a[i];
          a[i]=j;
          j=k;
        }
        for(i=0;i<10;i++)
        System.out.print(" "+a[i]);
    }
}
        
        