/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.*;
public class OddEven
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("Enter the number:-");
        a=Integer.parseInt(br.readLine());
        
        if(a%2==0)
            System.out.println("The number is Even.");
        else
            System.out.println("The number is odd.");
                    
    }
    
}
