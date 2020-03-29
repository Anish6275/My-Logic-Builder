/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTry;

import java.io.*;
public class Triangle
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double s1,s2,s3,s,ar,a1,a2,a3,h,r;
        System.out.print("Enter the length of first side:-");
        s1=Double.parseDouble(br.readLine());
        System.out.print("Enter the length of second side:-");
        s2=Double .parseDouble(br.readLine());
        System.out.print("Enter the length of third side:-");
        s3=Double.parseDouble(br.readLine());
        
        if(s1+s2>s3 && s2+s3>s1 && s3+s1>s2)
        {
            System.out.println("Triangle is possible!");
           
            //
            if(s1==s2 && s2==s3 && s3==s1)
                System.out.println("\nEquilateral Triangle!");
            else if(s1==s2 || s2==s3 || s3==s1)
                System.out.println("\nIsoscales Triangle!");
            else
                System.out.println("\nScalen Triangle!");
            //
            
            s=(s1+s2+s3)/2;  //Heron Formula (semi perimeter).
            ar=Math.sqrt(((s)*(s-s1)*(s-s2)*(s-s3))); //Heron Formula (area)
            System.out.println("\nThe area is:-"+ar+"unit².");
            
            a1=(s1/(s1+s2+s3))*180;  // for finding angle 
            a2=(s2/(s1+s2+s3))*180;  // for finding angle 
            a3=(s3/(s1+s2+s3))*180;  // for finding angle 
            
            System.out.println("\nThe three angles will be:- "+a1+"º and "+a2+"º and "+a3+"º.");
            
            
            h=2*ar/s2; //For finding height by the formula area = 1/2 x base x height.
            System.out.println("\nThe height will be (from any one side):-"+h+"unit.");
        }
        else
            System.out.println("Triangle not possible!");
            
            
            
            
            
        
        
    }
    
}
