/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.*;
public class Marks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double p,c,m,b,co,per,g;
        System.out.print("Enter the marks in Mathematics:-");
        m=Double.parseDouble(br.readLine());
        System.out.print("Enter the marks in Biology:-");
        b=Double.parseDouble(br.readLine());
        System.out.print("Enter the marks in Physics:-");
        p=Double.parseDouble(br.readLine());
        System.out.print("Enter the marks in Chemistry:-");
        c=Double.parseDouble(br.readLine());
        System.out.print("Enter the marks in Computer:-");
        co=Double.parseDouble(br.readLine());
        
        per=(m+b+p+c+co)/500*100;
        
        System.out.println("The percentage is "+per+"%");
       
        System.out.print("The grade is ");
        if(per>=90)
            System.out.println("A");
        else if(per>=80)
            System.out.println("B");
        else if(per>=70)
            System.out.println("C");
        else if(per>=60)
            System.out.println("D");
        else if(per>=40)
            System.out.println("E");
        else 
            System.out.println("F");
        
        
    }
    
}
