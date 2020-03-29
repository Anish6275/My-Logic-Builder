/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.*;
public class TriangleValidity 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double a,b,c;
        System.out.print("Enter the first angle:-");
        a=Double.parseDouble(br.readLine());
        System.out.print("Enter the second angle:-");
        b=Double.parseDouble(br.readLine());
        System.out.print("Enter the third angle:-");
        c=Double.parseDouble(br.readLine());
        
        if(a+b+c==180 && a!=0 && b!=0 && c!=0)
            System.out.println("It's a triangle.");
        else 
            System.out.println("It's not a triangle.");
        
        
    }

    
    
}
