 import java.util.*;
class btdcon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d[]=new int[10];
        int a,c,x=1,l=0;
        System.out.println("enter the no. in the binary form");
        a=sc.nextInt();
        for(;a>0;)
        {
          c=a%10;
          if(c==1)
          l=l+x;
          x=x*2;
          a=a/10;
        }
        System.out.println(l);
    }
}

            
