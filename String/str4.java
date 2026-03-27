import java.util.*;
class str4
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
                if(ch==' ')
                c=c+1;
            }
            System.out.print(str.charAt(0)+".");
              for(i=0;i<str.length();i++)
              {
                  ch=str.charAt(i);
                if(ch==' ')
                {
                   c1=c1+1;
                  if(c1<c)
                   System.out.print(str.charAt(i+1)+".");
                  else
                  {
                      for(j=i+1;j<str.length();j++)
                      {
                      System.out.print(str.charAt(j));
                      }
                  }    
                }
              }
      }
}
              
    
                  
              