import java.util.*;
class while19
{
    public static void main(String args[])
    {
        int x=1,y=0;
        Scanner sc=new Scanner(System.in);
        while(x<=5)
        {
            y=x;
            while(y>=1)
            {
                System.out.print(y);
                y=y-1;
            }
            System.out.println();
            x=x+1;
        }
    }
}
