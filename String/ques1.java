import java.util.*;
class ques1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="This is a lovely day";
        String str="";
        char ch;
        int i=0;
        for(i=0;i<s .length();i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
             System.out.println(str);
             str="";
            }
            else
            { 
                str=str+ch;
           }
        }
        System.out.println(str);
    }
}