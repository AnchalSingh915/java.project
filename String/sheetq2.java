import java.util.*;
class sheetq2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="",str1="";
        char ch;
        int i=0,v=0,c=0;
        System.out.println("enter the string");
        str=sc.nextLine(); 
        for(i=0;i<str.length();i++)
        {
         if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||
         str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
         {
          v=v+1;
         }
         else
         c=c+1;
        }
        System.out.println("vowels in the string"+v+"consonant in the string including spaces"+c);
    }
}
