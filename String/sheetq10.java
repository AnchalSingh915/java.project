import java.util.*;
class sheetq10
{
    public static void main(String args[])
    {
        String str=" ",str1=" ";
        char ch;
        int i=0,v=0,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        str=sc.nextLine();  
        for(i=0;i<str.length();i++)
        {
          ch=str.charAt(i);
          if(ch==' ')
          {
            for(v=0;v<str1.length()-1;v++)
              if(str1.charAt(v)==str1.charAt(v+1))
               t=1;
              if(t==1)
              {
               System.out.print(str1);
              }
              str1=" ";
              t=0;
              v=0;
          }
           else
          {
              str1=str1+ch;
          }
        }
        for(v=0;v<str1.length()-1;v++)
              if(str1.charAt(v)==str1.charAt(v+1))
               t=1;
              if(t==1)
              {
               System.out.print(str1);
              }
    }       
}


             
 