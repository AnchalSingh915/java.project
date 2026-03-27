 import java.util.*;
class sb1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v=0,t=0;
        String str;
        System.out.println("enter the string");
        str=sc.nextLine();
        StringBuffer s=new StringBuffer(str);
        for(v=0;v<s.length();v++)
        {
            for(t=0;t<=v;t++)
            System.out.print(s.charAt(t));
            System.out.println();
        }
    }
}
            
