/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.*;

public class UppercaseAndLowercase
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char a;
        
		
        System.out.print("Enter a Character : ");
        a=br.readLine().trim().charAt(0);
		
        if(a>='a' && a<='z')
            System.out.println(a + " is a lowercase Alphabet.");
        else if(a>='A' && a<='Z')
            System.out.println(a + " is a uppercase Alphabet.");
        else
            System.out.println(a + " is not an Alphabet");
        
    }
}
    
    

