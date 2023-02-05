import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        if(x<0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Positive Number");
        }
    }
}