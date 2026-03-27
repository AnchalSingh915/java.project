import java.util.*;
class while16
{
    public static void main(String args[])
    {
        int a=0,b=0,c=0,d=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        a=sc.nextInt();
        b=a;
        while(a>0)
        {
            c=a%10;
            d=d+c;
            a=a/10;
        }
        if(b%d==0)
        System.out.println("niven no.");
        else
        System.out.println("non niven no.");
    }    
}
