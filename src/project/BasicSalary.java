/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.*;
public class BasicSalary
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double bs,hra,da,gs;
        System.out.print("Enter the basic salary:-");
        bs=Double.parseDouble(br.readLine());
                if(bs<=10000)
                {
                    hra=20*bs/100;
                    da=80*bs/100;
                    
                }        
                else if(bs<=20000)
                {
                    hra=25*bs/100;
                    da=90*bs/100;
                    
                }        
                
                else
                {
                    hra=30*bs/100;
                    da=95*bs/100;
                    
                }
                gs=bs+da+hra;
                System.out.println("The Gross salary is "+gs);
            
    }
}
