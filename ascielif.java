import java.util.*;
class ascielif
{
    public static void main(String ar[])
    {
       char ch=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the character");
       ch=sc.next().charAt(0);
       if(ch>=65 && ch<=90||ch>=97 && ch<=122)
       System.out.println("character"+ch);
       else if(ch>=48 && ch<=57)
       System.out.println("number"+ch);
       else
       System.out.println("special symbol"+ch);
    }  
}