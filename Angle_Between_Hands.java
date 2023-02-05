import java.util.Scanner;
import java.lang.Math;
class angle_btw_hands
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String time;
        time=sc.next();
        String[] times = time.split(":");
        String h=times[0];
        String m=times[1];
        int hh=Integer.parseInt(h);
        int mm=Integer.parseInt(m);
        double ang=Math.abs(30*hh-(5.5*mm));
        double angl=360-ang;
        System.out.println(Math.min(ang,angl));
    }
}
/*
import java.util.Scanner;
class Angle_between
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] time=s.split(":");
        int h=Integer.valueOf(time[0]);
        int m=Integer.valueOf(time[1]);
        double a=Math.abs(30*h-(5.5*m));
        double b=360-a;
        System.out.print(Math.min(a,b));
    }
}
*/