package FIND_CHECKING;
import java.io.*;
public class ArmstrongNumber {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n,x,a,s=0,i;
        System.out.print("Enter the number:-");
        n=Integer.parseInt(br.readLine());
        System.out.println("The Armstrong numbers are:-");
        
        for(i=1;i<=n;i++)
        {
            x=a=i;
            while(a>0)
            {
                s+=(a%10)*(a%10)*(a%10);
                a/=10;
            }
            if(x==s)
            {
                System.out.println(s);
            }
        }
    }    
}
