import java.util.*;
class dowhile2
{
    public static void main(String args[])
    {
        int x=1;
        Scanner sc=new Scanner(System.in);
        do
        {
            if(x%2==0)
            System.out.println("even"+x);
            else
            System.out.println("odd"+x);
            x=x+1;
        }
        while(x<=100);
    }
}
