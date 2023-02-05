import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char x;
        x=sc.nextLine().charAt(0);
        if(x=='a'||x=='i'||x=='o'||x=='e'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}