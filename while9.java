import java.util.*;
class while9
{
    public static void main(String args[])
    {
        int x=0,y=1,z=0,l=0,u=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        l=sc.nextInt();
        if(y<=l)
        System.out.print(x+" "+y);
        z=x+y;
        u=x+y;
        while(z<=l)
        {
            if(z<=l)
            {
                System.out.print(" "+z);
            }
            u=u+z;
            x=y;
            y=z;
            z=x+y;
        }
        System.out.println();
        System.out.println("total sum is"+u);
    }
}    
        