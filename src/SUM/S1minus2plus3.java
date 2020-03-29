package SUM;
import java.io.*;
public class S1minus2plus3 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s1=0,s2=0,s,i,n;
        System.out.print("Enter the number of terms:-");
        n=Integer.parseInt(br.readLine());
        
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
                s1+=i;
            else
                s2+=i;           
        }
        s=s2-s1;
        System.out.println("The sum is:-"+s);
    }
}
