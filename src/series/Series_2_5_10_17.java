/*
  :PATTERN:
  t1=n1*n1+1;
  t2=n2*n2+1;
  t2=n3*n3+1;
 */
package SERIES;
import java.io.*;
public class Series_2_5_10_17 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,n,a,x=0;
        System.out.print("Enter the number of terms you want:-");
        n=Integer.parseInt(br.readLine());
        
        
        for(i=1;i<=n;i++)
           
        {
                x=i*i+1;
                System.out.println(x);
                
        }
           
            
        
    }
}