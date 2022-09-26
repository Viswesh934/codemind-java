import java.util.Scanner;
class season{
    public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    int m=n.nextInt();
    if (m==4 || m==5 || m==6){
        System.out.println("Summer");
    }
      else if (m==7 || m==8 || m==9 || m==10){
        System.out.println("Rainy");
    }
      else if (m==11 || m==12 || m==1){
        System.out.println("Winter");
    }
    else if(m==2 || m==3){
        System.out.println("Spring");
    }
    else{
        System.out.println(-1);
    }
        
    }
}