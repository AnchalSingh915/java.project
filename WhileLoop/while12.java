import java.util.*;
class while12
{
    public static void main(String args[])
    {
        int x=0,y=0,z=1,a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        x=sc.nextInt();
        while(x>0)
        {
            a=x%10;
            y=y+a;
            z=z*a;
            x=x/10;
        }    
        if(z==y)
        System.out.println("spy no.");
        else
        System.out.println("not spy no.");
    }
}

