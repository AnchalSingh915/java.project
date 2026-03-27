import java.util.*;
class ques2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=" ",str1=" ";
        char ch;
        int i=0,l=0;
        System.out.println("enter the string");
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                l=str1.length()-1;
                for(;l>=0;l--)
                System.out.print(str1.charAt(l));
                str1=" ";
            }
            else
            str1=str1+ch;
        }
        l=str1.length()-1;
        for(;l>=0;l--)
        System.out.print(str1.charAt(l));
    }
}
             
    

