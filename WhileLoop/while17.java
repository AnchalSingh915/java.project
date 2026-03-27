import java.util.*;
class while17
{
    public static void main(String args[])
    {
        int x=1,y=1;
        Scanner sc=new Scanner(System.in);
        while(x<=5)
        {
            y=1;
            while(y<=x)
            {
                System.out.print(y);
                y=y+1;
            }
            System.out.println();
            x=x+1;
        }
    }
}