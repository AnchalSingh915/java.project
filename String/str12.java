import java.util.*;
class str12
{    
        public static void main (String arr[])
        {
            //function for trim
            Scanner sc=new Scanner (System.in);
            String str1= " I love india ";
            System.out.println("the string str1 is:"+str1+ "(with extra space)");
            System.out.println("string length is:" +str1.length());
            String str2=str1.trim();
            System.out.println("the string str2 is:" +str2+"(without extra space)");
            System.out.println("string length is:" +str2.length());
        }
}
            
