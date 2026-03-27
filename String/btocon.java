 import java.util.*;
class btocon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d[]=new int[10];
        int a,c,x=1,l=0,k,t,b=0;
        System.out.println("enter the no. in the binary form");
        a=sc.nextInt();
        for(;a>0;)
        {
          k=a%1000;
          c=k;
          l=0;
          x=1;
          for(;c>0;)
          {
          t=c%10;
          if(t==1)
          l=l+x;
          x=x*2;
          c=c/10;
          }
          d[b++]=l;
          a=a/1000;
        }
        b--;
        for(;b>=0;b--)
        System.out.print(d[b]);
    }   
}