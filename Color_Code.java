import java.util.Scanner;
class color{
    public static void main(String args[]){
        Scanner n= new Scanner(System.in);
        char i=n.next().charAt(0);
        if(i=='V'|| i=='v'){
            System.out.println("Violet");
        }
        else if(i=='I' || i=='i'){
            System.out.println("Indigo");
        }
         else if(i=='B' || i=='b'){
            System.out.println("Blue");
        }
         else if(i=='G' || i=='g'){
            System.out.println("Green");
        } 
        else if(i=='Y' || i=='y'){
            System.out.println("Violet");
        }
         else if(i=='O' || i=='o'){
            System.out.println("Orange");
        }
         else if(i=='R' || i=='r'){
            System.out.println("Red");
        }
         else{
            System.out.println(-1);
        }
    }
}