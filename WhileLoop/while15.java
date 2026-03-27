import java.util.*;
class while15
{
    public static void main(String args[])
    {
        int x=0,y=1,z=0,l=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        x=sc.nextInt();
        l=x*x;
        while(l>0)
        {
            y=l%10;
            z=z+y;
            l=l/10;
        }
        if(z==x)
        System.out.println("neon no.");
        else
        System.out.println("not neon no.");
    }    
}