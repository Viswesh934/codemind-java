import java.util.*;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(n<3 || n>100)
            System.out.println("The pattern is not possible");
        else{
            for(int i=1;i<=(n*2)-1;i++)
            {
                if(i<=n){
                    System.out.println("*".repeat(i));
                }
                else{
                    int s=(n*2)-i;
                    System.out.println("*".repeat(s));
                }
            }
        }
    }
}