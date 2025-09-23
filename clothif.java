import java.util.*;
class clothif
{
    public static void main(String ar[])
    {
       int tc=0 ,dis=0,ta=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the total cost");
       tc=sc.nextInt();
       if(tc<=2000)
       {
       dis=(tc*5);
       dis=dis/100;
       }
       else if(tc>2000 && tc<=5000)
       dis=((tc-2000)*25)/100+100;
       else if(tc>5000 && tc<=10000)
       dis=((tc-5000)*35)/100+100+750;
       else if(tc>10000)
       dis=((tc-10000)*50)/100+100+750+1750;
       System.out.println("total discount"+dis);
       ta=tc-dis;
       System.out.println("total amount paid"+ta);
    }  
}