import java.util.Scanner;
import java.io.*;
import java.lang.*;
class area{
    public static void main(String args[]){
        Scanner n= new Scanner(System.in);
        float a=n.nextFloat();
        float b=n.nextFloat();
        float c=n.nextFloat();
        float s;
        s=(a+b+c)/2;
         if (a < 0 || b < 0 || c <0 || (a+b <= c) ||
            a+c <=b || b+c <=a)
        {
            System.out.println("Not a valid triangle");
            System.exit(0);
        }
        
        else{
        double ar;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(String.format("%.2f",ar));}
        
    }
}