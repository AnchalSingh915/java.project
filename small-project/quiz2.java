import java.util.*;
class quiz2
{
    public static void main(String args[])
    {
        String str1,str;
        int c=0,o=0,a=0,b=0,q=0,d=0,x=0;
        Scanner sc=new Scanner(System.in);
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
         {
         System.out.println("user_name/password is incorrect");
         }
         if(x==1)
         {
             System.exit(0);
         }
        System.out.println("who is the father of biology?");
        System.out.println("1. Aristotle       2.carlous linneus        3.ernest hackel      4.drawin ");
        System.out.println("enter your choice");
        o=sc.nextInt();
        if(o==1)
        {
         System.out.println("answer is correct");    
         c=c+1;
        }
        System.out.println("who is the president of india?");
        System.out.println("1. narendra modi       2.rahul gandhi        3.draupati murmur      4.none  ");
        a=sc.nextInt();
        if(a==3)
        {
         System.out.println("answer is correct");    
         c=c+1;
        }
        System.out.println("capital of india?");
        System.out.println("1. Amritsar       2.new delhi        3.mumbai      4.kolkata ");
        b=sc.nextInt();
        if(b==2)
        {
         System.out.println("answer is correct");    
         c=c+1;
        }
        System.out.println("national animal of india?");
        System.out.println("1. tiger       2.lion        3.elephant      4.lepord ");
        q=sc.nextInt();
        if(q==1)
        {
         System.out.println("answer is correct");    
         c=c+1;
        }
        System.out.println("highest mountain of the world?");
        System.out.println("1. kanchanjunga       2.kailash        3.mount tabu      4.mount everest ");
        d=sc.nextInt();
        if(d==4)
        {
         System.out.println("answer is correct");    
         c=c+1;
        }
        System.out.println("total marks"+c);
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
