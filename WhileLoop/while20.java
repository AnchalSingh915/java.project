import java.util.*;
class while20
{
    public static void main(String args[])
    {
        int x=1,y=0,z=0;
        Scanner sc=new Scanner(System.in);
        while(x<=5)
        {
            z=x%2;
            y=1;
            while(y<=x)
            {
                System.out.print(z);
                z=1-z;
                y=y+1;
            }
            System.out.println();
            x=x+1;
        }
    }
}
