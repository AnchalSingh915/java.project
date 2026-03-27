import java.util.Scanner;
class UsingScanner
{
    public static void main(String args[])
    {
        System.out.println("enter few numbers");
        Scanner os=new Scanner(System.in);
        int num=0;
        while(os.hasNextInt())//anything else then integer
        {
            num=os.nextInt();
            if(num%2!=0)
            {
                System.out.println(num);
            }
        }
    }
}
