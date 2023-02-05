import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0,min=0;
            for(int j=0;j<i;j++)
            {
                if(a[j]<a[i]) 
                {
                    c=1;
                    min=a[j];
                }
            }
            if(c==0)
            {
                b[i]=-1;
            }
            else
            {
                b[i]=min;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}