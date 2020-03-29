/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package series;
import java.io.*;
public class Series1_123_1234 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=0,i,n;
        System.out.print("Enter the number of terms:-");
        n=Integer.parseInt(br.readLine());
        
        for(i=1;i<=n;i++)
        {
            s=10*s+i;
            System.out.println(s);
        }
        
        
    }
    
}
