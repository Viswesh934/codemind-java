import java.util.Scanner;
class io{
    public static void main(String args[]){
        int n,i;
        Scanner t= new Scanner(System.in);
        n=t.nextInt();
        int c=0;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=t.nextInt();
            if (a[i]%2!=0){
                c++;
            }
        }
        if (c<=2){
            System.out.println("YES");
        }  
        else{
            System.out.println("NO");
        }
        }
}