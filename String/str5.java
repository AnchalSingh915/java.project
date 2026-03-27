import java.util.*;
class str5
{    
        public static void main (String arr[])
        {
            Scanner sc=new Scanner (System.in);
            String str;
            char ch;
            int c=0,c1=0,i=0,j=0;
            System.out.print("enter the string");
            str=sc.nextLine();            
            for(i=0;i<str.length();i++)
            {
                ch=str.charAt(i);
                System.out.print(ch);
                if(ch==' ')
                {
                    break;
                }
            }
            System.out.print("");
            for(i=i-1;i<str.length();i++)
            {
                ch=str.charAt(i);
                if (ch==' ')
                {
                    j=i+1;
                    System.out.print("."+str.charAt(i+1));
                }
            }
            
            for(i=j+1;i<str.length();i++)
            {
                    System.out.print(str.charAt(i));
            }
            
      }
}
              
    
                  
              
