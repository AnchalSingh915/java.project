import java.util.*;
class sheetq1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="",str1="";
        char ch;
        int i=0;
        System.out.println("enter the string");
        str=sc.nextLine(); 
        for(i=0;i<str.length();i++)
        {
         if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||
         str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
         {
          ch=str.charAt(i);
          str1=str1+ch;
         }
        }
        System.out.println("vowels in string"+str1);
    }
}