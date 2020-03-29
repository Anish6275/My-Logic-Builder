/*
  :PATTERN:
  
 */

package SERIES;
import java.io.*;
public class Series_1_n3_5_n7_9 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,n,a;
        System.out.print("Enter the number of terms you want:-");
        n=Integer.parseInt(br.readLine());
        
        for(i=1;i<=n;i++)
        
            if(i%2==0)
            System.out.println("-"+(2*i-1));
            else
                System.out.println(2*i-1);
            
        
    }
}
