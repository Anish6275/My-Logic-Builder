/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.*;
public class MaximumOfTwo 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double a,b;
        System.out.print("Enter the first number:-");
        a=Double.parseDouble(br.readLine());
        System.out.print("Enter the second number:-");
        b=Double.parseDouble(br.readLine());
        
        if(a>b)
            System.out.println(a+"is greater than"+b);
        else if(a<b)
            System.out.println(b+"is greater than"+a);
        else
            System.out.println(a+"is equal to"+b);
        
        
    }
    
}
