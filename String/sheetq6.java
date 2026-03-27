import java.util.*;
class sheetq6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="",original="",reverse="";
        char ch;
        int i=0,t=0,l=0,v=0;
        System.out.println("enter the string");
        str=sc.nextLine(); 
        System.out.print("palindrome words are:   ");
        for(i=0;i<str.length();i++)
        {
         ch=str.charAt(i);
                 if(ch==' ')
                 {
                   l=original.length();
                   for(t=l-1;t>=0;t--)
                   {
                    reverse=reverse+original.charAt(t);
                   }
                     if((original.trim()).equalsIgnoreCase(reverse.trim()))
                       System.out.print(original);
                      original=" ";
                      reverse=" ";
                     
                 }
                 else
                  {
                      original=original+ch;
                  }
        }
        l=original.length();
        for(t=l-1;t>=0;t--)
        {
         reverse=reverse+original.charAt(t);
        }
          if((original.trim()).equalsIgnoreCase(reverse.trim()))
           System.out.print(original);      
    }
}
        
                    
