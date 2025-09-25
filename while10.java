import java.util.*;
class while10
{
    public static void main(String args[])
    {
        int x=0,y=1,a=1,z=0,l=0,m=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the terms");
        l=sc.nextInt();
        if(m<l)
        System.out.print(x+" "+y+" "+a);
        z=x+y+a;
        while(m<l)
        {
            if(m<l)
            System.out.print(" "+z);
            x=y;
            y=a;
            a=z;
            z=x+y+a;
            m++;
        }
    }
}