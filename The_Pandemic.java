import java.util.Scanner;
class avoid{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        if(h==1){
            System.out.println(0);
        }
        else if(h<=2){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }
    }
}