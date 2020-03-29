/*
 t1=n1*n1-1
 t2=n2*n2-1
 t3=n3*n3-1
 */
package series;
import java.io.*;
public class Series_0_3_8_15 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,i,s=0;
        System.out.print("Enter the number of terms:-");
        n=Integer.parseInt(br.readLine());
        
        for(i=1;i<=n;i++)
        {
            s=i*i-1;
            System.out.println(s);
        }
        
    }
    
    
            
    
}
