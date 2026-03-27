import java.util.*;
class useDelimiter
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter the String");
        String st=sc.nextLine();
        
        String st1[]=st.split(" ");
        for(int a=0;a<st1.length;a++)
        {
            System.out.println(st1[a]);
        }
        
    }
}
       

        
        
