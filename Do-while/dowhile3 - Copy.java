import java.util.*;
class dowhile3
{
    public static void main(String args[])
    {
        int x=1;
        Scanner sc=new Scanner(System.in);
        do
        {
            if(x%7==0||x%10==7)
            System.out.println("buzz"+x);
            else
            System.out.println("non buzz"+x);
            x=x+1;
        }
        while(x<=100);
    }
}
