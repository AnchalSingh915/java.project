 import java.util.*;
class bthcon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d[]=new int[10];
        String z[]=new String[5];
        String str;
        int a,c,x=1,l=0,k,t,b=0,r=0;
        System.out.println("enter the no. in the binary form");
        a=sc.nextInt();
        for(;a>0;)
        {
        k=a%10000;
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
        str=String.valueOf(l);
        
        if(l==10)
        z[r++]="A";
        if(l==11)
        z[r++]="B";
        if(l==12)
        z[r++]="C";
        if(l==13)
        z[r++]="D";
        if(l==14)
        z[r++]="E";
        if(l==15)
        z[r++]="F";
        for(r=0;r<5;r++)
        a=a/10000;
        }
        b--;
        for(;b>=0;b--)
        System.out.print(d[b]);
    }   
}
