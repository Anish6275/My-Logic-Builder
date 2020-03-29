/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.*;
public class LeapYear 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("Enter the Year:-");
        a=Integer.parseInt(br.readLine());
        
       
        
        if(a%400==0)
            System.out.println("It's a leap Year.");
         
        else if(a%4==0)
            System.out.println("It's a leap Year.");
        else
            System.out.println("It's not a leap Year.");
    }
}
