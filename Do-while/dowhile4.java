import java.util.*;
class dowhile4
{
    public static void main(String args[])
    {
        int x=0,y=1,z=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        x=sc.nextInt();
        do
        {
            if(x%y==0)
            z=z+1;
            y=y+1;
        }
        while(y<=x);
        if(z==2)
         System.out.println("prime no."+x);
        else
         System.out.println("non prime no."+x);
    }
}

