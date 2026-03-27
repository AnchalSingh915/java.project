import java.util.*;
class str1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1,str;
        int x=0;
        System.out.println("enter the username");
        str=sc.nextLine();
        System.out.println("enter the password");
        str1=sc.nextLine();
        if(str.equals("infomax"))
           if(str1.equals("123"))
           System.out.println("welcome to infomax computer academy");
           else
            x=1;
       else
          x=1;
        if(x==1)
        System.out.println("user_name/password is incorrect");
    }
}  
            