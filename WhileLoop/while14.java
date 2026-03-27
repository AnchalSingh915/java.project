import java.util.*;
class while14
{
    public static void main(String args[])
    {
        int a=0,b=0,c=0,d=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        a=sc.nextInt();
        d=a;
        while(a>0)
        {
            b=a%10;
            c=c*10+b;
            a=a/10;
        }    
        if(c==d)
        System.out.println("palindrome no.");
        else
        System.out.println("non palindrome no.");
    }
}

