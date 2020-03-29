/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.*;
public class Divisibility
{
    public static void main(String args[])throws IOException
    {
    
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("Enter the number:-");
        a=Integer.parseInt(br.readLine());     
        
        if(a%5==0 && a%11==0)
            System.out.println("It is divisible by 5 and 11");
        else
            System.out.println("It is not divisible by 5 and 11");
    
    
    

    }

    
        
   
    
    
}
