import java.util.*;
class str3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=" ",str1=" ";
        int i=0,l=0;
        System.out.println("enter the string");
        str=sc.nextLine();
        l=str.length();
        for(i=l-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }   
        System.out.println("second"+str1);
            if(str.equals(str1.trim()))
            System.out.println("Palindrome");
            else
            System.out.println("Not Palindrome");
        
    }
}
            
