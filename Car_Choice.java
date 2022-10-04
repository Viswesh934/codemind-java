import java.util.Scanner;
class cars{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int i=0;
        while(i<t){
            
        
        float x1=s.nextFloat();
        float x2=s.nextFloat();
        float y1=s.nextFloat();
        float y2=s.nextFloat();
        double c1;
        double c2;
        c1=(y1/x1);
        c2=(y2/x2);
       /* System.out.println(y1);
        System.out.println(x1);
        System.out.println(y2);
        System.out.println(x2);*/
        if(c2<c1){
            System.out.println("1");
        }
        else if(c1==c2){
            System.out.println("0");
        }
        else if(c2>c1){
            System.out.println("-1");
        }
        else{
            break;
        }
            i++;
        }
    }
}