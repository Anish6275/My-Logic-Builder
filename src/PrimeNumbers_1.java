
import java.io.*;
public class PrimeNumbers_1 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,i,c=0;
        System.out.print("Enter the Number:-");
        n=Integer.parseInt(br.readLine());
        
        if(n==0)
            System.out.println("0 is neither prime nor composite.");
        else
        {
            for(i=2;i<=n-1;i++)
                if(n%i==0)
                    c++;
            if(c==0)
                System.out.println(n+" is a Prime number.");
            else
                System.out.println(n+" is a Composite number.");
        }
    }
}    

