import java.util.*;
class while13
{
    public static void main(String args[])
    {
        int x=0,y=0,z=0,a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        x=sc.nextInt();
        a=x;
        while(x>0)
        {
            y=x%10;
            z=z+y*y*y;
            x=x/10;
        }    
        if(z==a)
        System.out.println("Armstrong no.");
        else
        System.out.println("non Armstrong no.");
    }
}

